package com.example.companymanagement.scene.dashboard
import com.example.companymanagement.common.constants.LocalResources
class DashboardViewModel {
    var screenContentDisplay: Array<LocalResources.Features.Screen> = arrayOf()
    open fun getScreenContentDisplay() {
        // For now its default, im not working with api right now
        this.screenContentDisplay = arrayOf(
            LocalResources.Features.Screen.DealItem,
            LocalResources.Features.Screen.ImageHeader
        )
    }
}