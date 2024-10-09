package com.example.mvvmpractice.Model

import android.util.Log

class QuoteProvider {
   companion object {

       fun random():QuoteModel{
           Log.i("Size", quotes.size.toString() )
           val position = (0..4).random()
           Log.i("Random", position.toString())
           return quotes[position]
       }

       private val quotes = listOf<QuoteModel>(

           QuoteModel(
               quote = "El hombre valiente no es el que no siente miedo" +
                       " si no aquel que conquista ese miedo.",
               author = "Seneca"),
           QuoteModel(
               quote = "La vida no se trata de encontrarte a ti mismo, " +
                       "sino de crearte a ti mismo.",
               author = "George Bernard Shaw"
           ),
           QuoteModel(
               quote = "La mejor y más hermosa de las cosas en el mundo " +
                       "no pueden verse ni tocarse, deben sentirse con el corazón.",
               author = "Helen Keller"
           ),
           QuoteModel(
               quote = "El éxito es la suma de pequeños esfuerzos, " +
                       "repetidos día tras día.",
               author = "Robert Collier"
           ),
           QuoteModel(
               quote = "La única forma de hacer un gran trabajo " +
                       "es amar lo que haces.",
               author = "Steve Jobs"
           )


       )
   }
}