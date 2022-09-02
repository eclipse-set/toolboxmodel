/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PlanPro.util;

import java.util.List;

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
			org.eclipse.set.model.model1902.PlanPro.DocumentRoot planPro);

	/**
	 * Loads a PlanPro Model into the Toolbox Model
	 * 
	 * @param planPro
	 *            the planpro model
	 * @return the toolbox model
	 */
	PlanPro_Schnittstelle loadPlanProModel(
			org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle planPro);

	/**
	 * Saves the current state of the Toolbox model to a PlanPro Model
	 * 
	 * @param toolbox
	 *            the toolbox model
	 * @return the planpro model
	 */
	org.eclipse.set.model.model1902.PlanPro.DocumentRoot savePlanProModel(
			org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot toolbox);

	/**
	 * Saves the current state of the Toolbox model to a PlanPro Model
	 * 
	 * @param toolbox
	 *            the toolbox model
	 * @return the planpro model
	 */
	org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle savePlanProModel(
			org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle toolbox);

	/**
	 * @return a list of ID references that could not be resolved in the last
	 *         loadPlanProModel()-call
	 */
	List<IDReference> getInvalidIDReferences();

}
