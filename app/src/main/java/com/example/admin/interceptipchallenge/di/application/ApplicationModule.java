package com.example.admin.interceptipchallenge.di.application;

import com.example.admin.interceptipchallenge.data.remote.RemoteServiceHelper;
import com.example.admin.interceptipchallenge.data.repository.Repository;
import com.example.admin.interceptipchallenge.data.repository.RepositoryImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @ApplicationScope
    public RemoteServiceHelper providesRemoteServiceHelper() {
        return new RemoteServiceHelper();
    }

    @Provides
    @ApplicationScope
    public Repository providesRepository(RemoteServiceHelper remoteServiceHelper) {
        return new RepositoryImpl(remoteServiceHelper);
    }
}
