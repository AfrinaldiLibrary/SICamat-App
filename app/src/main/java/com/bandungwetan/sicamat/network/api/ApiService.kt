package com.bandungwetan.sicamat.network.api

import com.bandungwetan.sicamat.network.model.Login
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("user/login")
    fun postLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<Login>
}