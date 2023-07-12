package io.yoobi.analytics

interface AnalyticsRepository {
    fun sendLog(message: String)
}