<?xml version='1.0'?>
<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fn="http://www.w3.org/2005/xpath-functions"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:func="localhost/function">
    <xsl:output method="xml" encoding="utf-8" indent="yes"/>

    <!-- IMPROVE: The output directory (ecoreOutDir) appears to use the working dir, rather than the XSL file dir -->
    <xsl:param name="ecoreDir" select="'../../model/'"/>
    <xsl:param name="ecoreOutDir" select="'./model/'"/>

    <!-- Transformations -->
    <xsl:include href="addIDReferences.xsl"/>

    <!-- default: Copy node without changes -->
    <xsl:template match="@*|node()" mode="copy">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Entry Point: Process all files in source/-Directory into output/-Directory-->
    <xsl:template name="main">
        <xsl:for-each select="collection(concat($ecoreDir, '?select=*.ecore;recurse=yes'))">
            <xsl:variable name="output" select="concat($ecoreOutDir, tokenize(base-uri(), '/')[last()])"/>
            <xsl:message>
                Processing <xsl:value-of select="base-uri()"/>
 to <xsl:value-of select="$output"/>
        </xsl:message>
        <xsl:result-document href="{$output}">
            <xsl:variable name="result" select="."/>
            <xsl:message>Add invalid ID Reference storage</xsl:message>
            <!-- Add invalid ID Reference storage -->
            <xsl:variable name="result">
                <xsl:apply-templates mode="addIDReferences" select="$result"/>
            </xsl:variable>
            <xsl:apply-templates mode="copy" select="$result"/>
        </xsl:result-document>
    </xsl:for-each>
</xsl:template>
</xsl:stylesheet>