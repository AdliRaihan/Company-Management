package com.example.companymanagement.common.storage

import android.app.Activity
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.example.companymanagement.common.constants.LocalResources

class SharedPreferencesImpl {
    companion object {
        fun Activity.setAuthorizationUnsplashKey(string: String?) {
            val preferences = this.getSharedPreferences(LocalResources.SharedPreferencesObjectKey.constantStoredAuth, MODE_PRIVATE)
            preferences.edit().apply {
                this.putString(LocalResources.SharedPreferencesObjectKey.constantStoredAuth, string).apply()
            }
        }
        fun Activity.getAuthorizationUnsplashKey(): String {
            val preferences = this.getSharedPreferences(LocalResources.SharedPreferencesObjectKey.constantStoredAuth, MODE_PRIVATE)
            return preferences.getString(LocalResources.SharedPreferencesObjectKey.constantStoredAuth, "").toString()
        }
    }
}