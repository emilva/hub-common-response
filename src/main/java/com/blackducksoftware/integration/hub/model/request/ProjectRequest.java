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
package com.blackducksoftware.integration.hub.model.request;

public class ProjectRequest {

    // description from Hub API: The general identifier of the project
    private final String name;

    // description from Hub API: Summary of what the project represents in terms of functionality and use
    private String description;

    // description from Hub API: Whether BOM level adjustments are applied at the project level (to all releases)
    private Boolean projectLevelAdjustments;

    // description from Hub API: The user url who is the project owner
    private String projectOwner;

    // description from Hub API: Allowed values : [1,2,3,4,5]
    private Integer projectTier;

    // description from Hub API: Specification of the initial version to create with the project
    private ProjectVersionRequest versionRequest;

    public ProjectRequest(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean getProjectLevelAdjustments() {
        return projectLevelAdjustments;
    }

    public void setProjectLevelAdjustments(final Boolean projectLevelAdjustments) {
        this.projectLevelAdjustments = projectLevelAdjustments;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(final String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public Integer getProjectTier() {
        return projectTier;
    }

    public void setProjectTier(final Integer projectTier) {
        this.projectTier = projectTier;
    }

    public ProjectVersionRequest getVersionRequest() {
        return versionRequest;
    }

    public void setVersionRequest(final ProjectVersionRequest versionRequest) {
        this.versionRequest = versionRequest;
    }

    public String getName() {
        return name;
    }

}
