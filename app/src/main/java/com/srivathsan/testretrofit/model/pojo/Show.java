package com.srivathsan.testretrofit.model.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Show {

    @SerializedName("datecreated")
    @Expose
    private String datecreated;
    @SerializedName("sendShowFormSubjectAsShowName")
    @Expose
    private String sendShowFormSubjectAsShowName;
    @SerializedName("playname")
    @Expose
    private String playname;
    @SerializedName("assetcount")
    @Expose
    private Integer assetcount;
    @SerializedName("linkmd5")
    @Expose
    private String linkmd5;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("showassetcount")
    @Expose
    private Integer showassetcount;
    @SerializedName("showId")
    @Expose
    private Integer showId;
    @SerializedName("showcover")
    @Expose
    private String showcover;
    @SerializedName("assetdata")
    @Expose
    private List<String> assetdata = null;
    @SerializedName("showCoverAssetId")
    @Expose
    private String showCoverAssetId;
    @SerializedName("showCoverIdentify")
    @Expose
    private Boolean showCoverIdentify;
    @SerializedName("showMd5")
    @Expose
    private String showMd5;
    @SerializedName("showName")
    @Expose
    private String showName;

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getSendShowFormSubjectAsShowName() {
        return sendShowFormSubjectAsShowName;
    }

    public void setSendShowFormSubjectAsShowName(String sendShowFormSubjectAsShowName) {
        this.sendShowFormSubjectAsShowName = sendShowFormSubjectAsShowName;
    }

    public String getPlayname() {
        return playname;
    }

    public void setPlayname(String playname) {
        this.playname = playname;
    }

    public Integer getAssetcount() {
        return assetcount;
    }

    public void setAssetcount(Integer assetcount) {
        this.assetcount = assetcount;
    }

    public String getLinkmd5() {
        return linkmd5;
    }

    public void setLinkmd5(String linkmd5) {
        this.linkmd5 = linkmd5;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowassetcount() {
        return showassetcount;
    }

    public void setShowassetcount(Integer showassetcount) {
        this.showassetcount = showassetcount;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getShowcover() {
        return showcover;
    }

    public void setShowcover(String showcover) {
        this.showcover = showcover;
    }

    public List<String> getAssetdata() {
        return assetdata;
    }

    public void setAssetdata(List<String> assetdata) {
        this.assetdata = assetdata;
    }

    public String getShowCoverAssetId() {
        return showCoverAssetId;
    }

    public void setShowCoverAssetId(String showCoverAssetId) {
        this.showCoverAssetId = showCoverAssetId;
    }

    public Boolean getShowCoverIdentify() {
        return showCoverIdentify;
    }

    public void setShowCoverIdentify(Boolean showCoverIdentify) {
        this.showCoverIdentify = showCoverIdentify;
    }

    public String getShowMd5() {
        return showMd5;
    }

    public void setShowMd5(String showMd5) {
        this.showMd5 = showMd5;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

}