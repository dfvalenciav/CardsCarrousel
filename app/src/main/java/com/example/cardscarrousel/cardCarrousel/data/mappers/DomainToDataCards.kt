package com.example.cardscarrousel.cardCarrousel.data.mappers

import com.example.cardscarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel
import java.util.*

fun CardCarrousel.toRCardCarrousel() = RCardCarrousel(BankLogo,BankName,CardNumber,CardExpiration,CardFranchise, CardBackground, UUID.randomUUID().mostSignificantBits)
fun List<CardCarrousel>.toRListCardCarrouselEntity()= map { domain ->
    domain.toRCardCarrousel()
}