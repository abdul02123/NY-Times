package com.app.android.techassessment.utils

sealed class NetworkResult<T>(val data: T? = null) {
    class Success<T>(data: T): NetworkResult<T>(data)
    class Error<T>(data: T): NetworkResult<T>(data)
    class Loading<T>: NetworkResult<T>()
}