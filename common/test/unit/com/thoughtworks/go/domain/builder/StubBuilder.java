/*
 * Copyright 2017 ThoughtWorks, Inc.
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

package com.thoughtworks.go.domain.builder;

import com.thoughtworks.go.domain.BuildLogElement;
import com.thoughtworks.go.domain.RunIfConfigs;
import com.thoughtworks.go.plugin.access.pluggabletask.TaskExtension;
import com.thoughtworks.go.util.command.CruiseControlException;
import com.thoughtworks.go.util.command.EnvironmentVariableContext;
import com.thoughtworks.go.work.DefaultGoPublisher;

/**
 * Created by marqueslee on 3/1/17.
 */
public class StubBuilder extends Builder {
    boolean wasCalled;

    public StubBuilder(RunIfConfigs conditions) {
        super(conditions, null, null);
    }

    public StubBuilder() {
        super(null, null, "");
    }

    public void build(BuildLogElement buildElement, DefaultGoPublisher publisher,
                      EnvironmentVariableContext environmentVariableContext, TaskExtension taskExtension) throws CruiseControlException {
        wasCalled = true;
    }
}
