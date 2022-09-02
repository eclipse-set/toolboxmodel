<?xml version='1.0'?>
<!--
    Removes incorrectly formatted special characters from XSD xs:documentations fields

    See also PLANPRO-5036 and PLANPRO-4260

    @author Stuecker
-->
<xsl:stylesheet version="2.0"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
     xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xsl:template match="@*|node()" mode="replaceSpecialCharacters">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Match an xs:documentation element -->
    <xsl:template match="xs:documentation" mode="replaceSpecialCharacters">
        <!-- Replace:
            \r -> nothing
            \n -> newline
            \" -> "
        -->
        <xsl:variable name="result" select="."/>
        <!-- Remove all \r -->
        <xsl:variable name="result" select="replace($result, '\\r', '')"/>
        <!-- Replace all \n by an actual newline -->
        <xsl:variable name="result" select="replace($result, '\\n', '&#xa;')"/>
        <!-- Replace all \" by a " -->
        <xsl:variable name="result" select="replace($result, '\\&quot;', '&quot;')"/>
        <xs:documentation>
            <xsl:value-of disable-output-escaping="true" select="$result"/>
        </xs:documentation>
    </xsl:template>
</xsl:stylesheet>