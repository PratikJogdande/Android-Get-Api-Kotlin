package com.androidgetapikotlin


import retrofit.Call
import retrofit.http.GET

interface ApiService {
    @GET("jokes/random")
    fun getjokes(): Call<DataModel>
}