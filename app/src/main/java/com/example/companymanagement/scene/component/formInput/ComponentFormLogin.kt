package com.example.companymanagement.scene.component.formInput
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment
import com.example.companymanagement.scene.component.cardItems.ComponentCardItems
class ComponentFormLogin: BaseFragment() {
    interface ComponentFormLoginLogic {
        fun didButtonTapped()
    }
    private var formLoginDelegate: ComponentFormLoginLogic? = null
    private var formLoginButtonSignin: TextView? = null
    private var firstFieldInput: EditText? = null
    private var secondFieldInput: EditText? = null
    companion object {
        fun instanceWithLayout(withDelegate: ComponentFormLoginLogic? = null): ComponentFormLogin {
            val fragment =
                    ComponentFormLogin()
            fragment.layout = LocalResources.Layout.Component.componentFormLoginInput
            fragment.formLoginDelegate = withDelegate
            return fragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.formLoginButtonSignin = view.findViewById(R.id.formLoginButtonSignin)
        this.setupUI()
    }
    private fun setupUI() {
        this.formLoginButtonSignin?.setOnClickListener {
            this.formLoginDelegate?.didButtonTapped()
        }
    }
}