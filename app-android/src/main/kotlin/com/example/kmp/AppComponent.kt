package com.example.kmp

import com.example.kmp.feature.FeatureModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AppModule::class,
    FeatureModule::class
])
@Singleton
interface AppComponent {
    fun inject(application: ExampleApplication)
}
