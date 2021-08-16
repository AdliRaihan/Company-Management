package com.example.companymanagement.common.storage
import android.app.Activity
interface SharedPreferencesInterface {
    fun setAuthorizationUnsplashKey(string: String?)
    fun getAuthorizationUnsplashKey(): String
}