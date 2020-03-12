package com.example.kmp

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AppModule::class
])
@Singleton
interface AppComponent {
    fun inject(application: ExampleApplication)
}
