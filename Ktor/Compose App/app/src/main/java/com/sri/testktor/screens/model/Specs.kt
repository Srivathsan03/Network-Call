package com.sri.testktor.screens.model

import kotlinx.serialization.Serializable

@Serializable
data class Specs(
    val battery: String? = null,
    val capacity: String? = null,
    val color: String? = null,
    val compartments: Int? = null,
    val material: String? = null,
    val maxWeight: String? = null,
    val power: String? = null,
    val ram: String? = null,
    val screen: String? = null,
    val size: String? = null,
    val storage: String? = null,
    val thickness: String? = null,
    val waterproof: Boolean? = null,
    val weight: String? = null
)