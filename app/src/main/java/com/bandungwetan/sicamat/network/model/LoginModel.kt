package com.bandungwetan.sicamat.network.model

import com.google.gson.annotations.SerializedName

data class Login(

	@field:SerializedName("statusmsg")
	val statusmsg: String,

	@field:SerializedName("data")
	val data: Data
)

data class Data(

	@field:SerializedName("access_token")
	val accessToken: String,

	@field:SerializedName("user")
	val user: User
)

data class User(
	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("username")
	val username: String
)
