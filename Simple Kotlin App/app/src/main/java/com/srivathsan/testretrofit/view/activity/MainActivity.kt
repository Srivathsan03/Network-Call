package com.srivathsan.testretrofit.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.srivathsan.testretrofit.R
import com.srivathsan.testretrofit.network.response.shows.Response
import com.srivathsan.testretrofit.network.response.shows.Show
import com.srivathsan.testretrofit.network.rest.ApiClient
import com.srivathsan.testretrofit.network.rest.ApiInterface
import com.srivathsan.testretrofit.view.adapter.ShowsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import java.util.*

class MainActivity : AppCompatActivity() {

    internal lateinit var showsAdapter: ShowsAdapter
    internal var showList: List<Show> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(applicationContext)
        rv.layoutManager = layoutManager
        showsAdapter = ShowsAdapter(showList)
        rv.adapter = showsAdapter

        val apiInterface = ApiClient.client.create(ApiInterface::class.java)

        val call = apiInterface.getShows(2, 0)
        call.enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                val r = response.body()
                val results = r!!.results
                showList = results!!.shows
                showsAdapter.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}
