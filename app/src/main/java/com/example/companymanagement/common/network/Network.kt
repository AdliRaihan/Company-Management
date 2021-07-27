package com.example.companymanagement.common.network
import android.widget.ImageView
import com.example.companymanagement.common.constants.NetworkResources
import com.example.companymanagement.common.model.userLogin.ModelInterface
import com.squareup.picasso.Picasso
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.apache.http.params.HttpParams
import java.io.InputStream
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL
class Network: NetworkInterface {
    val mediaType: MediaType = "application/x-www-form-urlencoded".toMediaType()
    companion object {
        fun shared(): Network {
            return Network()
        }
    }
    override fun <T : ModelInterface> post(url: NetworkResources.endpoint, parameter: T) {
        val httpClient = OkHttpClient()
        val parameterBody = parameter.toFormRequest().build()
        val request: Request = Request.Builder().url(url.value).post(parameterBody).build()
        try {
            val response = httpClient.newCall(request).execute()
            println(response.body?.string())
        }
        catch (exception: Exception) {

        }
    }
    override fun loadImage(url: String?, imageView: ImageView?) {
        Picasso.get().load(url).into(imageView)
    }
}