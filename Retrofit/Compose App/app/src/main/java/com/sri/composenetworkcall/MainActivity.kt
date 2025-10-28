package com.sri.composenetworkcall

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sri.composenetworkcall.model.User
import com.sri.composenetworkcall.network.ApiService
import com.sri.composenetworkcall.network.RetrofitClient
import com.sri.composenetworkcall.ui.theme.ComposeNetworkCallTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val retrofit = RetrofitClient.getInstance()
        val service = retrofit.create(ApiService::class.java)

        val call: Call<User> = service.getUser()

        call.enqueue(object : Callback<User> {
            override fun onResponse(
                call: Call<User?>,
                response: Response<User?>
            ) {
                Log.d("TAG", "onResponse: ${response.body()}")
            }

            override fun onFailure(
                call: Call<User?>,
                t: Throwable
            ) {
                t.printStackTrace()
            }

        })

        setContent {
            ComposeNetworkCallTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeNetworkCallTheme {
        Greeting("Android")
    }
}