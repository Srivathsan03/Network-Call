package com.srivathsan.testretrofit.network.response.shows

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Show {

    @SerializedName("datecreated")
    @Expose
    var datecreated: String? = null
    @SerializedName("sendShowFormSubjectAsShowName")
    @Expose
    var sendShowFormSubjectAsShowName: String? = null
    @SerializedName("playname")
    @Expose
    var playname: String? = null
    @SerializedName("assetcount")
    @Expose
    var assetcount: Int? = null
    @SerializedName("linkmd5")
    @Expose
    var linkmd5: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("showassetcount")
    @Expose
    var showassetcount: Int? = null
    @SerializedName("showId")
    @Expose
    var showId: Int? = null
    @SerializedName("showcover")
    @Expose
    var showcover: String? = null
    @SerializedName("assetdata")
    @Expose
    var assetdata: List<String>? = null
    @SerializedName("showCoverAssetId")
    @Expose
    var showCoverAssetId: String? = null
    @SerializedName("showCoverIdentify")
    @Expose
    var showCoverIdentify: Boolean? = null
    @SerializedName("showMd5")
    @Expose
    var showMd5: String? = null
    @SerializedName("showName")
    @Expose
    var showName: String? = null

}