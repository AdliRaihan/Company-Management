package com.example.companymanagement.common.model.unsplashUserModel
import org.json.JSONObject
open class UserModel(private val response: String): JSONObject(response) {
    val id: String = this.optString("id")
    val updatedAt : String = this.optString("updated_at")
    val username: String = this.optString("username")
    val firstName: String = this.optString("first_name")
    val lastName: String = this.optString("last_name")
    val twitterUsername: String = this.optString("twitter_username")
    val portfolioUrl: String = this.optString("portfolio_url")
    val bio: String = this.optString("bio")
    val location: String = this.optString("location")
    val totalLikes: Int = this.optInt("total_likes")
    val totalPhotos: Int = this.optInt("total_photos")
    val totalCollections: Int = this.optInt("total_collections")
    val followedByUser: Boolean = this.optBoolean("followed_by_user")
    val downloads: Int = this.optInt("downloads")
    val uploadsRemaining: Int = this.optInt("uploads_remaining")
    val instagramUsername:  String = this.optString("instagram_username")
    val email: String = this.optString("email")
    val links: Links = Links()
    class Links () {
        val self: String = ""
        val html: String = ""
        val photos: String = ""
        val likes: String = ""
        val portfolio : String = ""
    }
}