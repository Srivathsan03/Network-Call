package com.srivathsan.testretrofit.network.rest;

import com.srivathsan.testretrofit.network.response.shows.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("CustomApi/getAllShowlist")
    Call<Response> getShows(@Query("userid") int userId,
                            @Query("offset") int offset);
}
