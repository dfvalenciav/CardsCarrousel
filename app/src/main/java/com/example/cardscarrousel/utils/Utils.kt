package com.example.cardscarrousel.utils

import android.view.View

class Utils {

    fun hideCardNumber(text: String): String {
        text.length
        return text.replaceRange(4, 14, "*****")
    }
}