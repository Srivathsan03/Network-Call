package com.srivathsan.testretrofit.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.srivathsan.testretrofit.R
import com.srivathsan.testretrofit.network.response.shows.Show

class ShowsAdapter(private val showList: List<Show>) : RecyclerView.Adapter<ShowsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_show, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, i: Int) {
        val show = showList[i]
        holder.tvShow!!.text = show.showName
    }

    override fun getItemCount(): Int {
        return showList.size
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        internal var tvShow: TextView? = null

        init {
            tvShow = view.findViewById(R.id.tvShow)
        }
    }
}
