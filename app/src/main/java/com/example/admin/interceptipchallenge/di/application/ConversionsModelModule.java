package com.example.admin.interceptipchallenge.di.application;

import com.example.admin.interceptipchallenge.models.AUDConversion;
import com.example.admin.interceptipchallenge.models.EURConversion;
import com.example.admin.interceptipchallenge.models.USDConversion;

import dagger.Module;
import dagger.Provides;

@Module
public class ConversionsModelModule {

    @Provides
    public USDConversion providesUsdConversionLiveData() {
        return new USDConversion();
    }

    @Provides
    public EURConversion providesEurConversionLiveData() {
        return new EURConversion();

    }

    @Provides
    public AUDConversion providesAudConversion() {
        return new AUDConversion();
    }
}
