package com.example.companymanagement
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment

open class BaseActivity: AppCompatActivity() {
    open var baseFragment: BaseFragment? = null
    open var reusableViews: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_layout)
    }
    open fun displayCurrentContext(ActivityView: Int) {
        this.baseFragment = BaseFragment.instanceWithLayout(ActivityView)
        if (this.baseFragment != null) {
            supportFragmentManager.beginTransaction().add(
                R.id.baseLinearLayout,
                this.baseFragment!!,
                ActivityView.toString()
            ).commit()
        }
    }
    open fun <T: BaseFragment> attachFragment(fragment: T?, attachTo: Int) {
        if (fragment != null && supportFragmentManager.findFragmentById(fragment.id) == null) {
            supportFragmentManager.beginTransaction().add(
                attachTo,
                fragment!!,
                attachTo.toString()
            ).commit()
        }
    }
}