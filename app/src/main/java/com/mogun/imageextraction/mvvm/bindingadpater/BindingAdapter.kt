package com.mogun.imageextraction.mvvm.bindingadpater


import android.graphics.Color
import androidx.databinding.BindingAdapter
import com.mogun.imageextraction.mvvm.model.Image
import android.widget.ImageView
import coil.load

@BindingAdapter("image")
fun ImageView.setImage(image: Image?) {
    if(image == null) {
        return
    }
    setBackgroundColor(Color.parseColor(image.color))
    load(image.url) {
        crossfade(300)
    }
}