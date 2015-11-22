/*
 * Copyright 2009 the original author or authors.
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
package org.openehealth.ipf.commons.ihe.xds.core.metadata;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Represents a date and time range used in queries.
 * @author Jens Riemschneider
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeRange", propOrder = {"from", "to"})
@EqualsAndHashCode(callSuper = false, doNotUseGetters = true)
public class TimeRange implements Serializable {
    private static final long serialVersionUID = -5468726370729209318L;
    
    @Getter private Timestamp from;
    @Getter private Timestamp to;

    public void setFrom(Timestamp from) {
        this.from = from;
    }

    public void setFrom(String from) {
        this.from = Timestamp.fromHL7(from);
    }

    public void setTo(Timestamp to) {
        this.to = to;
    }

    public void setTo(String to) {
        this.to = Timestamp.fromHL7(to);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
