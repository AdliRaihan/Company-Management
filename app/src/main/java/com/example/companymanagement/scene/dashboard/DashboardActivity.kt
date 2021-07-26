package com.example.companymanagement.scene.dashboard
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.component.ComponentCardItems

class DashboardActivity: BaseActivity() {
    var componentCardItems: ComponentCardItems? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.displayCurrentContext(LocalResources.Layout.Activity.dashboardV2)
    }
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        this.prepareDisplayContentFragments()
    }
    private fun prepareDisplayContentFragments() {
        this.componentCardItems = ComponentCardItems.instanceWithLayout()
        this.attachFragment(this.componentCardItems, R.id.dashboardContentScrolledLayoutV2)
    }
}