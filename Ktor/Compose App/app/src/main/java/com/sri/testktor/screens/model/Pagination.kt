package com.sri.testktor.screens.model

import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    val limit: Int? = null,
    val page: Int? = null,
    val total: Int? = null
)