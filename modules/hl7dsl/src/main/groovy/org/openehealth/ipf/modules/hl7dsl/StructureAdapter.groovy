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

import ca.uhn.hl7v2.model.Structure

/**
 * @author Martin Krasser
 * @author Christian Ohr
 * @deprecated the ipd-modules-hl7dsl module is deprecated
 */
abstract class StructureAdapter<T extends Structure> implements AbstractAdapter<T> {

    T target
	String path

    StructureAdapter(T target) {
        this.target = target
    }

    StructureAdapter withPath(def parent, int idx) {
		String pp = parent.path
		path = pp + (pp == '' ? name : ".$name") +
		       (parent.isRepeating(name) ? "($idx)" : '')
		this
	}

    @Override
    T getTarget() {
        target
    }

    @Override
    boolean isEmpty() {
        return target.isEmpty()
    }
}