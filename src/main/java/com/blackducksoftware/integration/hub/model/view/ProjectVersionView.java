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

import com.blackducksoftware.integration.hub.model.HubView;
import com.blackducksoftware.integration.hub.model.enumeration.ProjectVersionDistributionEnum;
import com.blackducksoftware.integration.hub.model.enumeration.ProjectVersionPhaseEnum;
import com.blackducksoftware.integration.hub.model.enumeration.ProjectVersionSourceEnum;

public class ProjectVersionView extends HubView {
    private ProjectVersionDistributionEnum distribution;

    private ComplexLicenseView license;

    private String nickname;

    private ProjectVersionPhaseEnum phase;

    private String releaseComments;

    private Date releasedOn;

    // description from Hub API: "Read-Only; No matter the value it will always default to 'CUSTOM'",
    private ProjectVersionSourceEnum source;

    private String versionName;

    public ProjectVersionDistributionEnum getDistribution() {
        return distribution;
    }

    public void setDistribution(final ProjectVersionDistributionEnum distribution) {
        this.distribution = distribution;
    }

    public ComplexLicenseView getLicense() {
        return license;
    }

    public void setLicense(final ComplexLicenseView license) {
        this.license = license;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(final String nickname) {
        this.nickname = nickname;
    }

    public ProjectVersionPhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(final ProjectVersionPhaseEnum phase) {
        this.phase = phase;
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

    public ProjectVersionSourceEnum getSource() {
        return source;
    }

    public void setSource(final ProjectVersionSourceEnum source) {
        this.source = source;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(final String versionName) {
        this.versionName = versionName;
    }
}
