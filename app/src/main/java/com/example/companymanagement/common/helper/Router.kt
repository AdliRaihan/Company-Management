package com.example.companymanagement.common.helper
import android.app.ActivityOptions
import android.content.Intent
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.dashboard.DashboardActivity
import com.example.companymanagement.scene.login.LoginActivity
import com.example.companymanagement.scene.webView.WebViewActivity

class Router {
    companion object {
        fun AppCompatActivity.routeToDashboard() {
            val dashboardActivity = Intent(this, DashboardActivity::class.java)
            dashboardActivity.putExtra(LocalResources.ConstantValue.constantKeyViewHolderKey, LocalResources.Layout.Activity.dashboardV2)
            this.startActivity(dashboardActivity)
        }
        fun AppCompatActivity.routeToWebView(url: String) {
            val webViewActivity = Intent(this, WebViewActivity::class.java)
            webViewActivity.putExtra(LocalResources.ConstantValue.constantKeyViewHolderKey, LocalResources.Layout.Activity.webView)
            webViewActivity.putExtra(LocalResources.ConstantValue.constantKeyURLSender, url)
            this.startActivity(webViewActivity)
        }
        fun AppCompatActivity.routeToLogin() {
            val loginActivity = Intent(this, LoginActivity::class.java)
            loginActivity.putExtra(LocalResources.ConstantValue.constantKeyViewHolderKey, LocalResources.Layout.Activity.login)
            this.startActivity(loginActivity)
            finish()
        }
    }
}