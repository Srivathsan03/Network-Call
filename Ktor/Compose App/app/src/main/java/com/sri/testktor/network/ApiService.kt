package com.sri.testktor.network

import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class ApiService() {
    companion object {
        private const val BASE_URL = "https://fakeapi.net"

        private const val GET_PRODUCTS = "$BASE_URL/products"
    }

    suspend fun getProducts(): HttpResponse {
        return KtorClient.client.get(GET_PRODUCTS)
    }
}