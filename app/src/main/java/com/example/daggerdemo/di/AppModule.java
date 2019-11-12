package com.example.daggerdemo.di;

import android.app.Application;

import androidx.annotation.Nullable;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String returnStringObject() {
        return "AppModule";
    }

    @Provides
    static boolean getApp(@Nullable Application application) {
        return application == null;
    }
}
