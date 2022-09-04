package com.example.cardscarrousel.cardCarrousel.di

import com.example.cardscarrousel.cardCarrousel.data.interfaces.IRealmDatabaseCards
import com.example.cardscarrousel.cardCarrousel.data.local.RealmDataBaseCards
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
interface RealmDataBaseModuleCards {
    @Binds
    fun bind(repository: RealmDataBaseCards): IRealmDatabaseCards
}