package com.sri.testktor.screens.model

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val brand: String? = null,
    val category: String? = null,
    val description: String? = null,
    val id: Int? = null,
    val image: String? = null,
    val price: Double? = null,
    val rating: Rating? = null,
    val specs: Specs? = null,
    val stock: Int? = null,
    val title: String? = null
)