package com.example.companymanagement.scene.dashboard
import android.os.Bundle
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.constants.UIResources
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.component.cardItems.ComponentCardItems
import com.example.companymanagement.scene.component.cardItems.ComponentCardModel
import com.example.companymanagement.scene.component.imageHeader.ComponentImageHeader
class DashboardActivity: BaseActivity() {
    var viewModel: DashboardViewModel = DashboardViewModel()
    private val components: Map<LocalResources.Features.Screen, BaseFragment> = mapOf(
        LocalResources.Features.Screen.ImageHeader to this.getComponentImageHeader(),
        LocalResources.Features.Screen.BrowseByCategory to this.getComponentCardItems(),
        LocalResources.Features.Screen.Featured to this.getComponentCardItems(),
        LocalResources.Features.Screen.DealItem to this.getComponentCardItems()
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
            if (this.components.containsKey(value))
                this.attachFragment(this.components[value], R.id.dashboardContentScrolledLayoutV2, value.toString())
        }
    }
    private fun getComponentCardItems(): ComponentCardItems {
        return ComponentCardItems.instanceWithLayout().apply {
            title = UIResources.Localisation.valueHeaderMainFeature
            dataSource = ComponentCardModel.displayForEmployee()
        }
    }
    private fun getComponentImageHeader(): ComponentImageHeader {
        return ComponentImageHeader.instanceWithLayout().apply {
            this.urlImage = "https://images.unsplash.com/photo-1519608487953-e999c86e7455?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=667&q=80"
        }
    }
}