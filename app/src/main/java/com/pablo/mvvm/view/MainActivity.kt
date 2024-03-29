package com.pablo.mvvm.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.pablo.mvvm.databinding.ActivityMainBinding
import com.pablo.mvvm.viewModel.ViewModelClass
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val fraseViewModel: ViewModelClass by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fraseViewModel.modelo.observe(this, Observer {
            binding.texto.text = it.frase
        })
        binding.viewContainer.setOnClickListener{
            fraseViewModel.randomFrase()
            binding.viewContainer.setBackgroundColor(Color.rgb(Random.nextInt(256),Random.nextInt(256),Random.nextInt(256)))
        }
    }
}