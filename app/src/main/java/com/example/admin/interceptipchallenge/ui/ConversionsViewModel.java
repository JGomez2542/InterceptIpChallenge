package com.example.admin.interceptipchallenge.ui;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.admin.interceptipchallenge.data.repository.Repository;
import com.example.admin.interceptipchallenge.models.AUDConversion;
import com.example.admin.interceptipchallenge.models.EURConversion;
import com.example.admin.interceptipchallenge.models.USDConversion;

public class ConversionsViewModel extends ViewModel {

    private Repository repository;
    private USDConversion usdConversionModel;
    private AUDConversion audConversionModel;
    private EURConversion eurConversionModel;
    private MutableLiveData<String> usdConversionAmountLiveData;
    private MutableLiveData<String> eurConversionAmountLiveData;
    private MutableLiveData<String> audConversionAmountLiveData;

    public ConversionsViewModel(Repository repository,
                                USDConversion usdConversionModel,
                                AUDConversion audConversionModel,
                                EURConversion eurConversionModel,
                                MutableLiveData<String> usdConversionAmountLiveData,
                                MutableLiveData<String> audConversionAmountLiveData,
                                MutableLiveData<String> eurConversionAmountLiveData) {
        this.repository = repository;
        this.usdConversionModel = usdConversionModel;
        this.eurConversionModel = eurConversionModel;
        this.audConversionModel = audConversionModel;
        this.usdConversionAmountLiveData = usdConversionAmountLiveData;
        this.eurConversionAmountLiveData = eurConversionAmountLiveData;
        this.audConversionAmountLiveData = audConversionAmountLiveData;
    }

    public void convert(double conversionAmount, int currencyType) {
        switch (currencyType) {
            case 0:
                usdConversionAmountLiveData.setValue(String.valueOf(conversionAmount * usdConversionModel.getExchangeRate()));
                break;

            case 1:
                audConversionAmountLiveData.setValue(String.valueOf(conversionAmount * audConversionModel.getExchangeRate()));
                break;

            case 2:
                eurConversionAmountLiveData.setValue(String.valueOf(conversionAmount * eurConversionModel.getExchangeRate()));
                break;
        }
    }

    public MutableLiveData<String> getUsdConversionAmountLiveData() {
        return usdConversionAmountLiveData;
    }

    public MutableLiveData<String> getEurConversionAmountLiveData() {
        return eurConversionAmountLiveData;
    }

    public MutableLiveData<String> getAudConversionAmountLiveData() {
        return audConversionAmountLiveData;
    }
}
