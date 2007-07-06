/******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/
package com.ibm.wala.cast.ir.translator;

import java.io.IOException;
import java.util.Set;

import com.ibm.wala.classLoader.ModuleEntry;

public interface TranslatorToIR {

  void translate(ModuleEntry S, String N) throws IOException;

  void translate(Set modules) throws IOException;

}
