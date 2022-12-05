package com.example.companymanagement.common.constants

class NetworkResources {
    object Base {
        private const val url: String = "https://localhost/development"
        private const val version: String = "/v1"
        const val baseURL: String = "$url$version"
    }
    enum class Endpoint(val value: String) {
        Login("${Base.baseURL}/login.php"),
        RenewAuth("${Base.baseURL}/renew.php"),
        ListPhotos("/photos"),
        Me("/me")
    }
    // Self reminder : if this get pushed then the repo should be private
    object APIAccess {
        const val accessID = ""
        const val secretKey = ""
    }
}