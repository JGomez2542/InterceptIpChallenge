package com.example.admin.interceptipchallenge.di.factories;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.admin.interceptipchallenge.data.repository.Repository;
import com.example.admin.interceptipchallenge.models.AUDConversion;
import com.example.admin.interceptipchallenge.models.EURConversion;
import com.example.admin.interceptipchallenge.models.USDConversion;
import com.example.admin.interceptipchallenge.ui.ConversionsViewModel;

import javax.inject.Inject;

public class ConversionsViewModelFactory implements ViewModelProvider.Factory {

    private Repository repository;
    private USDConversion usdConversionModel;
    private EURConversion eurConversionModel;
    private AUDConversion audConversionModel;
    private MutableLiveData<String> usdConversionAmount;
    private MutableLiveData<String> eurConversionAmount;
    private MutableLiveData<String> audConversionAmount;

    @Inject
    public ConversionsViewModelFactory(Repository repository,
                                       USDConversion usdConversionModel,
                                       AUDConversion audConversionModel,
                                       EURConversion eurConversionModel,
                                       MutableLiveData<String> usdConversionAmount,
                                       MutableLiveData<String> audConversionAmount,
                                       MutableLiveData<String> eurConversionAmount) {
        this.repository = repository;
        this.usdConversionModel = usdConversionModel;
        this.audConversionModel = audConversionModel;
        this.eurConversionModel = eurConversionModel;
        this.usdConversionAmount = usdConversionAmount;
        this.eurConversionAmount = eurConversionAmount;
        this.audConversionAmount = audConversionAmount;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ConversionsViewModel.class)) {
            return (T) new ConversionsViewModel(repository, usdConversionModel, audConversionModel,
                    eurConversionModel, usdConversionAmount,
                    audConversionAmount, eurConversionAmount);
        } else {
            throw new IllegalArgumentException("ViewModel not Found");
        }
    }
}
