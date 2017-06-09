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
package com.blackducksoftware.integration.hub.model.response.components;

import java.util.List;
import java.util.UUID;

import com.blackducksoftware.integration.hub.model.HubComponent;

public class ScanGroup extends HubComponent {

    public UUID id;

    public String name;

    public CodeLocationKey codeLocationKey;

    public UUID currentScanId;

    public List<ScanNode> scanList;

}
