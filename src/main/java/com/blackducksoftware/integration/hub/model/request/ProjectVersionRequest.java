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

import java.util.Date;

import com.blackducksoftware.integration.hub.model.enumeration.ProjectVersionDistributionEnum;
import com.blackducksoftware.integration.hub.model.enumeration.ProjectVersionPhaseEnum;

public class ProjectVersionRequest {
    // description from Hub API: "The distribution channel of the release"
    private final ProjectVersionDistributionEnum distribution;

    // description from Hub API: "The phase in the development life-cycle of the release"
    private final ProjectVersionPhaseEnum phase;

    // description from Hub API: "The general identifier of the release version"
    private final String versionName;

    // description from Hub API: "An alternative commonly used name or alias for the release"
    private String nickname;

    // description from Hub API: "Pertinent comments or notes associated with the release"
    private String releaseComments;

    // description from Hub API: "The logical date the Release became available for usage"
    private Date releasedOn;

    public ProjectVersionRequest(final ProjectVersionDistributionEnum distribution, final ProjectVersionPhaseEnum phase, final String versionName) {
        this.distribution = distribution;
        this.phase = phase;
        this.versionName = versionName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(final String nickname) {
        this.nickname = nickname;
    }

    public String getReleaseComments() {
        return releaseComments;
    }

    public void setReleaseComments(final String releaseComments) {
        this.releaseComments = releaseComments;
    }

    public Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(final Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public ProjectVersionDistributionEnum getDistribution() {
        return distribution;
    }

    public ProjectVersionPhaseEnum getPhase() {
        return phase;
    }

    public String getVersionName() {
        return versionName;
    }
}
