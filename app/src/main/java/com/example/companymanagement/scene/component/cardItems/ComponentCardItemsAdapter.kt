package com.example.companymanagement.scene.component.cardItems
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.common.constants.LocalResources

class ComponentCardItemsAdapter(private val data: Array<ComponentCardModel>): RecyclerView.Adapter<ComponentCardItemsAdapter.ContentViewHolder>() {
    class ContentViewHolder(content: View): RecyclerView.ViewHolder(content) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val contentView = LayoutInflater.from(parent.context).inflate(
            LocalResources.Layout.Component.recyclerComponentItem,
            parent,
            false)
        return ContentViewHolder(
            contentView
        )
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
    }
}