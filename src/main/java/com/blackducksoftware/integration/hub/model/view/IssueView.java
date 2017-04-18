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
package com.blackducksoftware.integration.hub.model.view;

import com.blackducksoftware.integration.hub.model.HubView;

public class IssueView extends HubView {

    private String issueAssignee;

    private String issueCreatedAt;

    private String issueDescription;

    private String issueId;

    private String issueStatus;

    private String issueUpdatedAt;

    public String getIssueAssignee() {
        return issueAssignee;
    }

    public String getIssueCreatedAt() {
        return issueCreatedAt;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getIssueId() {
        return issueId;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public String getIssueUpdatedAt() {
        return issueUpdatedAt;
    }
}
