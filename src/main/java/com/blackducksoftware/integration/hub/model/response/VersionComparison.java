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
package com.blackducksoftware.integration.hub.model.response;

import com.blackducksoftware.integration.hub.model.HubResponse;

public class VersionComparison extends HubResponse {
    private String consumerVersion;

    private String producerVersion;

    private Integer numericResult;

    private String operatorResult;

    public String getConsumerVersion() {
        return consumerVersion;
    }

    public void setConsumerVersion(final String consumerVersion) {
        this.consumerVersion = consumerVersion;
    }

    public String getProducerVersion() {
        return producerVersion;
    }

    public void setProducerVersion(final String producerVersion) {
        this.producerVersion = producerVersion;
    }

    public Integer getNumericResult() {
        return numericResult;
    }

    public void setNumericResult(final Integer numericResult) {
        this.numericResult = numericResult;
    }

    public String getOperatorResult() {
        return operatorResult;
    }

    public void setOperatorResult(final String operatorResult) {
        this.operatorResult = operatorResult;
    }
}
