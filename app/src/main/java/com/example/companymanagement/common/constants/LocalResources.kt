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
        }
        object Component {
            const val componentCardItem = R.layout.component_card_items
            const val componentImage = R.layout.component_images
            const val recyclerComponentItem = R.layout.recycler_card_items
        }
    }
    object Features {
        enum class Screen {
            ImageHeader, DealItem, BrowseByCategory, Featured
        }
    }
}