package com.sri.composenetworkcall.model

data class User(
    val address: Address,
    val age: Int,
    val company: Company,
    val dateOfBirth: String,
    val email: String,
    val firstName: String,
    val gender: Int,
    val id: Int,
    val lastName: String,
    val maidenName: String,
    val password: String,
    val phone: String,
    val ssn: String,
    val username: String
)