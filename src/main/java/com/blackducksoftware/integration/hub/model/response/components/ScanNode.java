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
package com.blackducksoftware.integration.hub.model.response.components;

import java.util.Date;
import java.util.UUID;

import com.blackducksoftware.integration.hub.model.HubComponent;
import com.blackducksoftware.integration.hub.model.enumeration.ScanSummaryStatusEnum;

public class ScanNode extends HubComponent {

    public String scannerVersion;

    public String signatureVersion;

    public UUID id;

    public UUID scanGroup;

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
