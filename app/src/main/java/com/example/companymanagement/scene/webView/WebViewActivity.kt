package com.example.companymanagement.scene.webView
import android.annotation.SuppressLint
import android.os.Build
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.example.companymanagement.BaseActivity
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.helper.Router
import com.example.companymanagement.common.helper.Router.Companion.routeToDashboard
import com.example.companymanagement.common.helper.Utility
import com.example.companymanagement.common.storage.SharedPreferencesImpl
import com.example.companymanagement.common.storage.SharedPreferencesImpl.Companion.setAuthorizationUnsplashKey

class WebViewActivity: BaseActivity() {
    private var componentsWebView: WebView? = null
    private var componentWebViewButton: Button? = null
    override fun fragmentHolderDidLoad() {
        super.fragmentHolderDidLoad()
        this.setupWebView()
        this.setupButton()
    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView() {
        val url = intent.getSerializableExtra(LocalResources.ConstantValue.constantKeyURLSender) as? String
        this.componentsWebView = this.baseFragment?.getOutlet(R.id.webViewMainActivity)
        this.componentsWebView?.settings?.javaScriptEnabled = true
        this.loadWebPages(url)
    }
    private fun setupButton() {
        this.componentWebViewButton = this.baseFragment?.getOutlet(R.id.webViewMainButtonRefresh)
        this.componentWebViewButton?.setOnClickListener {
            this@WebViewActivity.componentsWebView?.reload()
        }
    }
    private fun loadWebPages(url: String?) {
        this.componentsWebView?.webViewClient = object: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null)
                    view?.loadUrl(url)
                return true
            }
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                if (url != null) {
                    val valueAuthorization = Utility.shared.getCodeAuthorizationFrom(url)
                    setAuthorizationUnsplashKey(valueAuthorization)
                    routeToDashboard()
                    finish()
                }
            }
        }
        if (url != null)
            this.componentsWebView?.loadUrl(url)
    }
}