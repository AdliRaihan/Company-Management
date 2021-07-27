package com.example.companymanagement.scene.component.cardItems

import com.example.companymanagement.common.constants.UIResources

class ComponentCardModel(
    private val parameterHeader: String,
    private val parameterDescription: String,
    private val parameterDescriptionIcon: String) {
    var featureHeaderTools: String = parameterHeader
    var featureDescriptionTools: String = parameterDescription
    var featureDescriptionIcon: String = parameterDescriptionIcon
    companion object {
        fun displayForEmployee(): Array<ComponentCardModel> {
            return arrayOf(
                ComponentCardModel(
                    UIResources.Localisation.valueAttendWork,
                    UIResources.Localisation.valueAttendWorkDescription,
                    ""),
                ComponentCardModel(
                    UIResources.Localisation.valueRequest,
                    UIResources.Localisation.valueRequestDescription,
                    ""),
                ComponentCardModel(
                    UIResources.Localisation.valueReport,
                    "",
                    "")
            )
        }
    }
}