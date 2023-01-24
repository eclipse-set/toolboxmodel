<xsl:stylesheet version="2.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:func="localhost/function">

    <!-- Default: Copy -->
    <xsl:template match="@*|node()" mode="setToolboxNamespace">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Rewrite elements. This causes unneeded namespace declarations to disappear -->
	<xsl:template match="xs:schema" mode="setToolboxNamespace">
		<xs:schema>
			<!-- Set up all other schemas as namespaces -->            
        	<xsl:for-each select="collection(concat($planproDir, '?select=*.xsd;recurse=yes'))">
				<xsl:variable name="filename" select="tokenize(base-uri(), '/')[last()]"/>
            	<xsl:variable name="schemaName" select="substring-before($filename, '.xsd')"/>
				<xsl:variable name="ns" select="xs:schema/@targetNamespace"/>
            	<xsl:namespace name="{concat('ns', $schemaName)}" select="func:toolbox-uri($ns)"/>
        	</xsl:for-each>

            <!-- Add xs:import nodes -->
			<xsl:variable name="schemaTargetNamespace" select="func:toolbox-uri(@targetNamespace)"/>
            <xsl:attribute name="targetNamespace" select="$schemaTargetNamespace"/>
			<xsl:for-each select="collection(concat($planproDir, '?select=*.xsd;recurse=yes'))">
				<xsl:variable name="filename" select="tokenize(base-uri(), '/')[last()]"/>
				<xsl:variable name="ns" select="func:toolbox-uri(xs:schema/@targetNamespace)"/>
				<xsl:if test="not($ns = $schemaTargetNamespace)">
					<xs:import namespace="{func:toolbox-uri($ns)}" schemaLocation="{$filename}"/>
				</xsl:if>
			</xsl:for-each>

			<xsl:apply-templates mode="#current"/>
		</xs:schema>
	</xsl:template>

    <!-- Helper function to get the toolbox namespace uri from a planpro uri -->
    <xsl:function name="func:toolbox-uri" as="xs:string">
        <xsl:param name="uri" as="xs:string"/>
        <xsl:variable name="uri" select="replace($uri, $planproVersion, 'toolbox')"/>
        <xsl:variable name="uri" select="replace($uri, $signalbegriffeVersion, 'toolbox')"/>
        <xsl:variable name="uri" select="replace($uri, $signalbegriffeStrukturVersion, 'toolbox')"/>
		<xsl:value-of select="$uri"/>
    </xsl:function>

    <!-- Remove old xs:imports -->
    <xsl:template match="xs:import" mode="setToolboxNamespace">
    </xsl:template>
</xsl:stylesheet>