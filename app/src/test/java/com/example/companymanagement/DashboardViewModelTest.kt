package com.example.companymanagement
import com.example.companymanagement.common.constants.LocalResources
import com.example.companymanagement.scene.dashboard.DashboardViewModel
import org.junit.Test
import org.junit.Assert.*
class DashboardViewModelTest {
    private val viewModel: DashboardViewModel = DashboardViewModel()
    @Test
    fun setupScreenContent() {
        val expectedValue = arrayOf(LocalResources.Features.Screen.imageHeader, LocalResources.Features.Screen.dealItem)
        // Initialize the screen Type Display
        viewModel.getScreenContentDisplay()
        assert(viewModel.screenContentDisplay.size == 2)
        viewModel.screenContentDisplay.forEachIndexed { i, v ->
            assertEquals(expectedValue[i], v)
        }
    }
}