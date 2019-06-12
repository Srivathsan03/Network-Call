package com.srivathsan.testretrofit.network.response.shows

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Results {

    @SerializedName("shows")
    @Expose
    lateinit var shows: List<Show>
    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("showorder")
    @Expose
    var showorder: List<Int>? = null

}