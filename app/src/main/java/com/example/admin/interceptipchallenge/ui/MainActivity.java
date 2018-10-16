package com.example.admin.interceptipchallenge.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.admin.interceptipchallenge.AppController;
import com.example.admin.interceptipchallenge.R;
import com.example.admin.interceptipchallenge.databinding.ActivityMainBinding;
import com.example.admin.interceptipchallenge.di.activity.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ConversionsViewModel conversionsViewModel;

    @Inject
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        binding.setViewModel(conversionsViewModel);
        binding.setLifecycleOwner(this);
    }

    public void updateConversionAmount(View view) {
        switch (view.getId()) {
            case R.id.btnUsd:
                conversionsViewModel.convert(Double.parseDouble(binding.etUsd.getText().toString()), 0);
                break;

            case R.id.btnAud:
                conversionsViewModel.convert(Double.parseDouble(binding.etAud.getText().toString()), 1);
                break;

            case R.id.btnEur:
                conversionsViewModel.convert(Double.parseDouble(binding.etEur.getText().toString()), 2);
                break;
        }
    }

    private void injectDependencies() {
        ((AppController) getApplication()).getApplicationComponent().newActivityComponent(new ActivityModule(this)).inject(this);
    }
}
