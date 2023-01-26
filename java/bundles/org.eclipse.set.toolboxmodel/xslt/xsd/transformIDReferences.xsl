<?xml version='1.0'?>
<!--
    Replaces ID-references in the PlanPro Schema by proper references to the target type. 
    If multiple target types are present, Basis_Objekt is used.

    @author Stuecker
-->
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
    xmlns:func="localhost/function">
    <xsl:output method="xml" encoding="utf-8" indent="yes"/>

    <!-- Default: Copy -->
    <xsl:template match="@*|node()" mode="transformIDReferences">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Match an xs:element which references the nsVerweise-namespace and replace the type attribute -->
    <!-- Only match 1:1 References -->
    <xsl:template match="xs:element[contains(@type, 'nsVerweise:')]/@type" mode="transformIDReferences">
        <!-- Change the type to xs:anyURI. 
             This needs to be set this way so that ecore:reference creates a non-containment reference
             See also https://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf
        -->
        <xsl:attribute name="type">
            <xsl:value-of select="'xs:anyURI'"/>
        </xsl:attribute>

        <!-- Add the ecore:reference attribute to point to the value object -->
        <xsl:attribute name="ecore:reference">
            <!-- Extract the raw type name (without namespace prefix) -->
            <xsl:variable name="name" select="substring-after(., 'nsVerweise:')"/>
            <xsl:variable name="doc" select="document(concat($planproDir, 'Verweise.xsd'))"/>
            <!-- Find the corresponding Objektname/@fixed reference in the Verweise.xsd -->
            <xsl:variable name="pointedTypeProxy" select="$doc//xs:complexType[@name=$name]//xs:attribute[@name='Objektname']/@fixed"/>
            <!-- Remove |ProxyObjekt suffix (if present) -->
            <xsl:variable name="pointedType" select="if(contains($pointedTypeProxy, '|Proxy_Objekt')) 
        			      then substring-before($pointedTypeProxy, '|Proxy_Objekt') 
        			      else $pointedTypeProxy"/>
            <xsl:choose>
                <xsl:when test="contains($pointedType, '|')">
                    <!-- If this is a choice, use Basis_Objekt -->
                    <xsl:message>Pointer [<xsl:value-of select="$name"/>
] points to choice. Using Basis_Objekt.</xsl:message>
                    <xsl:value-of select="'nsBasisobjekte:CBasis_Objekt'"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:message>Pointer [<xsl:value-of select="$name"/>
] points to [<xsl:value-of select="func:getQualifiedType($pointedType)"/>
].</xsl:message>
                <xsl:value-of select="func:getQualifiedType($pointedType)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:attribute>

    <!-- Make the attribute nullable to allow proper propagation of xsi:nil attributes -->
    <xsl:attribute name="nillable">
        <xsl:value-of select="'true'"/>
    </xsl:attribute>
</xsl:template>

<!-- Match an xs:element which references the nsBasisTypen:TCID_Bearbeitungsvermerk and replace by Bearbeitungsvermerk -->
<!-- Only match 1:1 References -->
<xsl:template match="xs:element[@type = 'nsBasisTypen:TCID_Bearbeitungsvermerk']/@type" mode="transformIDReferences">
    <!-- Change the type to xs:anyURI. 
             This needs to be set this way so that ecore:reference creates a non-containment reference
             See also https://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf
        -->
    <xsl:attribute name="type">
        <xsl:value-of select="'xs:anyURI'"/>
    </xsl:attribute>

    <!-- Add the ecore:reference attribute to point to the value object -->
    <xsl:attribute name="ecore:reference">
        <xsl:value-of select="'nsBasisobjekte:CBearbeitungsvermerk'"/>
    </xsl:attribute>

    <!-- Make the attribute nullable to allow proper propagation of xsi:nil attributes -->
    <xsl:attribute name="nillable">
        <xsl:value-of select="'true'"/>
    </xsl:attribute>
</xsl:template>

<!-- Helper function to extract the qualified type name -->
<xsl:function name="func:getQualifiedType" as="xs:string">
    <xsl:param name="type" as="xs:string"/>

    <!-- Find the qualified name of the type $type by checking all source xsds-->
    <xsl:for-each select="collection(concat($planproDir, '?select=*.xsd;recurse=yes'))">
        <xsl:variable name="filename" select="tokenize(base-uri(), '/')[last()]"/>
        <xsl:for-each select="//xs:complexType">
            <!-- Remove T/C/TC prefix from type name -->
            <xsl:variable name="simpleName" select="replace(@name, 'T?C?(.+)', '$1')"/>
            <xsl:if test="$simpleName=$type">
                <xsl:variable name="schemaName" select="substring-before($filename, '.xsd')"/>
                <xsl:value-of select="concat('ns', $schemaName, ':', @name)"/>
            </xsl:if>
        </xsl:for-each>
    </xsl:for-each>
</xsl:function>
</xsl:stylesheet>