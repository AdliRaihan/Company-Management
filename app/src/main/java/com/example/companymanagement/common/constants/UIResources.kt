package com.example.companymanagement.common.constants
open class UIResources {
    object Localisation: UIResourcesInterface.Localisation {
        override val valueHeaderMainFeature: String
            get() = "Employee Feature"
        override val valueAttendWork: String
            get() = "Attend Work"
        override val valueAskForLeave: String
            get() = "Ask For Leave"
        override val valueRequest: String
            get() = "Request"
        override val valueReport: String
            get() = "Report"
        override val valueAttendWorkDescription: String
            get() = "Let your office know that you're working"
        override val valueAskForLeaveDescription: String
            get() = "Asks your co-worker if you can leave early due to emergency"
        override val valueRequestDescription: String
            get() = "Asks anything related to your work stuff"
    }
}