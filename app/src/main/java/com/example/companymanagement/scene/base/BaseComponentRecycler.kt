package com.example.companymanagement.scene.base
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.companymanagement.scene.component.quickButton.ComponentQuickButton
open class BaseComponentRecycler(val content: View): RecyclerView.ViewHolder(content) {
    companion object {
        fun invokeClass(content: View): BaseComponentRecycler {
            return BaseComponentRecycler(content)
        }
    }
}