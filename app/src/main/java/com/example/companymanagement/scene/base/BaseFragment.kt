package com.example.companymanagement.scene.base
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.companymanagement.R
open class BaseFragment: Fragment() {
    open var layout: Int? = null
    companion object {
        open fun instanceWithLayout(layout: Int): BaseFragment {
            val baseFragment = BaseFragment()
            baseFragment.layout = layout
            return baseFragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (this.layout == null) {
            return inflater.inflate(R.layout.base_fragment, container, false)
        }
        return inflater.inflate(this.layout!!, container, false)
    }
    fun <T: View> getOutlet(value: Int): T? {
        return this.view?.findViewById(value)
    }
}