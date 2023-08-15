<?xml version='1.0'?>
<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fn="http://www.w3.org/2005/xpath-functions"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:func="localhost/function">
    <xsl:output method="xml" encoding="utf-8" indent="yes"/>

    <!-- IMPROVE: The output directory (toolboxDir) appears to use the working dir, rather than the XSL file dir -->
    <xsl:param name="planproDir" select="'../../schema-planpro/'"/>
    <xsl:param name="toolboxDir" select="'schema-toolbox/'"/>
    <xsl:param name="planProNamespace" select="'http://www.plan-pro.org/modell/'"/>
    <xsl:param name="planproJavaNamespace" select="'org.eclipse.set.toolboxmodel.'"/>
    <xsl:param name="planproVersion" select="'1.10.0.1'"/>
    <xsl:param name="signalbegriffeVersion" select="'1.10.0.1'"/>
    <xsl:param name="signalbegriffeStrukturVersion" select="'1.6.0.1'"/>

    <!-- Transformations -->
    <xsl:include href="transformIDReferences.xsl"/>
    <xsl:include href="replaceSpecialCharacters.xsl"/>
    <xsl:include href="annotateSchema.xsl"/>
    <xsl:include href="removeNamespaces.xsl"/>
    <xsl:include href="setToolboxNamespace.xsl"/>
    <xsl:include href="applyModelFixes.xsl"/>

    <!-- default: Copy node without changes -->
    <xsl:template match="@*|node()" mode="copy">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Entry Point: Process all files in source/-Directory into output/-Directory-->
    <xsl:template name="main">
        <xsl:for-each select="collection(concat($planproDir, '?select=*.xsd;recurse=yes'))">
            <xsl:variable name="output" select="concat($toolboxDir, tokenize(base-uri(), '/')[last()])"/>
            <xsl:message>Processing <xsl:value-of select="base-uri()"/>
 to <xsl:value-of select="$output"/>
        </xsl:message>
        <xsl:result-document href="{$output}">
            <xsl:variable name="result" select="."/>
            <xsl:message>Namespace changes</xsl:message>
            <!-- Remove old namespace declarations -->
            <xsl:variable name="result">
                <xsl:apply-templates mode="removeNamespaces" select="$result"/>
            </xsl:variable>
            <!-- Add new toolbox declarations -->
            <xsl:variable name="result">
                <xsl:apply-templates mode="setToolboxNamespace" select="$result"/>
            </xsl:variable>
            <xsl:message>Special Characters</xsl:message>
            <xsl:variable name="result">
                <xsl:apply-templates mode="replaceSpecialCharacters" select="$result"/>
            </xsl:variable>
            <xsl:message>ID References</xsl:message>
            <xsl:variable name="result">
                <xsl:apply-templates mode="transformIDReferences" select="$result"/>
            </xsl:variable>
            <xsl:message>Schema Annotations</xsl:message>
            <xsl:variable name="result">
                <xsl:apply-templates mode="annotateSchema" select="$result"/>
            </xsl:variable>
            <xsl:variable name="result">
                <xsl:apply-templates mode="applyModelFixes" select="$result"/>
            </xsl:variable>
            <!-- Result -->
            <xsl:apply-templates mode="copy" select="$result"/>
        </xsl:result-document>
    </xsl:for-each>
</xsl:template>
</xsl:stylesheet>