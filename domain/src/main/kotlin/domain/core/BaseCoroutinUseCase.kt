package com.bluelampcreative.domain.core

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

abstract class BaseCoroutinUseCase<in Params, out Type>
    (private val providedCoroutinContext: CoroutineContext? = null) : CoroutineScope,
    BaseUseCase<Params, Type> {

    private val job: Job = Job()
    override val coroutineContext: CoroutineContext
        get() = providedCoroutinContext ?: Dispatchers.Main + job

    suspend operator fun invoke(params: Params): Type = withContext(Dispatchers.Default) { execute(params) }
}