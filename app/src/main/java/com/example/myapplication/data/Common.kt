package com.example.myapplication.data

object Common {
    private val BASE_URL = "http://mskko2021.mad.hakta.pro/api"
    val meditationApi: MeditationApi
        get() = retrofitClient.getClient(BASE_URL).create(MeditationApi::class.java)
}