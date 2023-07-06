/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PlanPro.util;

import org.eclipse.set.toolboxmodel.Layoutinformationen.PlanPro_Layoutinfo;
import org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle;

/**
 * Model Service for the Toolbox Model
 * 
 * @author Stuecker
 */
public interface ToolboxModelService {
	/**
	 * Loads a PlanPro Model into the Toolbox Model
	 * 
	 * @param planPro
	 *            the planpro model
	 * @return the toolbox model
	 */
	DocumentRoot loadPlanProModel(
			org.eclipse.set.model.model11001.PlanPro.DocumentRoot planPro);

	/**
	 * Load PlanPro Layoutinformation model into the ToolboxModel
	 * 
	 * @param layoutInfo
	 * @return the toolbox model
	 */
	org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot loadPlanProLayout(
			org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutInfo);

	/**
	 * Loads a PlanPro Model into the Toolbox Model
	 * 
	 * @param planPro
	 *            the planpro model
	 * @return the toolbox model
	 */
	PlanPro_Schnittstelle loadPlanProModel(
			org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle planPro);

	/**
	 * Load PlanPro Layoutinformation into the ToolboxModel
	 * 
	 * @param layoutInfo
	 * @return the toolbox model
	 */
	PlanPro_Layoutinfo loadPlanProLayout(
			org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo layoutInfo);

	/**
	 * Saves the current state of the Toolbox model to a PlanPro Model
	 * 
	 * @param toolbox
	 *            the toolbox model
	 * @return the planpro model
	 */
	org.eclipse.set.model.model11001.PlanPro.DocumentRoot savePlanProModel(
			DocumentRoot toolbox);

	/**
	 * Saves the current state of the Toolbox model to a PlanPro Model
	 * 
	 * @param toolbox
	 *            the toolbox model
	 * @return the planpro model
	 */
	org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle savePlanProModel(
			PlanPro_Schnittstelle toolbox);

	/**
	 * Saves the current state of the Toolbox model to a PlanPro
	 * Layoutinforamtionen Model
	 * 
	 * @param toolbox
	 *            the toolbox model
	 * @return the planpro model
	 */
	org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot saveLayoutModel(
			org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot layoutInfo);
}
