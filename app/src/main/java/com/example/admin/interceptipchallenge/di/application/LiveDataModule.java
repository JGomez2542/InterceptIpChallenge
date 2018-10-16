package com.example.admin.interceptipchallenge.di.application;

import android.arch.lifecycle.MutableLiveData;

import dagger.Module;
import dagger.Provides;

@Module
public class LiveDataModule {


    @Provides
    public MutableLiveData<String> providesStringMutableLiveData() {
        return new MutableLiveData<>();
    }
}
