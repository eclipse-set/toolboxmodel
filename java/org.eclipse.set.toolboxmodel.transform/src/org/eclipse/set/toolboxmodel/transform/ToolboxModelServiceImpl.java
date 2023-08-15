/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform;

import org.eclipse.set.toolboxmodel.Layoutinformationen.PlanPro_Layoutinfo;
import org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;
import org.eclipse.set.toolboxmodel.transform.internal.PlanProToToolboxTransformation;
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

	@Override
	public org.eclipse.set.model.model11001.PlanPro.DocumentRoot savePlanProModel(
			final DocumentRoot toolbox) {
		return toolboxToPlanPro.transform(toolbox);
	}

	@Override
	public org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle savePlanProModel(
			final PlanPro_Schnittstelle toolbox) {
		return toolboxToPlanPro.transform(toolbox);
	}

	@Override
	public DocumentRoot loadPlanProModel(
			final org.eclipse.set.model.model11001.PlanPro.DocumentRoot planpro) {
		return planProToToolbox.transform(planpro);
	}

	@Override
	public PlanPro_Schnittstelle loadPlanProModel(
			final org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle planpro) {
		return planProToToolbox.transform(planpro);
	}

	@Override
	public org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot loadPlanProLayout(
			final org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutInfo) {
		return planProToToolbox.transform(layoutInfo);
	}

	@Override
	public PlanPro_Layoutinfo loadPlanProLayout(
			final org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo layoutInfo) {
		return planProToToolbox.transform(layoutInfo);
	}

	@Override
	public org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot saveLayoutModel(
			final org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot layoutInfo) {
		return toolboxToPlanPro.transformLayout(layoutInfo,
				planProToToolbox.getToolboxRoot());
	}
}
