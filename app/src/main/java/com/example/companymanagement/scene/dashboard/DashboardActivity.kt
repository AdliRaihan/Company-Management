package com.example.companymanagement.scene.dashboard
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.base.BaseComponentAdapter
import com.example.companymanagement.scene.component.cardItems.ComponentCardItems
import com.example.companymanagement.scene.component.cardItems.ComponentCardModel
import com.example.companymanagement.scene.component.imageHeader.ComponentImageHeader
import com.example.companymanagement.scene.component.quickButton.ComponentQuickButton

class DashboardActivity: BaseActivity() {
    var viewModel: DashboardViewModel = DashboardViewModel()
    lateinit var components: Map<LocalResources.Features.Screen, BaseFragment>
    override fun fragmentHolderDidLoad() {
        super.fragmentHolderDidLoad()
        this.viewModel.getScreenContentDisplay()
        this.prepareDisplayContentFragments()
    }
    private fun prepareDisplayContentFragments() {
        this.components = mapOf(
                LocalResources.Features.Screen.ImageHeader to this.getComponentImageHeader(),
                LocalResources.Features.Screen.Admin to this.getComponentCardItems(),
                LocalResources.Features.Screen.Employee to this.getComponentQuickButton()
            )
        viewModel.screenContentDisplay.forEach { value ->
            if (this.components.containsKey(value))
                this.attachFragment(this.components[value], R.id.dashboardContentScrolledLayoutV2, value.toString())
        }
    }
    private fun getComponentCardItems(): ComponentCardItems {
        return ComponentCardItems.instanceWithLayout().apply {
            title = this@DashboardActivity.localisationManager.valueHeaderMainFeature
            dataSource = ComponentCardModel.displayForEmployee(this@DashboardActivity.localisationManager)
        }
    }
    private fun getComponentImageHeader(): ComponentImageHeader {
        return ComponentImageHeader.instanceWithLayout().apply {
            this.urlImage = "https://wallpapercave.com/wp/wp3952671.jpg"
        }
    }
    private fun getComponentQuickButton(): ComponentQuickButton {
        return ComponentQuickButton.instanceWithGlobalLayout().apply {
            title = this@DashboardActivity.localisationManager.valueForQuickActionHeader
        }
    }
}