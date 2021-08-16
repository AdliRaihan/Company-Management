package com.example.companymanagement.scene.component.quickButton
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.constants.UIResources
import com.example.companymanagement.scene.base.BaseComponentAdapter
import com.example.companymanagement.scene.base.BaseComponentRecycler
import com.example.companymanagement.scene.base.BaseComponentRecyclerInterface
import com.example.companymanagement.scene.base.BaseFragment
class ComponentQuickButton: BaseFragment(), BaseComponentRecyclerInterface {
    private var adapter: BaseComponentAdapter? = null
    private var recyclerView: RecyclerView? = null
    private var componentHeaderText: TextView? = null
    var title: String? = "Test"
    companion object {
        fun instanceWithGlobalLayout(): ComponentQuickButton {
            val baseFragment = ComponentQuickButton()
            baseFragment.layout = LocalResources.Layout.Component.componentCardItem
            return baseFragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.configureComponentHeader()
        this.loadAllComponent(this.activity?.baseContext)
    }
    private fun configureComponentHeader() {
        this.componentHeaderText = this.getOutlet(R.id.textViewComponentCardItems)
        if (title == null)
            this.componentHeaderText?.visibility = View.GONE
        else
            this.componentHeaderText?.text = title
    }
    private fun loadAllComponent(context: Context?) {
        this.adapter = BaseComponentAdapter(5, LocalResources.Layout.Component.recyclerQuickButton)
        this.adapter?.delegate = this
        this.recyclerView = this.getOutlet(R.id.recyclerComponentCardItems)
        this.recyclerView?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        this.recyclerView?.adapter = this.adapter
    }
    override fun adapterWillShow(adapter: BaseComponentRecycler, position: Int) {
        print("called")
    }
}