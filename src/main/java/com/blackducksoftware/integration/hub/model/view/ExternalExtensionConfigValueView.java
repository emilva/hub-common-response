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

import java.util.List;

import com.blackducksoftware.integration.hub.model.HubView;
import com.blackducksoftware.integration.hub.model.enumeration.ExternalExtensionConfigValueOptionEnum;
import com.blackducksoftware.integration.hub.model.view.components.OptionItem;

public class ExternalExtensionConfigValueView extends HubView {
    private String name;

    private ExternalExtensionConfigValueOptionEnum optionType;

    private String title;

    private boolean required;

    private boolean singleValue;

    private String description;

    private List<OptionItem> options;

    private List<String> value;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ExternalExtensionConfigValueOptionEnum getOptionType() {
        return optionType;
    }

    public void setOptionType(final ExternalExtensionConfigValueOptionEnum optionType) {
        this.optionType = optionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(final boolean required) {
        this.required = required;
    }

    public boolean isSingleValue() {
        return singleValue;
    }

    public void setSingleValue(final boolean singleValue) {
        this.singleValue = singleValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<OptionItem> getOptions() {
        return options;
    }

    public void setOptions(final List<OptionItem> options) {
        this.options = options;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(final List<String> value) {
        this.value = value;
    }

}
