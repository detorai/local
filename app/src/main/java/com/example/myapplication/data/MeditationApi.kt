package com.example.myapplication.data

import retrofit2.Call
import retrofit2.http.GET

interface MeditationApi {
    @GET("/feelings")
    fun getFeelingsList(): Call<MutableList<Feelings>>
}