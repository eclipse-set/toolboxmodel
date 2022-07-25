/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.PlanPro.util.IDReference;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;
import org.eclipse.set.toolboxmodel.transform.internal.PlanProToToolboxTransformation;
import org.eclipse.set.toolboxmodel.transform.internal.ToolboxIDResolver;
import org.eclipse.set.toolboxmodel.transform.internal.ToolboxToPlanProTransformation;

/**
 * Implementation of the Toolbox model service
 * 
 * @author Stuecker
 *
 */
public class ToolboxModelServiceImpl implements ToolboxModelService {
	private final PlanProToToolboxTransformation planProToToolbox = new PlanProToToolboxTransformation();
	private final ToolboxToPlanProTransformation toolboxToPlanPro = new ToolboxToPlanProTransformation();

	private List<IDReference> invalidIDReferences = new ArrayList<>();

	@Override
	public org.eclipse.set.model.model1902.PlanPro.DocumentRoot savePlanProModel(
			final DocumentRoot toolbox) {
		return toolboxToPlanPro.transform(toolbox, invalidIDReferences);
	}

	@Override
	public org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle savePlanProModel(
			final PlanPro_Schnittstelle toolbox) {
		return toolboxToPlanPro.transform(toolbox, invalidIDReferences);
	}

	@Override
	public List<IDReference> getInvalidIDReferences() {
		return invalidIDReferences;
	}

	@Override
	public DocumentRoot loadPlanProModel(
			final org.eclipse.set.model.model1902.PlanPro.DocumentRoot planpro) {
		final DocumentRoot toolboxRoot = planProToToolbox.transform(planpro);
		invalidIDReferences = ToolboxIDResolver.resolveIDReferences(
				toolboxRoot.getPlanProSchnittstelle(),
				planProToToolbox.getUnresolvedIDReferences());
		return toolboxRoot;
	}

	@Override
	public PlanPro_Schnittstelle loadPlanProModel(
			final org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle planpro) {
		final PlanPro_Schnittstelle toolboxRoot = planProToToolbox
				.transform(planpro);
		invalidIDReferences = ToolboxIDResolver.resolveIDReferences(toolboxRoot,
				planProToToolbox.getUnresolvedIDReferences());
		return toolboxRoot;
	}

}
