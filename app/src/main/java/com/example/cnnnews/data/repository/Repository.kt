package com.example.cnnnews.data.repository

import com.example.cnnnews.data.api.RetrofitInstance
import com.example.cnnnews.model.allNews.allNewsList
import retrofit2.Response

class Repository {
    suspend fun getRealityCash(): Response<allNewsList> {
        return RetrofitInstance.api.getAllNews()
    }
}