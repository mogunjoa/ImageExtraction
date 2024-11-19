package com.mogun.imageextraction

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface ImageService {
    @GET("photos/random")
    fun getRandomImage(): Call<ImageResponse>

    @GET("photos/random")
    fun getRandomImageRx(): Single<ImageResponse>
}