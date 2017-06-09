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
package com.blackducksoftware.integration.hub.model.response;

import java.util.Date;
import java.util.UUID;

import com.blackducksoftware.integration.hub.model.HubResponse;
import com.blackducksoftware.integration.hub.model.enumeration.ScanSummaryStatusEnum;
import com.blackducksoftware.integration.hub.model.response.components.ScanGroup;

public class DryRunUploadResponse extends HubResponse {
    public String scannerVersion;

    public String signatureVersion;

    public UUID id;

    public ScanGroup scanGroup;

    public String name;

    public String hostName;

    public String baseDir;

    public String ownerEntityKeyToken;

    public Date lastModifiedOn;

    public Date createdOn;

    public Integer timeToScan;

    public String createdByUserId;

    public ScanSummaryStatusEnum status;

    public Integer fileSystemSize;

    public Integer matchCount;

    public Integer numDirs;

    public Integer numNonDirFiles;

    public String scanSourceType;

    public String scanSourceId;

    public Long scanTime;

    public Long timeLastModified;

    public Integer timeToPersistMs;

}
