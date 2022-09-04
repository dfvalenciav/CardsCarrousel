package com.example.cardscarrousel.cardCarrousel.presentation.cardCarrousel

import com.example.cardscarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation

sealed class CardCarrouselEvent {
    class ListCardCarrousel (val ls_carrousel: List<CardCarrouselPresentation>) : CardCarrouselEvent()
}
