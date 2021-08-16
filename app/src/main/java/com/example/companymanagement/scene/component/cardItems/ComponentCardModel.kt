package com.example.companymanagement.scene.component.cardItems

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.companymanagement.common.constants.UIResources

class ComponentCardModel(
    parameterHeader: String?,
    parameterDescription: String?,
    parameterDescriptionIcon: String?) {
    var featureHeaderTools: String? = parameterHeader
    var featureDescriptionTools: String? = parameterDescription
    var featureDescriptionIcon: String? = parameterDescriptionIcon
    companion object {
        fun displayForEmployee(localisationManager: UIResources.LocalisationManager<Context>?): Array<ComponentCardModel> {
            return arrayOf(
                ComponentCardModel(
                    localisationManager?.valueAttendWork,
                    localisationManager?.valueAttendWorkDescription,
                    "https://images.unsplash.com/photo-1624963053656-cecdf576d028?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
                ComponentCardModel(
                    localisationManager?.valueRequest,
                    localisationManager?.valueRequestDescription,
                    "https://images.unsplash.com/photo-1478860002487-680cc42afbeb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=334&q=80"),
                ComponentCardModel(
                    localisationManager?.valueReport,
                    "",
                    "https://images.unsplash.com/photo-1480548004877-593316be2bd5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=334&q=80")
            )
        }
    }
}