package com.example.cardscarrousel.cardCarrousel.data.local

import com.example.cardscarrousel.R
import com.example.cardscarrousel.cardCarrousel.domain.CardCarrousel

class MockDataBaseCards {

    fun cardListCarrousel() : List<CardCarrousel> = listOf (
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"BBVA", "123456789087656787", "Valido hasta 09/25", R.drawable.ic_visa_vector, R.color.card_color_type1),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"SANTANDER", "385569503998764530", "Valido hasta 01/26", R.drawable.ic_mastercard_vector, R.color.card_color_type2),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"CAIXA", "988544879087495038", "Valido hasta 04/24", R.drawable.ic_visa_vector, R.color.card_color_type3),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"SABADELL", "123456789087656787", "Valido hasta 09/25", R.drawable.ic_visa_vector, R.color.card_color_type4),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"BANKIA", "385569503998764530", "Valido hasta 01/26", R.drawable.ic_mastercard_vector, R.color.card_color_type5),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"BAKINTER", "988544879087495038", "Valido hasta 04/24", R.drawable.ic_mastercard_vector, R.color.card_color_type6),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"DEUTSCHE BANK", "548753215488785654", "Valido hasta 04/24", R.drawable.ic_mastercard_vector, R.color.card_color_type7),
        CardCarrousel(R.drawable.ic_favicon_copy_4_white,"CAJAMAR", "988544879087495038", "Valido hasta 04/24", R.drawable.ic_visa_vector, R.color.card_color_type8),
    )

}