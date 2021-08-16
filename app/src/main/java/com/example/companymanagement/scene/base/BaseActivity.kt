package com.example.companymanagement
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.constants.UIResources.Companion.getLocalisation
import com.example.companymanagement.common.network.Network
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.base.BaseFragmentInterface

open class BaseActivity: AppCompatActivity(), BaseFragmentInterface {
    open var componentNavigationBarProfile: ImageView? = null
    open var componentNavigationLeftButtonProfile: ImageView? = null
    open var localisationManager = getLocalisation
    open var baseFragment: BaseFragment? = null
    open var viewHolder: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LocalResources.Layout.Activity.base)
        this.viewHolder = intent.getSerializableExtra(LocalResources.ConstantValue.constantKeyViewHolderKey) as? Int
        this.prepareLoadActivityLayout()
    }
    private fun prepareLoadActivityLayout() {
        if (this.viewHolder != null)
            this.displayCurrentContext(viewHolder!!)
        else
            println("Failed To load view holder")
    }
    private fun displayCurrentContext(ActivityView: Int) {
        this.baseFragment = BaseFragment.instanceWithLayout(ActivityView)
        this.baseFragment?.delegate = this
        if (this.baseFragment != null) {
            supportFragmentManager.beginTransaction().add(
                R.id.baseLinearLayout,
                this.baseFragment!!,
                ActivityView.toString()
            ).commit()
        }
    }
    open fun <T: BaseFragment> attachFragment(fragment: T?, attachTo: Int, identifierBundle: String? = null) {
        if (fragment != null && !fragment.isAdded) {
            fragment.arguments = Bundle().apply {
                putString(attachTo.toString(), identifierBundle)
            }
            supportFragmentManager.beginTransaction().add(
                attachTo,
                fragment,
                identifierBundle
            ).commit()
        }
    }
    override fun didFragmentFinishedLoading() {
        this.fragmentHolderDidLoad()
    }
    open fun fragmentHolderDidLoad() {
        this.setupNavigationUI()
    }
    private fun setupNavigationUI() {
        this.componentNavigationBarProfile = findViewById(R.id.baseLayoutProfileImage)
        this.componentNavigationLeftButtonProfile = findViewById(R.id.baseLayoutNavigationLeftButton)
        this.componentNavigationLeftButtonProfile?.apply {
            setColorFilter(ContextCompat.getColor(this@BaseActivity, R.color.white), PorterDuff.Mode.MULTIPLY)
        }
        Network.shared().loadImage("https://avatars.githubusercontent.com/u/43267304?v=4", this.componentNavigationBarProfile)
    }
}