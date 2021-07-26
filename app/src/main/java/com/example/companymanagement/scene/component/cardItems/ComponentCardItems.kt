package com.example.companymanagement.scene.component.cardItems
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.base.BaseFragment

class ComponentCardItems: BaseFragment() {
//    open lateinit var dataBinding: // Later Will Be Updated
    private var componentCardTitle: RecyclerView? = null
    var adapter: ComponentCardItemsAdapter? = null
    companion object {
         fun instanceWithLayout(): ComponentCardItems {
            val fragment =
                ComponentCardItems()
            fragment.layout = LocalResources.Layout.Component.componentCardItem
            return fragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.loadAllComponentsOutlet(this.activity?.baseContext)
    }
    private fun loadAllComponentsOutlet(context: Context?) {
        var adapterData: Array<ComponentCardModel> = arrayOf(
            ComponentCardModel(),
            ComponentCardModel()
        )
        this.adapter =
            ComponentCardItemsAdapter(
                adapterData
            )
        this.componentCardTitle = this.getOutlet(R.id.recyclerComponentCardItems)
        this.componentCardTitle?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        this.componentCardTitle?.adapter = this.adapter
    }
    private fun loadComponentWithCurrentData() {

    }
}