package com.sri.testktor.screens.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductsResp(
    val `data`: List<Data?>? = null,
    val pagination: Pagination? = null
)