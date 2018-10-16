package com.example.admin.interceptipchallenge.di.activity;

import com.example.admin.interceptipchallenge.di.factories.ConversionsViewModelFactory;
import com.example.admin.interceptipchallenge.ui.MainActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    ConversionsViewModelFactory getConversionViewModelFactory();

    void inject(MainActivity mainActivity);
}
