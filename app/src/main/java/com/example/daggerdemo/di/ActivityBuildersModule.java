package com.example.daggerdemo.di;

import com.example.daggerdemo.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @Provides
    static String returnStringObject() {
        return "returnSomeString()";
    }

    @ContributesAndroidInjector
    abstract AuthActivity contributesAuthActivity();

}
