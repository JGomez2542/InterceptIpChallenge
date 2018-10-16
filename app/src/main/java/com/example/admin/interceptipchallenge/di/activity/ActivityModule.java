package com.example.admin.interceptipchallenge.di.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.interceptipchallenge.R;
import com.example.admin.interceptipchallenge.databinding.ActivityMainBinding;
import com.example.admin.interceptipchallenge.di.factories.ConversionsViewModelFactory;
import com.example.admin.interceptipchallenge.ui.ConversionsViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public ConversionsViewModel providesConversionsViewModel(ConversionsViewModelFactory conversionsViewModelFactory) {
        return ViewModelProviders.of(activity, conversionsViewModelFactory).get(ConversionsViewModel.class);
    }

    @Provides
    @ActivityScope
    public ActivityMainBinding providesActivityMainBinding() {
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }
}
