package com.blackducksoftware.integration.hub.model.enumeration;

public enum ScanSummaryStatusEnum {
    UNSTARTED,
    SCANNING,
    SAVING_SCAN_DATA,
    SCAN_DATA_SAVE_COMPLETE,
    REQUESTED_MATCH_JOB,
    MATCHING,
    BOM_VERSION_CHECK,
    BUILDING_BOM,
    COMPLETE,
    CANCELLED,
    CLONED,
    ERROR_SCANNING,
    ERROR_SAVING_SCAN_DATA,
    ERROR_MATCHING,
    ERROR_BUILDING_BOM,
    ERROR;

}
