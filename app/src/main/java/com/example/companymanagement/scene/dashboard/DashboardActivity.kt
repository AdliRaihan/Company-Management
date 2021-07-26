package com.example.companymanagement.scene.dashboard
import android.os.Bundle
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.component.cardItems.ComponentCardItems
import com.example.companymanagement.scene.component.imageHeader.ComponentImageHeader
import java.util.*

class DashboardActivity: BaseActivity() {
    var viewModel: DashboardViewModel = DashboardViewModel()
    val components: Map<LocalResources.Features.Screen, BaseFragment> = mapOf(
        LocalResources.Features.Screen.ImageHeader to ComponentCardItems.instanceWithLayout(),
        LocalResources.Features.Screen.DealItem to ComponentImageHeader.instanceWithLayout()
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.displayCurrentContext(LocalResources.Layout.Activity.dashboardV2)
        this.viewModel.getScreenContentDisplay()
    }
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        this.prepareDisplayContentFragments()
    }
    private fun prepareDisplayContentFragments() {
        viewModel.screenContentDisplay.forEach { value ->
            this.attachFragment(this.components[value], R.id.dashboardContentScrolledLayoutV2)
        }
    }
}