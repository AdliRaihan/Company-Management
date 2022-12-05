package com.example.companymanagement.scene.component.cardItems
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.R
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.common.network.Network
class ComponentCardItemsAdapter(private val data: Array<ComponentCardModel>): RecyclerView.Adapter<ComponentCardItemsAdapter.ContentViewHolder>() {
    class ContentViewHolder(content: View): RecyclerView.ViewHolder(content) {
        val headerText: TextView = content.findViewById(R.id.recyclerCardItemTextViewHeader)
        val descriptionText: TextView = content.findViewById(R.id.recyclerCardItemTextViewDescription)
        val imageView: ImageView = content.findViewById(R.id.recyclerCardItemImageView)
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
        holder.headerText.text = data[position].featureHeaderTools
        holder.descriptionText.text = data[position].featureDescriptionTools
        Network.shared().loadImage(data[position].featureDescriptionIcon, holder.imageView)
    }
}