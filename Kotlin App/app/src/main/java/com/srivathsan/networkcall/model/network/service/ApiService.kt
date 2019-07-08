package com.srivathsan.networkcall.model.network.service

import com.srivathsan.networkcall.model.network.response.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users.json")
    fun getUsers(): Call<List<User>>
}