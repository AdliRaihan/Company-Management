package com.example.companymanagement.scene.dashboard
import android.os.Bundle
import android.widget.Toast
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment

class DashboardActivity: BaseActivity(), DashboardInterface {
    private var dashboardView: DashboardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.displayCurrentContext(LocalResources.Layout.Activity.dashboard)
    }
    private fun setupBaseView() {
        var dictionary: Array<String> = arrayOf("0", "1")
        this.dashboardView = DashboardView(dictionary.size, LocalResources.Layout.componentImage)
        this.dashboardView?.delegate = this
        this.reusableViews?.adapter = this.dashboardView
    }
    override fun didCall(position: Int) {
        Toast.makeText(this, "Toast did get called", Toast.LENGTH_SHORT)
    }
}