package com.example.cardscarrousel.cardCarrousel.domain.interfaces

import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel

interface IRealmRepositoryCards {
    suspend fun getCardListCarrouselObjects(): List<CardCarrousel>
    suspend fun insertCardListCarrousel(cardCarrousel: List<CardCarrousel>)
}