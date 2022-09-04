package com.example.cardscarrousel.cardCarrousel.domain.useCase

import com.example.cardscarrousel.cardCarrousel.domain.interfaces.IRealmRepositoryCards
import javax.inject.Inject

class GetCardCarrouselUseCase @Inject constructor(
    private val repository: IRealmRepositoryCards
)  {
}