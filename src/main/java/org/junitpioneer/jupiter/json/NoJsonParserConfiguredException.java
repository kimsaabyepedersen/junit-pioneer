/*
 * Copyright 2016-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.junitpioneer.jupiter.json;

import org.junit.platform.commons.JUnitException;

/**
 * Indicates that no supported JSON parsing library was found at run time.
 *
 * @since 1.7.0
 */
public class NoJsonParserConfiguredException extends JUnitException {

	private static final long serialVersionUID = 5399969575022498446L;
	private static final String ERROR_MESSAGE = "No JSON parsing library found. Make sure a supported JSON parser (currently only Jackson) is on your test class/module path. For more information, see https://junit-pioneer.org/docs/json-argument-source/";

	NoJsonParserConfiguredException() {
		super(ERROR_MESSAGE);
	}

}
