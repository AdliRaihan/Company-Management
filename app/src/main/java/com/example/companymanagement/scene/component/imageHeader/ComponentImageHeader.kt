package com.example.companymanagement.scene.component.imageHeader
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.network.Network
import com.example.companymanagement.scene.base.BaseFragment
class ComponentImageHeader: BaseFragment() {
    var hideBlur: Boolean = false
    var urlImage: String? = null
    private var componentImageView: ImageView? = null
    private var componentBlurredImageView: View? = null
    private var componentHeaderText: TextView? = null
    private var componentHeaderDescriptionText: TextView? = null
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
        this.componentBlurredImageView = view.findViewById(R.id.componentImageViewBlurred)
        this.setupUI()
    }
    private fun setupUI() {
        this.loadImage()
        this.componentBlurredImageView?.isGone = hideBlur
    }
    private fun loadImage() {
        Network.shared().loadImage(urlImage, this.componentImageView)
    }
}