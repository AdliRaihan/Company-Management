package com.example.companymanagement.common.constants
import android.app.AppOpsManager
import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import com.example.companymanagement.R
open class UIResources {
    companion object {
        val AppCompatActivity.getLocalisation: LocalisationManager<Context>
            get() = LocalisationManager(this)
    }
    class LocalisationManager<T: Context>(private val currentResources: T?): UIResourcesInterface.Localisation {
        override val valueHeaderMainFeature: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueAttendWork: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueAskForLeave: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueRequest: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueReport: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueAttendWorkDescription: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueAskForLeaveDescription: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueRequestDescription: String?
            get() = currentResources?.getString(R.string.app_name)
        override val valueForQuickActionHeader: String?
            get() = currentResources?.getString(R.string.app_quick_actions)
    }
}