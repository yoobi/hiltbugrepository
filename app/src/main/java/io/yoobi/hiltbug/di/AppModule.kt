package io.yoobi.hiltbug.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.yoobi.analytics.AnalyticsRepository
import io.yoobi.error.handler.ErrorHandlerRepository


@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    @Binds
    fun bindsAnalytics(impl: AnalyticsImpl): AnalyticsRepository

    @Binds
    fun bindsErrorHandler(impl: ErrorHandlerImpl): ErrorHandlerRepository

}