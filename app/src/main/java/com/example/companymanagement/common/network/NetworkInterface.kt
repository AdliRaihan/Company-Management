package com.example.companymanagement.common.network
import android.widget.ImageView
import com.example.companymanagement.common.constants.NetworkResources
import com.example.companymanagement.common.model.userLogin.ModelInterface
interface NetworkInterface {
    fun <T: ModelInterface> post(url: NetworkResources.endpoint, parameter: T)
    fun loadImage(url: String?, imageView: ImageView?)
}