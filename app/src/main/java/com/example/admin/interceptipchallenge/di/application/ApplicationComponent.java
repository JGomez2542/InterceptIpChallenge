package com.example.admin.interceptipchallenge.di.application;

import com.example.admin.interceptipchallenge.di.activity.ActivityComponent;
import com.example.admin.interceptipchallenge.di.activity.ActivityModule;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class, LiveDataModule.class, ConversionsModelModule.class})
public interface ApplicationComponent {

    ActivityComponent newActivityComponent(ActivityModule activityModule);
}
