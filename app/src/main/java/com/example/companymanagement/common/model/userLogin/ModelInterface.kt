package com.example.companymanagement.common.model.userLogin
import okhttp3.FormBody
interface ModelInterface {
    fun toFormRequest(): FormBody.Builder
}