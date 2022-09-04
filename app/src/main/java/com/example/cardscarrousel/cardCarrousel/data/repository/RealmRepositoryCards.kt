package com.example.cardscarrousel.cardCarrousel.data.repository

import com.example.cardscarrousel.cardCarrousel.data.interfaces.IRealmDatabaseCards
import com.example.cardscarrousel.cardCarrousel.data.local.MockDataBaseCards
import com.example.cardscarrousel.cardCarrousel.data.mappers.toRListCardCarrouselEntity
import com.example.cardscarrousel.cardCarrousel.data.mappers.toRListCardCarrouselTask
import com.example.cardscarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.cardscarrousel.cardCarrousel.domain.interfaces.IRealmRepositoryCards
import com.example.cardscarrousel.cardCarrousel.domain.models.CardCarrousel
import io.realm.kotlin.where
import javax.inject.Inject

class RealmRepositoryCards @Inject constructor(private val realmDataBase: IRealmDatabaseCards) :
    IRealmRepositoryCards {

    private val mockDataBaseCards by lazy { MockDataBaseCards() }

    override suspend fun getCardListCarrouselObjects(): List<CardCarrousel> {
        insertCardListCarrousel(mockDataBaseCards.cardListCarrousel())
        return realmDataBase.getObjectsFromRealm { where<RCardCarrousel>().findAll() }.toRListCardCarrouselTask()
    }

    override suspend fun insertCardListCarrousel(cardCarrousel: List<CardCarrousel>) {
        realmDataBase.deleteAllObjectFromRealm { RCardCarrousel() }
        return realmDataBase.addObjectFromRealm{ cardCarrousel.sortedBy { it.BankName }.toRListCardCarrouselEntity()}
    }
}