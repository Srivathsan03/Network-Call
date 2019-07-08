package com.srivathsan.networkcall.view.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.srivathsan.networkcall.R
import com.srivathsan.networkcall.model.network.response.User
import com.srivathsan.networkcall.model.network.service.ApiService
import com.srivathsan.networkcall.model.network.service.RetrofitClientInstance
import com.srivathsan.networkcall.view.adapter.UserAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName
    private lateinit var service:ApiService
    private lateinit var context: Context
    private val listUser = ArrayList<User>()
    private lateinit var adapter:UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this
        service = RetrofitClientInstance.getRetrofitInstance()!!.create(ApiService::class.java)

        adapter = UserAdapter(listUser)
        rv.adapter = adapter
        val layoutManager = LinearLayoutManager(context)
        rv.layoutManager = layoutManager

        getUser()
    }

    fun getUser() {
        val call = service.getUsers()
        call.enqueue(object: Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                if(response.isSuccessful) {
                    Log.i(TAG, "response = " + response.body())
                    listUser.addAll(response.body()!!)
                    adapter.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}
