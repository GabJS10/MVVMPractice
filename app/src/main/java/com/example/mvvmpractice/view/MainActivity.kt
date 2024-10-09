package com.example.mvvmpractice.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvvmpractice.R
import com.example.mvvmpractice.ViewModel.QuoteViewModel
import com.example.mvvmpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(
            this,
            Observer { currentQuote ->
                binding.tvQuote.text = currentQuote.quote
                binding.tvAuthor.text = currentQuote.author
            }
        )

        binding.main.setOnClickListener {
            quoteViewModel.randomQuote()
        }

    }
}