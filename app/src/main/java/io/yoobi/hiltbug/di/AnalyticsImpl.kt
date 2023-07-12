package io.yoobi.hiltbug.di

import android.util.Log
import io.yoobi.analytics.AnalyticsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsImpl @Inject constructor(): AnalyticsRepository {
    override fun sendLog(message: String) {
        Log.e("AnalyticsImpl", "sendingLog: $message")
    }
}
