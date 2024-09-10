package com.example.cryptocrazy.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.cryptocrazy.domain.GetCoinsUseCase
import com.example.cryptocrazy.ui.theme.util.Constants
import com.example.cryptocrazy.ui.theme.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinsUseCase,
    savedStateHandle: SavedStateHandle
):ViewModel(){

    private val _state= mutableStateOf(CoinDetailState())
    val state:State<CoinDetailState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { coinId->
            getCoin(coinId)
        }
    }

    private fun getCoin(coinId:String){
        getCoinUseCase(coinId).onEach { result->
            when(result){
                is Resource.Success->{
                    _state.value=CoinDetailState(coin = result.data)

                }
                is Resource.Error->{
                    _state.value=CoinDetailState(error = result.message?:"An unexpected error occured")

                }
                is Resource.Loading->{
                    _state.value=CoinDetailState(isLoading = true)
                }
            }
        }
    }
}