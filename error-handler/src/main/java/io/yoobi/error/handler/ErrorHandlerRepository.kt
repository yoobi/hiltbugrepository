package io.yoobi.error.handler

interface ErrorHandlerRepository {
    fun toString(throwable: Throwable): String
}