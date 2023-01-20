package com.example.cnnnews.data.api

import com.example.cnnnews.model.allNews.allNewsList
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("v2/everything?q=Apple&from=2023-01-20&sortBy=popularity&apiKey=fafe7f309c354670bfb0afc5f5ce0204")
    suspend fun getAllNews(): Response<allNewsList>
}