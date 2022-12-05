package com.example.companymanagement.common.constants
import com.example.companymanagement.R
open class LocalResources {
    object Layout {
        object Fragments {
            const val baseFragment = R.layout.base_fragment
        }
        object Activity {
            const val base = R.layout.base_layout
            const val dashboard = R.layout.activity_dashboard
            const val dashboardV2 = R.layout.activity_dashboard_v2
            const val webView = R.layout.activity_web_view
            const val login = R.layout.activity_login
        }
        object Component {
            const val componentFormLoginInput = R.layout.component_form_login
            const val componentCardItem = R.layout.component_card_items
            const val componentImage = R.layout.component_images
            const val componentQuickButton = R.layout.component_quick_button
            const val recyclerComponentItem = R.layout.recycler_card_items
            const val recyclerQuickButton = R.layout.recycler_quick_button
        }
    }
    object Features {
        enum class Screen {
            ImageHeader, Employee, Admin, HR, Login
        }
    }
    object ConstantValue {
        const val constantKeySecretKey = "secret_key"
        const val constantKeyClientId = "client_id"
        const val constantKeyViewHolderKey = "APP_VIEW_HOLDER_KEY"
        const val constantKeyURLSender = "APP_URL_LOAD"
    }
    object SharedPreferencesObjectKey {
        const val constantStoredAuth = "UNSPLASH_STORED_AUTH"
    }
}