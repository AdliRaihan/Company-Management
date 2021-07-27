package com.example.companymanagement.scene.component.imageHeader
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.network.Network
import com.example.companymanagement.scene.base.BaseFragment
class ComponentImageHeader: BaseFragment() {
    var urlImage: String? = null
    var componentImageView: ImageView? = null
    companion object {
        fun instanceWithLayout(): ComponentImageHeader {
            val fragment = ComponentImageHeader()
            fragment.layout = LocalResources.Layout.Component.componentImage
            return fragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.componentImageView = view.findViewById(R.id.componentImageView)
        println(this.urlImage)
        println(this.componentImageView)
        this.loadImage()
    }
    private fun loadImage() {
        Network.shared().loadImage(urlImage, this.componentImageView)
    }
}