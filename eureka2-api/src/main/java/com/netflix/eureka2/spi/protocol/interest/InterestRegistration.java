/*
 * Copyright 2015 Netflix, Inc.
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

package com.netflix.eureka2.spi.protocol.interest;

import com.netflix.eureka2.model.instance.InstanceInfo;
import com.netflix.eureka2.model.interest.Interest;

/**
 * Discovery protocol message representing registration request. The {@link Interest} class hierarchy
 * which can be a composite structure of arbitrary depth is flattened prior to sending over the wire.
 *
 * @author Tomasz Bak
 */
public interface InterestRegistration {

    Interest<InstanceInfo>[] getInterests();

    Interest<InstanceInfo> toComposite();
}
