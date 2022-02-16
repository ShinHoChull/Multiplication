package com.example.multiplication.ui.component.splash;

import android.content.Intent;
import android.os.Bundle;

import com.example.multiplication.ui.component.main.MainActivity;
import com.example.multiplication.databinding.ActivitySplashBinding;
import com.example.multiplication.ui.base.BaseActivity;

public class SplashActivity extends BaseActivity<ActivitySplashBinding> {

    private final int mSplashTime = 1000;

    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.getRoot().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(
                        new Intent(getApplicationContext(), MainActivity.class)
                );
            }
        }, mSplashTime);
    }

    @Override
    protected void setUpListener() {

    }
}