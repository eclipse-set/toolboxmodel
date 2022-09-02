<?xml version="1.0" encoding="UTF-8"?>
<!-- This Stylesheet enriches a given PlanPro-XML-Schema with Ecore "XML Schema to Ecore Mapping" annotations as
	described in http://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf 
	Annotations attached by this stylesheet:
	* ecore:nsPrefix
	* ecore:package
	* ecore:name
	-->
	


<!-- The actual stylesheet. Imports the ecore namespace. -->
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:ppi="http://www.plan-pro.org/modell/PlanProInformation">

    <!-- Default: Copy -->
	<xsl:template name="copy" match="@*|node()" mode="annotateSchema">
		<xsl:copy>
			<xsl:apply-templates select="@*" mode="#current"/>
			<xsl:apply-templates mode="#current"/>
		</xsl:copy>
	</xsl:template>

	<!-- ########################################################## -->
	<!-- ################ xs:schema annotation #################### -->
	<!-- ########################################################## -->
	
	<!-- Change the package name and prefix defaults to ones depending on the tail of the XML target namespace of a package and the company namespace.
		Original example namespace:
			http://www.plan-pro.org/modell/signale/1.7.0
		Prefix:
			nssignale
		package:
			de.scheidtbachmann.planpro.model.model170.signale
		-->
	<xsl:template match="xs:schema" mode="annotateSchema">
		<xsl:copy>
			<xsl:variable name="packageName"
				select="substring-before(substring-after(@targetNamespace,$planProNamespace),'/')" />
			<xsl:variable name="fullQualifiedJavaPackageName" select="concat($planproJavaNamespace,$packageName)"></xsl:variable>
			<xsl:variable name="nsPrefix">ns<xsl:value-of select="$packageName" /></xsl:variable>
			<xsl:attribute name="ecore:nsPrefix"><xsl:value-of select="$nsPrefix" /></xsl:attribute>
			<xsl:attribute name="ecore:package"><xsl:value-of select="$fullQualifiedJavaPackageName" /></xsl:attribute>
			<xsl:apply-templates select="@*|node()" mode="#current"/>
		</xsl:copy>
	</xsl:template>

	<!-- ########################################################## -->
	<!-- ########### xs:complexType annotation #################### -->
	<!-- ########################################################## -->
	
	<!-- Complex type names (and more) In the PlanPro schema are chosen with respect to the "hungarian notation (systems)"
	(http://en.wikipedia.org/wiki/Hungarian_notation) 
	For the resulting ecore model we want to change this notation: 
		Classes representing 'Objects' shall be named without any notation suffix, e.g.:
			Signal
		Classes representing "Attributgruppen" in terms of the PlanPro-Model shall be named with a "_AttributeGroup" postfix
			Bezeichnung_Signal_AttributeGroup
		Classes representing a derived "base attribute" in terms of the PlanPro-Model shall be named with a "_TypeClass" postix:
			Lichtpunkthoehe_TypeClass
			-->
	<xsl:template match="xs:complexType" mode="annotateSchema">
		<!-- complexType names start with "C" for objects (e.g. CSignal) or "TC" for "Typeclasses" (e.g. TCBezeichnung_Markanter_Punkt)-->
		<xsl:copy>
			<xsl:if test="starts-with(@name,'C')">
				<xsl:variable name="objectType" select="xs:annotation/xs:appinfo/ppi:WorkflowInformation/ppi:ObjectType"/>
				<xsl:choose>
					<xsl:when test="$objectType = 'LST_OBJECT'">
						<xsl:attribute name="ecore:name"><xsl:value-of select="substring-after(@name,'C')" /></xsl:attribute>
					</xsl:when>
					<xsl:otherwise>
						<xsl:attribute name="ecore:name"><xsl:value-of select="concat(substring-after(@name,'C'),'_AttributeGroup')" /></xsl:attribute>
					</xsl:otherwise>
				</xsl:choose>
 			</xsl:if>
 			<xsl:if test="starts-with(@name,'TC')">
  				<xsl:attribute name="ecore:name"><xsl:value-of select="concat(substring-after(@name,'C'),'_TypeClass')" /></xsl:attribute>
 			</xsl:if>
			<xsl:apply-templates select="@*|node()" mode="#current"/>
		</xsl:copy>
	</xsl:template>
	
	<!-- ########################################################## -->
	<!-- ########### xs:simpleType annotation ##################### -->
	<!-- ########################################################## -->
	
	<!-- Simpletype names start with "T" like "TGeschwindigkeit". They shall be postfixed with "_Type"-->
	<xsl:template match="xs:simpleType" mode="annotateSchema">
		<xsl:copy>
			<xsl:if test="starts-with(@name,'T')">
  				<xsl:attribute name="ecore:name"><xsl:value-of select="concat(substring(@name,2),'_Type')" /></xsl:attribute>
 			</xsl:if>
 			
 			<!-- Special Type Handling for some special attributes: -->
 			<!-- The attribute shall be treated as string in the gui, therefore we set the type-->
 			<xsl:if test="@name='TLaufende_Nummer_Ausgabe'">
  				<xsl:attribute name="ecore:instanceClass"><xsl:value-of>java.lang.String</xsl:value-of></xsl:attribute>
 			</xsl:if>
 			<!-- The attribute shall be treated as string in the gui, therefore we set the type-->
 			<xsl:if test="@name='TIndex_Ausgabe'">
  				<xsl:attribute name="ecore:instanceClass"><xsl:value-of>java.lang.String</xsl:value-of></xsl:attribute>
 			</xsl:if>
 			
			<xsl:apply-templates select="@*|node()" mode="#current"/>
		</xsl:copy>
	</xsl:template>
	
	<!-- ########################################################## -->
	<!-- ########### xs:enumeration annotation #################### -->
	<!-- ########################################################## -->
	
	<!-- The names of the specific enum values will be handled different. We want to prefix them with the name of the containing type  -->
	<xsl:template match="xs:enumeration" mode="annotateSchema">
		<xsl:copy>
			<xsl:variable name="containingEnumTypeName" select="ancestor::xs:simpleType[1]/@name"/>
			<!-- translation must be identical to export2BundleProperties.bas -->
  			<xsl:attribute name="ecore:name"><xsl:value-of select="translate(concat($containingEnumTypeName,'_',@value),', Ü-.()+/','__U____P_')" /></xsl:attribute>
			<xsl:apply-templates select="@*|node()" mode="#current"/>
		</xsl:copy>
	</xsl:template>
	
	<!-- ########################################################## -->
	<!-- ########### special cases ################################ -->
	<!-- ########################################################## -->
	<!-- as usual we have some special which are handled different from the above. 
		 We exclude special cases with explicit calls to the copy template -->
	
	
	<!-- ... atm we don't want to change the names of enumeration types. So e.g. "ENUMLinksRechts" stays as it is. -->
	<xsl:template match="xs:simpleType[xs:restriction/xs:enumeration]" mode="annotateSchema">
		<xsl:call-template name="copy"/>
	</xsl:template>

	<!-- ... Signalbegriffe will be handled without hungarian notation. Therefore we omit modifications.-->
	<xsl:template match="xs:complexType[xs:complexContent/xs:restriction/@base = 'nsSignalbegriffe_Struktur:TCSignalbegriff_ID']" mode="annotateSchema">
		<xsl:call-template name="copy"/>
	</xsl:template>
	
	
</xsl:stylesheet>