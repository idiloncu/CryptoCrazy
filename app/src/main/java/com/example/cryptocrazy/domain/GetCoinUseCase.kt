package com.example.cryptocrazy.domain

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.example.cryptocrazy.data.remote.toCoinDetail
import com.example.cryptocrazy.data.toCoin
import com.example.cryptocrazy.model.Coin
import com.example.cryptocrazy.model.CoinDetail
import com.example.cryptocrazy.repository.CoinRepository
import com.example.cryptocrazy.ui.theme.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository

) {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    operator fun invoke(coinId: String): Flow<Resource<List<CoinDetail>>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }
        catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        }
        catch (e: IOException){
            emit(Resource.Error("No internet connection"))

        }
    }
}