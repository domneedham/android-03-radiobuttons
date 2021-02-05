package com.example.radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.radiobuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: RadioButtonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBinding()
    }

    private fun initBinding() {
        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this,
                R.layout.activity_main)
        viewModel = ViewModelProvider.AndroidViewModelFactory(application)
            .create(RadioButtonViewModel::class.java)
        activityMainBinding.viewmodel = viewModel
        activityMainBinding.lifecycleOwner = this
    }
}