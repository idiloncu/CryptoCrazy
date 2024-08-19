package com.example.cryptocrazy.ui.theme.util

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    //Api den gelen verilerin döndürülme durumuna göre veri dondurur
    //baska herhangi bir projede de kullanılabilir
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}