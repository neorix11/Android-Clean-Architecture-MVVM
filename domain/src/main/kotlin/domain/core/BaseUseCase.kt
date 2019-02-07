package com.bluelampcreative.domain.core

interface BaseUseCase<in P, out T> {
    fun execute(params: P): T
}