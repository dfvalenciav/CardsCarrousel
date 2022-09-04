package com.example.cardscarrousel.cardCarrousel.domain.useCase

import com.example.cardscarrousel.base.BaseUseCase
import com.example.cardscarrousel.cardCarrousel.domain.interfaces.IRealmRepositoryCards
import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel
import javax.inject.Inject

class GetCardCarrouselUseCase @Inject constructor(
    private val repository: IRealmRepositoryCards
) : BaseUseCase<CardCarrousel>() {
    override suspend fun execute(): List<CardCarrousel> {
        return repository.getCardListCarrouselObjects()
    }
}