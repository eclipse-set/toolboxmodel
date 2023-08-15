<xsl:stylesheet version="2.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <!-- Copy non-elements -->
    <xsl:template mode="removeNamespaces" match="@* | text() | comment() | processing-instruction()">
        <xsl:copy/>
    </xsl:template>

    <!-- Rewrite elements. This causes unneeded namespace declarations to disappear -->
    <xsl:template match="*" mode="removeNamespaces">
        <xsl:choose>
            <!-- Keep the xs:-prefix for xs:-elements -->
            <xsl:when test="namespace-uri() = 'http://www.w3.org/2001/XMLSchema'">
                <xsl:element name="xs:{local-name()}" namespace="{namespace-uri()}">
                    <xsl:apply-templates select="@* | node()" mode="#current"/>
                </xsl:element>
            </xsl:when>
            <!-- Otherwise remove the prefix -->
            <xsl:otherwise>
                <xsl:element name="{local-name()}" namespace="{namespace-uri()}">
                    <xsl:apply-templates select="@* | node()" mode="#current"/>
                </xsl:element>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>