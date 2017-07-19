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
import com.blackducksoftware.integration.hub.model.enumeration.AllowEnum;

public final class MetaView extends HubComponent {
    private final List<AllowEnum> allow;

    private final String href;

    private final List<LinkView> links;

    public MetaView(List<AllowEnum> allow, String href, List<LinkView> links) {
        super();
        this.allow = allow;
        this.href = href;
        this.links = links;
    }

    public class LinkView extends HubComponent {
        private final String rel;

        private final String href;

        public LinkView(String rel, String href) {
            this.rel = rel;
            this.href = href;
        }

        public String getRel() {
            return rel;
        }

        public String getHref() {
            return href;
        }

    }

    public List<AllowEnum> getAllow() {
        return allow;
    }

    public String getHref() {
        return href;
    }

    public List<LinkView> getLinks() {
        return links;
    }

}
