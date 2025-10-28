package com.sri.composenetworkcall.model

data class Address(
    val city: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val state: String,
    val street: String,
    val zipcode: String
)