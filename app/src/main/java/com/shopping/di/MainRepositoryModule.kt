package com.shopping.di

import com.shopping.remote.MainService
import com.shopping.remote.repository.MainRepository
import com.shopping.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainRepositoryModule {

    @ViewModelScoped
    @Provides
    fun providesMainRepository(
        mainService: MainService
    ) : MainRepository = MainRepositoryImpl(mainService)
}