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
package com.ibm.wala.cast.ir.cfg;

import java.util.Iterator;

import com.ibm.wala.cfg.ControlFlowGraph;
import com.ibm.wala.cfg.IBasicBlock;
import com.ibm.wala.util.debug.Assertions;

public class Util {

  public static int whichPred(ControlFlowGraph CFG, 
			      IBasicBlock Y,
			      IBasicBlock X)
  {
    int i = 0;
    for (Iterator N = CFG.getPredNodes(Y); N.hasNext(); i++)
      if (N.next() == X)
        return i;

    Assertions.UNREACHABLE();
    return -1;
  }

}

