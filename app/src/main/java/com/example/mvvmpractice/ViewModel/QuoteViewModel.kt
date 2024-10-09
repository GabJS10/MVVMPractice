package com.example.mvvmpractice.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmpractice.Model.QuoteModel
import com.example.mvvmpractice.Model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}