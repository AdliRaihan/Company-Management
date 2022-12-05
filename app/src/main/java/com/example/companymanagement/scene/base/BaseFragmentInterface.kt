package com.example.companymanagement.scene.base
interface BaseFragmentInterface {
    fun didFragmentFinishedLoading()
}
interface BaseComponentRecyclerInterface {
    fun adapterWillShow(adapter: BaseComponentRecycler, position: Int)
}