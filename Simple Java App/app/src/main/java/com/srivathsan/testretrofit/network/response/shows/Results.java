package com.srivathsan.testretrofit.network.response.shows;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("shows")
    @Expose
    private List<Show> shows = null;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("showorder")
    @Expose
    private List<Integer> showorder = null;

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Integer> getShoworder() {
        return showorder;
    }

    public void setShoworder(List<Integer> showorder) {
        this.showorder = showorder;
    }

}