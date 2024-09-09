package com.example.cryptocrazy.repository

import com.example.cryptocrazy.data.CoinDto
import com.example.cryptocrazy.data.remote.CoinDetailDto
import com.example.cryptocrazy.data.remote.CoinPaprikaApi
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}