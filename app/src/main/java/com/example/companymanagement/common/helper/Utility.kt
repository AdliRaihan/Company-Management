package com.example.companymanagement.common.helper

class Utility {
    companion object {
        val shared = Utility()
    }
    fun getCodeAuthorizationFrom(url: String): String? {
        if (url.contains("code="))
            url.split("=").also {
                return it.last()
            }
        else
            return null
    }
}