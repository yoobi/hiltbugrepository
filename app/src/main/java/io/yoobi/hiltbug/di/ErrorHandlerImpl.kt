package io.yoobi.hiltbug.di

import io.yoobi.error.handler.ErrorHandlerRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ErrorHandlerImpl @Inject constructor(): ErrorHandlerRepository {
    override fun toString(throwable: Throwable): String {
        return throwable.localizedMessage ?: "Unknown message"
    }
}