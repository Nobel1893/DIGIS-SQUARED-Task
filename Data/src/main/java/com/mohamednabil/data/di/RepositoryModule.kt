package com.mohamednabil.data.di

import com.mohamednabil.data.dataSource.point.PointsOnlineDataSource
import com.mohamednabil.data.dataSource.point.PointsOnlineDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun providePointsOnlineDataSource(webServices: WebServices): PointsOnlineDataSource {
        return PointsOnlineDataSourceImpl(webServices)
    }
}