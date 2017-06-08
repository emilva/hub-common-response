/*
 * Copyright (C) 2017 Black Duck Software Inc.
 * http://www.blackducksoftware.com/
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Black Duck Software ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Black Duck Software.
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
