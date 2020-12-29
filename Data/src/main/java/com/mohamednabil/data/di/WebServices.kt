package com.mohamednabil.data.di

import android.util.Log
import com.mohamednabil.data.model.Point
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


interface WebServices {
    suspend fun getPoint(): Point
}