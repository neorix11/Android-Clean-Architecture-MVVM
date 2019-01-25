package com.bluelampcreative.domain.core

interface BaseUseCase<in Params, out Type> {
    fun execute(params: Params): Type
}