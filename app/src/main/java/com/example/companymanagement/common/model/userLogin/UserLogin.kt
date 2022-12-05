package com.example.companymanagement.common.model.userLogin

import okhttp3.FormBody

data class UserLogin(val username: String, val password: String): ModelInterface {
    override fun toFormRequest(): FormBody.Builder {
        return FormBody
            .Builder()
            .add("username", username)
            .add("password", password)
    }
}