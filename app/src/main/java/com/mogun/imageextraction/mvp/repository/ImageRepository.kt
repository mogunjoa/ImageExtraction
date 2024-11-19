package com.mogun.imageextraction.mvp.repository

interface ImageRepository {
    fun getRandomImage(callback: CallBack)

    interface CallBack {
        fun loadImage(url: String, color: String)
    }
}