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
package com.blackducksoftware.integration.hub.model.enumeration;

public enum MatchTypeEnum {
    // Match via complete archive or directory contents designating an exact
    // match with files added, deleted, and/or modified.
    FILE_FILES_ADDED_DELETED_AND_MODIFIED,

    // Match via partial file contents designating a dependency match.
    FILE_DEPENDENCY,

    // Match via complete archive or directory contents designating an exact
    // match.
    FILE_EXACT,

    // Match via complete file contents designating an exact match.
    FILE_EXACT_FILE_MATCH,

    // Match via complete archive or directory contents designating an exact
    // match with some files modified.
    FILE_SOME_FILES_MODIFIED,

    // Match via manual addition of a version BOM component.
    MANUAL_BOM_COMPONENT,

    // Match via manual addition of a match of an unmatched version BOM file.
    MANUAL_BOM_FILE,

    // Match via partial file contents designating an exact match.
    PARTIAL_FILE;
}
