package com.mogun.imageextraction.mvc

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.mogun.imageextraction.R
import com.mogun.imageextraction.databinding.ActivityMvcBinding

class MvcActivity : AppCompatActivity(), ImageProvider.Callback {
    private lateinit var binding: ActivityMvcBinding

    private val model = ImageCountModel()
    private val imageProvider = ImageProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        binding = ActivityMvcBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.view = this
    }

    fun loadImage() {
        imageProvider.getRandomImage()
    }

    override fun loadImage(url: String, color: String) {
        model.increase()
        with(binding) {
            imageView.run {
                setBackgroundColor(Color.parseColor(color))
                load(url)
            }
            imageCountTextView.text = "불러온 이미지 수: ${model.count}"
        }
    }
}