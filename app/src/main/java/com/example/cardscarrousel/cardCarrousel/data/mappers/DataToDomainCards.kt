package com.example.cardscarrousel.cardCarrousel.data.mappers

import com.example.cardscarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel

fun RCardCarrousel.toCardCarrousel() = CardCarrousel(bankLogo,bankName, cardNumber, cardExpiration, cardFranchise, cardBackgroud)
fun List<RCardCarrousel>.toRListCardCarrouselTask() = map { data ->
    data.toCardCarrousel() }