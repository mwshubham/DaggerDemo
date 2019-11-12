package com.example.daggerdemo.di

import com.example.daggerdemo.AuthActivity

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    internal abstract fun contributesAuthActivity(): AuthActivity

    @Module
    companion object {

        @JvmStatic
        @Provides
        internal fun returnStringObject(): String {
            return "returnSomeString()"
        }
    }

}
