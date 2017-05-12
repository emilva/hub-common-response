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
package com.blackducksoftware.integration.hub.model.view.components;

import java.util.List;

import com.blackducksoftware.integration.hub.model.HubComponent;
import com.google.gson.annotations.SerializedName;

public class PolicyOverrideNotificationContent extends HubComponent {
    private String projectName;

    private String projectVersionName;

    private String componentName;

    private String componentVersionName;

    private String firstName;

    private String lastName;

    @SerializedName("projectVersion")
    private String projectVersionLink;

    // If version is specified, componentVersionLink will be populated
    // otherwise it will be null
    @SerializedName("componentVersion")
    private String componentVersionLink;

    // If version is not specified, componentLink will be populated
    // otherwise it will be null
    @SerializedName("component")
    private String componentLink;

    @SerializedName("bomComponentVersionPolicyStatus")
    private String bomComponentVersionPolicyStatusLink;

    private List<String> policies;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersionName() {
        return projectVersionName;
    }

    public void setProjectVersionName(final String projectVersionName) {
        this.projectVersionName = projectVersionName;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(final String componentName) {
        this.componentName = componentName;
    }

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(final String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getProjectVersionLink() {
        return projectVersionLink;
    }

    public void setProjectVersionLink(final String projectVersionLink) {
        this.projectVersionLink = projectVersionLink;
    }

    public String getComponentVersionLink() {
        return componentVersionLink;
    }

    public void setComponentVersionLink(final String componentVersionLink) {
        this.componentVersionLink = componentVersionLink;
    }

    public String getComponentLink() {
        return componentLink;
    }

    public void setComponentLink(final String componentLink) {
        this.componentLink = componentLink;
    }

    public String getBomComponentVersionPolicyStatusLink() {
        return bomComponentVersionPolicyStatusLink;
    }

    public void setBomComponentVersionPolicyStatusLink(final String bomComponentVersionPolicyStatusLink) {
        this.bomComponentVersionPolicyStatusLink = bomComponentVersionPolicyStatusLink;
    }

    public List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<String> policies) {
        this.policies = policies;
    }
}
