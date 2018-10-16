package com.example.admin.interceptipchallenge;

import android.app.Application;

import com.example.admin.interceptipchallenge.di.application.ApplicationComponent;
import com.example.admin.interceptipchallenge.di.application.ApplicationModule;
import com.example.admin.interceptipchallenge.di.application.DaggerApplicationComponent;

public class AppController extends Application {

    private ApplicationComponent applicationComponent;

    public ApplicationComponent getApplicationComponent() {
        if (applicationComponent == null) {
            createApplicationComponent();
        }

        return applicationComponent;
    }

    private void createApplicationComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();
    }
}
