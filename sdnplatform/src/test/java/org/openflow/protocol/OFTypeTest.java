/*
 * Copyright (c) 2013 Big Switch Networks, Inc.
 * Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University 
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.openflow.protocol;


import junit.framework.TestCase;

import org.junit.Test;


public class OFTypeTest extends TestCase {

    public void testOFTypeCreate() throws Exception {
        OFType foo = OFType.HELLO;
        Class<? extends OFMessage> c = foo.toClass();
        TestCase.assertEquals(c, OFHello.class);
    }

    @Test
    public void testMapping() throws Exception {
        TestCase.assertEquals(OFType.HELLO, OFType.valueOf((byte) 0));
        TestCase.assertEquals(OFType.BARRIER_REPLY, OFType.valueOf((byte) 19));
    }
}
