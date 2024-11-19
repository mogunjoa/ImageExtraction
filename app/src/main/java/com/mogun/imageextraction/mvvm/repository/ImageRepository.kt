package com.mogun.imageextraction.mvvm.repository

import com.mogun.imageextraction.mvvm.model.Image
import io.reactivex.Single

interface ImageRepository {
    fun getRandomImage(): Single<Image>
}