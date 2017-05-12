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

import com.blackducksoftware.integration.hub.model.HubView;

public class IssueView extends HubView {

    private String issueAssignee;

    private String issueCreatedAt;

    private String issueDescription;

    private String issueId;

    private String issueStatus;

    private String issueUpdatedAt;

    private String issueLink;

    public String getIssueAssignee() {
        return issueAssignee;
    }

    public void setIssueAssignee(final String issueAssignee) {
        this.issueAssignee = issueAssignee;
    }

    public String getIssueCreatedAt() {
        return issueCreatedAt;
    }

    public void setIssueCreatedAt(final String issueCreatedAt) {
        this.issueCreatedAt = issueCreatedAt;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(final String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(final String issueId) {
        this.issueId = issueId;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(final String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueUpdatedAt() {
        return issueUpdatedAt;
    }

    public void setIssueUpdatedAt(final String issueUpdatedAt) {
        this.issueUpdatedAt = issueUpdatedAt;
    }

    public String getIssueLink() {
        return issueLink;
    }

    public void setIssueLink(final String issueLink) {
        this.issueLink = issueLink;
    }
}
