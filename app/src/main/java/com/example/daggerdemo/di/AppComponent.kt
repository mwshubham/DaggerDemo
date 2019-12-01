package com.example.daggerdemo.di

import android.app.Application
import com.example.daggerdemo.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * [AppComponent] as a Server
 * [BaseApplication] as a Client
 *
 * Reference: {@link https://www.youtube.com/watch?v=31vswk6r8FA&list=PLgCYzUzKIBE8AOAspC3DHoBNZIBHbIOsC&index=6}
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
