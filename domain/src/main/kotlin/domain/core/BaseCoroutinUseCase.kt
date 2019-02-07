package com.bluelampcreative.domain.core

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

abstract class BaseCoroutinUseCase<in P, out T>(private val providedCoroutinContext: CoroutineContext? = null) : CoroutineScope, BaseUseCase<P, T> {

    private val job: Job = Job()
    override val coroutineContext: CoroutineContext
        get() = providedCoroutinContext ?: Dispatchers.Main + job

    suspend operator fun invoke(params: P): T = withContext(Dispatchers.Default) { execute(params) }
}