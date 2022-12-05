package com.example.companymanagement
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.companymanagement.common.constants.NetworkResources
import com.example.companymanagement.common.helper.Router.Companion.routeToDashboard
import com.example.companymanagement.common.helper.Router.Companion.routeToLogin
import com.example.companymanagement.common.helper.Router.Companion.routeToWebView
import com.example.companymanagement.common.storage.SharedPreferencesImpl.Companion.getAuthorizationUnsplashKey
import com.example.companymanagement.common.storage.SharedPreferencesImpl.Companion.setAuthorizationUnsplashKey
class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        routeToLogin()
        finish()
    }
}