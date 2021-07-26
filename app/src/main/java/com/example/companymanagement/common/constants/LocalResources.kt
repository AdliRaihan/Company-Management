package com.example.companymanagement.common.constants
import com.example.companymanagement.R
public open class LocalResources {
    object Layout {
        object Fragments {
            val baseFragment = R.layout.base_fragment
        }
        object Activity {
            val dashboard = R.layout.activity_dashboard
            val dashboardV2 = R.layout.activity_dashboard_v2
        }
        object Component {
            val componentCardItem = R.layout.component_card_items
            val recyclerComponentItem = R.layout.recycler_card_items
        }
        val componentImage = R.layout.component_images
    }
}