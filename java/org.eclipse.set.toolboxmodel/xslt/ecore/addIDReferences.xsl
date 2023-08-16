<?xml version='1.0'?>
<!--
    Adds a helper ecore reference to PlanPro_Schnittstelle which contains invalid id references
-->
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:func="localhost/function">
    <xsl:output method="xml" encoding="utf-8" indent="yes"/>

    <!-- Default: Copy -->
    <xsl:template match="@*|node()" mode="addIDReferences">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
        </xsl:copy>
    </xsl:template>

    <!-- Match PlanPro_Schnittstelle -->
    <xsl:template match="eClassifiers[@name = 'PlanPro_Schnittstelle']" mode="addIDReferences">
        <xsl:message>PlanPro_Schnittstelle found.</xsl:message>
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" mode="#current"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="planpro_layoutinfo" eType="ecore:EClass Layoutinformationen.ecore#//PlanPro_Layoutinfo" containment="true" resolveProxies="false"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="wzkInvalidIDReferences" upperBound="-1" eType="#//WzkInvalidIDReference" containment="true"/>
        </xsl:copy>
        <eClassifiers xsi:type="ecore:EClass" name="WzkInvalidIDReference">
            <eStructuralFeatures xsi:type="ecore:EAttribute" name="guid" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="source" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="sourceRef" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EReference"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="target" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="targetRef" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EReference"/>
        </eClassifiers>
    </xsl:template>
</xsl:stylesheet>