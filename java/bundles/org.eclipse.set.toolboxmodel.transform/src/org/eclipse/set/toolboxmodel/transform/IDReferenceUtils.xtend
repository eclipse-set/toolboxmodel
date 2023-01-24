/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform

import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EReference
import java.util.List
import org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference
import org.eclipse.set.toolboxmodel.PlanPro.PlanProFactory
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle

/**
 * Utilities for working with IDReferences
 * 
 * @author Stuecker 
 */
class IDReferenceUtils {
	/**
	 * Retargets ID References onto a new object
	 * 
	 * When copying an EObject (for example during importing), the ID References 
	 * from the source need to be updated to point to the newly created model
	 * 
	 * IMPROVE: Create an EObject copier which does this automatically to improve performance 
	 * 
	 * @param source
	 * @param target
	 */
	static def void retargetIDReferences(PlanPro_Schnittstelle source, PlanPro_Schnittstelle target)
	{
		val outIDRefs = newArrayList
		retargetIDReferences(source, target, source.wzkInvalidIDReferences, outIDRefs)
		target.wzkInvalidIDReferences.addAll(outIDRefs)
	}
	/**
	 * Retargets ID References onto a new object
	 * 
	 * When copying an EObject (for example during importing), the ID References 
	 * from the source need to be updated to point to the newly created model
	 * 
	 * IMPROVE: Create an EObject copier which does this automatically to improve performance 
	 * 
	 * @param source
	 * @param target
	 * @param references The references to retarget
	 * @param outReferences The list to insert the retargeted ID references
	 */
	static def void retargetIDReferences(EObject source, EObject target,
		Iterable<WzkInvalidIDReference> references,
		List<WzkInvalidIDReference> outReferences) {
		if (source === null || target === null) {
			return;
		}

		
		references.filter[it.target === source].map [ ref |
			val wzkref = PlanProFactory.eINSTANCE.createWzkInvalidIDReference()
			wzkref.guid = ref.guid
			wzkref.source = ref.source
			wzkref.sourceRef = ref.sourceRef
			wzkref.target = target
			wzkref.targetRef = ref.targetRef
			return wzkref
		].forEach[outReferences.add(it)]

		// Recurse into contained subobjects
		source.eClass.EStructuralFeatures.filter(EReference).
			filter[containment].forEach [ ref |
				if (!ref.isMany) {
					val sourceChild = source.eGet(ref) as EObject;
					val targetChild = target.eGet(ref) as EObject;
					retargetIDReferences(sourceChild, targetChild, references,
						outReferences);
				} else {
					val sourceChildren = source.eGet(ref) as EList<?>
					val targetChildren = target.eGet(ref) as EList<?>
					sourceChildren.filter(Ur_Objekt).forEach [ sourceChild |
						// Find target child with same GUID
						val targetChild = targetChildren.filter(Ur_Objekt).
							findFirst [ targetChild |
								sourceChild?.identitaet?.wert ==
									targetChild?.identitaet?.wert
							]

						// Recurse
						retargetIDReferences(sourceChild, targetChild,
							references, outReferences);

					]
				}
			]
	}
}
