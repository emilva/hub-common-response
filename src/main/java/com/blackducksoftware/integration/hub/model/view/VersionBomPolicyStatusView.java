/**
 * Hub Common Response
 *
 * Copyright (C) 2017 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.blackducksoftware.integration.hub.model.view;

import java.util.Date;
import java.util.List;

import com.blackducksoftware.integration.hub.model.HubView;
import com.blackducksoftware.integration.hub.model.enumeration.VersionBomPolicyStatusOverallStatusEnum;
import com.blackducksoftware.integration.hub.model.view.components.ComponentVersionStatusCount;

public class VersionBomPolicyStatusView extends HubView {
    private VersionBomPolicyStatusOverallStatusEnum overallStatus;

    private Date updatedAt;

    private List<ComponentVersionStatusCount> componentVersionStatusCounts;

    public ComponentVersionStatusCount getCountInViolation() {
        if (componentVersionStatusCounts == null || componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.IN_VIOLATION == count.name) {
                return count;
            }
        }
        return null;
    }

    public ComponentVersionStatusCount getCountNotInViolation() {
        if (componentVersionStatusCounts == null || componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.NOT_IN_VIOLATION == count.name) {
                return count;
            }
        }
        return null;
    }

    public ComponentVersionStatusCount getCountInViolationOverridden() {
        if (componentVersionStatusCounts == null || componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.IN_VIOLATION_OVERRIDDEN == count.name) {
                return count;
            }
        }
        return null;
    }

    public VersionBomPolicyStatusOverallStatusEnum getOverallStatus() {
        return overallStatus;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public List<ComponentVersionStatusCount> getComponentVersionStatusCounts() {
        return componentVersionStatusCounts;
    }

}
