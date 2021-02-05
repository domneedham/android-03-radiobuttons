package com.example.radiobuttons

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class RadioButtonViewModel : ViewModel() {
    var imageVisible = ObservableInt(ImageView.INVISIBLE)
    var textVisible = ObservableInt(TextView.VISIBLE)
    //Enable focus on startup
    var textSelected = ObservableBoolean(true)
    fun showImage(){
        imageVisible.set(ImageView.VISIBLE)
        textVisible.set(TextView.INVISIBLE)
    }
    fun showText(){
        imageVisible.set(ImageView.INVISIBLE)
        textVisible.set(TextView.VISIBLE)
    }
}
