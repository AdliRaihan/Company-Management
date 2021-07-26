package com.example.companymanagement.scene.dashboard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class DashboardView(
    private val contentAmount: Int,
    private val viewIdentifier: Int): RecyclerView.Adapter<DashboardView.DashboardViewHolder>() {
    open var delegate: DashboardInterface? = null
    class DashboardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardView.DashboardViewHolder {
        val contentView = LayoutInflater.from(parent.context).inflate(viewIdentifier, parent, false)
        return DashboardViewHolder(contentView)
    }
    override fun getItemCount(): Int {
        this.delegate?.didCall(1)
        return contentAmount
    }
    override fun onBindViewHolder(holder: DashboardView.DashboardViewHolder, position: Int) {
        this.delegate?.didCall(position)
    }
}