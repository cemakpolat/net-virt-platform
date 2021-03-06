/*
 * Copyright (c) 2013 Big Switch Networks, Inc.
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

package org.sdnplatform.util;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using=EventHistoryBaseInfoJSONSerializer.class)
public class EventHistoryBaseInfo {
    public int              idx;
    public long             time_ms; // timestamp in milliseconds
    public EventHistory.EvState          state;
    public EventHistory.EvAction         action;

    // Getters
    public int getIdx() {
        return idx;
    }
    public long getTime_ms() {
        return time_ms;
    }
    public EventHistory.EvState getState() {
        return state;
    }
    public EventHistory.EvAction getAction() {
        return action;
    }
}