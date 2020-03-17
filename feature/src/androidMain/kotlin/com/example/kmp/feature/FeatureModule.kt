package com.example.kmp.feature

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class FeatureModule {
    @Provides
    @Singleton
    fun provideFeatureDependency(): FeatureDependency {
        return FeatureDependency()
    }
}
