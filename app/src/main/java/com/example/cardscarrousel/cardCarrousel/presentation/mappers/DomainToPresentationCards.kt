package com.example.cardscarrousel.cardCarrousel.presentation.mappers

import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel
import com.example.cardscarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation

fun CardCarrousel.toCardCarrouselPresentation() = CardCarrouselPresentation(BankLogo, BankName, CardNumber, CardExpiration, CardFranchise, CardBackground)
fun List<CardCarrousel>.toListCardCarrouselPresentation() = map {
        domain -> domain.toCardCarrouselPresentation()
}