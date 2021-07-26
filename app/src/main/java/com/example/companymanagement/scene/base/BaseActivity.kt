package com.example.companymanagement
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment

open class BaseActivity: AppCompatActivity() {
    open var reusableViews: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_layout)
    }
    open fun displayCurrentContext(ActivityView: Int) {
        val baseFragment = BaseFragment.instanceWithLayout(ActivityView)
        supportFragmentManager.beginTransaction().add(
            R.id.baseLinearLayout,
            baseFragment,
            ActivityView.toString()
        ).commit()
    }
}