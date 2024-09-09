package com.example.cryptocrazy.repository

import com.example.cryptocrazy.data.CoinDto
import com.example.cryptocrazy.data.remote.CoinDetailDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto

}