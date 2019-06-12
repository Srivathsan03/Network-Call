package com.srivathsan.testretrofit.network.response.shows

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Response {

    @SerializedName("results")
    @Expose
    var results: Results? = null
}
