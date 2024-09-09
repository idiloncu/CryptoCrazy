package com.example.cryptocrazy.presentation

import com.example.cryptocrazy.model.Coin

data class CoinListState(
    val isLoading:Boolean=false,
    val coins:List<Coin> = emptyList(),
    val error:String=""
)
