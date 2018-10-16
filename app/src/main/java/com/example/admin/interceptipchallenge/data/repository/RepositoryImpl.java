package com.example.admin.interceptipchallenge.data.repository;

import com.example.admin.interceptipchallenge.data.remote.RemoteServiceHelper;


import javax.inject.Inject;

public class RepositoryImpl implements Repository {

    private RemoteServiceHelper remoteServiceHelper;

    @Inject
    public RepositoryImpl(RemoteServiceHelper remoteServiceHelper) {
        this.remoteServiceHelper = remoteServiceHelper;

    }
}
