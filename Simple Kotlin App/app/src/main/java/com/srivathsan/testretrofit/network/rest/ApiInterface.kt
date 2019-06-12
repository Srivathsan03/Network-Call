package com.srivathsan.testretrofit.network.rest

import com.srivathsan.testretrofit.network.response.shows.Response

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("CustomApi/getAllShowlist")
    fun getShows(@Query("userid") userId: Int,
                 @Query("offset") offset: Int): Call<Response>
}
