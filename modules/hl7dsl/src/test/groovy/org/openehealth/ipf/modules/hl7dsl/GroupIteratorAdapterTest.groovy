/*
 * Copyright 2008 the original author or authors.
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
package org.openehealth.ipf.modules.hl7dsl

import static org.openehealth.ipf.modules.hl7dsl.MessageAdapters.*
/**
 * @author Martin Krasser
 */
class GroupIteratorAdapterTest extends GroovyTestCase {
    
    def message
    
    void setUp() {
        message = load('msg-02.hl7')
    }
    
    void testIterate() {
		def iterator = GroupAdapterIterator.iterator(message)
		def structures = []
		while (iterator.hasNext()) {
			structures += iterator.next().name
		}
		assertEquals(35, structures.size())
    }
    
    
}