<?xml version='1.0'?>
<!--
    Applies extra model fixes to make the generated model easier to work with

    @author Stuecker
-->
<xsl:stylesheet version="2.0"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
     xmlns:xs="http://www.w3.org/2001/XMLSchema"
     xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">

    <xsl:template match="@*|node()" mode="applyModelFixes">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!--
        Make the field wert of 
            Polygonzug_Planungsbereich_TypeClass
            Polygonzug_Betrachtungsbereich_TypeClass
            Fuehrende_Oertlichkeit_TypeClass
            Laufende_Nummer_Ausgabe_TypeClass
            Index_Ausgabe_TypeClass
            Bauzustand_Kurzbezeichnung_TypeClass
        not unsettable to avoid EMF Forms allowing the user to unset them
    -->
    <xsl:param name="applyModelFixesUnsettableWert" select="(
        'Fuehrende_Oertlichkeit_TypeClass',
        'Laufende_Nummer_Ausgabe_TypeClass',
        'Index_Ausgabe_TypeClass',
        'Bauzustand_Kurzbezeichnung_TypeClass',
        'Polygonzug_Planungsbereich_TypeClass',
        'Polygonzug_Betrachtungsbereich_TypeClass')"/>

    <xsl:template match="xs:complexType[@ecore:name=$applyModelFixesUnsettableWert]//xs:element[@name='Wert']/@nillable" mode="applyModelFixes">
        <xsl:value-of select='false'></xsl:value-of>
    </xsl:template>

    <!--
        Remove pattern validation from Polygonzug_*bereich_Type due to loading issues
    -->
    <xsl:param name="applyModelFixesPolygonzug" select="(
        'Polygonzug_Planungsbereich_Type',
        'Polygonzug_Betrachtungsbereich_Type')"/>
    <xsl:template match="xs:simpleType[@ecore:name=$applyModelFixesPolygonzug]//xs:pattern" mode="applyModelFixes">
        <!-- Intentionally empty-->
    </xsl:template>

</xsl:stylesheet>