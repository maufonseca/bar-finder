package com.example.barfinder.infrastructure.networking

import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "http://places.google.com/"

/**
 * Interface of the requests to be made to Google Places API
 */
interface PlacesAPIService {

    @GET("list")
    fun getPlaceList(): Observable<PlaceResponseModel>

    /**
     *Object instance to make the requests to Google Places API
     */
    companion object {

        fun create(): PlacesAPIService {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()
            client.addInterceptor(interceptor)

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .client(client.build())
                .build()

            return retrofit.create(PlacesAPIService::class.java)
        }
    }
}