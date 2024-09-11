package com.example.cryptocrazy.presentation

import com.example.cryptocrazy.model.Coin

data class CoinListState(
    val isLoading:Boolean=false,
    val coins:List<Coin> = emptyList(),
    val error:String=""
)
data class Coin(
    val coinId: String,
    val name: String,
    val rank: Int,
    val is_active: Boolean
)
