package com.example.cryptocrazy.presentation

import com.example.cryptocrazy.model.Coin

data class CoinDetailState(
    val isLoading:Boolean=false,
    val coin: List<Coin>? = null,
    val error:String=""
)