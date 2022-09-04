package com.example.cardscarrousel.cardCarrousel.di

import com.example.cardscarrousel.cardCarrousel.data.repository.RealmRepositoryCards
import com.example.cardscarrousel.cardCarrousel.domain.interfaces.IRealmRepositoryCards
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RealmRepositoryModuleCards {
    @Binds
    fun bind(database: RealmRepositoryCards): IRealmRepositoryCards
}