package com.example.companymanagement.scene.base
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class BaseComponentAdapter(
        private val dataSource: Int,
        private val resourceName: Int
): RecyclerView.Adapter<BaseComponentRecycler>() {
    var delegate: BaseComponentRecyclerInterface? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseComponentRecycler {
        val contentView = LayoutInflater.from(parent.context).inflate(
            resourceName,
            parent,
            false)
        return BaseComponentRecycler.invokeClass(contentView)
    }
    override fun getItemCount(): Int {
        return dataSource
    }
    override fun onBindViewHolder(holder: BaseComponentRecycler, position: Int) {
        delegate?.adapterWillShow(holder, position)
    }
}
