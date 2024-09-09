package com.example.cryptocrazy.model

import com.google.gson.annotations.SerializedName

data class Coin(
    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)