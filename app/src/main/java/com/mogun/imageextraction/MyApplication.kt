package com.mogun.imageextraction

import android.app.Application

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MyApplication
            private set

        fun getApiKey(): String {
            return instance.getString(R.string.api_key)
        }
    }
}