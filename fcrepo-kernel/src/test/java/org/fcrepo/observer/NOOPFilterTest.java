/**
 * Copyright 2013 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.observer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @todo Add Documentation.
 * @author Chris Beer
 * @date Mar 14, 2013
 */
public class NOOPFilterTest {

    /**
     * @todo Add Documentation.
     */
    @Test
    public void testApply() throws Exception {
        assertTrue(new NOOPFilter().apply(null));
    }

}
