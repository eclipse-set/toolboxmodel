/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PlanPro.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Representation of an ID reference which is used by two different models
 * (source / target)
 * 
 * @author Stuecker
 *
 * @param guid
 *            The guid of the reference. May be null for nil-References
 * @param source
 *            The source object
 * @param sourceRef
 *            The reference on the source object referring to the ID Reference
 * @param target
 *            The targrt object
 * @param targetRef
 *            The reference on the target object referring to the ID Reference
 * 
 *            Note: This should be a Java record, however Xtend 2.26 does not
 *            appear to support using records yet
 */
public class IDReference {
	private final String guid;
	private final EObject source;
	private final EReference sourceRef;
	private final EObject target;
	private final EReference targetRef;

	public IDReference(final String guid, final EObject source,
			final EReference sourceRef, final EObject target,
			final EReference targetRef) {
		this.guid = guid;
		this.source = source;
		this.sourceRef = sourceRef;
		this.target = target;
		this.targetRef = targetRef;
	}

	public String guid() {
		return guid;
	}

	public EObject source() {
		return source;
	}

	public EReference sourceRef() {
		return sourceRef;
	}

	public EObject target() {
		return target;
	}

	public EReference targetRef() {
		return targetRef;
	}
}