package com.example.cardscarrousel.base

abstract class BaseUseCase<T> {
    abstract suspend fun execute(): List<T>
}