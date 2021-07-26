package com.example.companymanagement.scene.dashboard

import com.example.companymanagement.common.constants.LocalResources

class DashboardViewModel {
    var screenContentDisplay: Array<String> = arrayOf()
    open fun getScreenContentDisplay() {
        // For now its default, im not working with api right now
        this.screenContentDisplay = arrayOf(
            LocalResources.Features.Screen.imageHeader,
            LocalResources.Features.Screen.dealItem
        )
    }
}