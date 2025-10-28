package com.sri.testktor.screens.model

import kotlinx.serialization.Serializable

@Serializable
data class Rating(
    val count: Int? = null,
    val rate: Double? = null
)