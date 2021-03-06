/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openehealth.ipf.boot.hl7v2;

import org.openehealth.ipf.commons.ihe.hl7v2.storage.UnsolicitedFragmentationStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

/**
 * CachingUnsolicitedFragmentionStorage that uses a Spring cache abstraction
 *
 * @author Christian Ohr
 * @since 3.2
 */
public class CachingUnsolicitedFragmentionStorage implements UnsolicitedFragmentationStorage {

    private static final transient Logger LOG = LoggerFactory.getLogger(CachingUnsolicitedFragmentionStorage.class);
    private static final String UNSOLICITED_FRAGMENTATION_STORAGE = "unsolicitedFragmentionStorage";
    private final Cache cache;

    public CachingUnsolicitedFragmentionStorage(CacheManager cacheManager) {
        this.cache = cacheManager.getCache(UNSOLICITED_FRAGMENTATION_STORAGE);
    }

    @Override
    public void put(String key, StringBuilder accumulator) {
        cache.put(key, accumulator.toString());
    }

    @Override
    public StringBuilder getAndRemove(String key) {
        String element = cache.get(key, String.class);
        if (element != null) {
            cache.evict(key);
            return new StringBuilder(element);
        }
        return null;
    }


}
