package com.example.companymanagement.scene.login
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.helper.Router.Companion.routeToDashboard
import com.example.companymanagement.scene.component.formInput.ComponentFormLogin
import com.example.companymanagement.scene.component.imageHeader.ComponentImageHeader

class LoginActivity: BaseActivity(), ComponentFormLogin.ComponentFormLoginLogic {
    private var viewModel: LoginViewModel? = null
    private var headerImage: ComponentImageHeader? = null
    private var loginComponent: ComponentFormLogin? = null
    override fun fragmentHolderDidLoad() {
        super.fragmentHolderDidLoad()
        this.loginComponent = ComponentFormLogin.instanceWithLayout(this)
        this.headerImage = ComponentImageHeader.instanceWithLayout()
        this.headerImage?.hideBlur = true
        this.headerImage?.urlImage = "https://wallpapercave.com/wp/wp3952671.jpg"
        this.attachFragment(this.headerImage, R.id.loginContentLinearLayout, LocalResources.Features.Screen.ImageHeader.toString())
        this.attachFragment(this.loginComponent, R.id.loginContentLinearLayout, LocalResources.Features.Screen.Login.toString())
    }
    override fun didButtonTapped() {
        routeToDashboard()
        finish()
    }
}