package com.example.companymanagement.scene.component.imageHeader
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment

class ComponentImageHeader: BaseFragment() {
    companion object {
        fun instanceWithLayout(): ComponentImageHeader {
            val fragment = ComponentImageHeader()
            fragment.layout = LocalResources.Layout.Component.componentImage
            return fragment
        }
    }
}