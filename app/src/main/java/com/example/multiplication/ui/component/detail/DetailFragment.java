package com.example.multiplication.ui.component.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.multiplication.R;
import com.example.multiplication.databinding.FragmentDetailBinding;
import com.example.multiplication.ui.base.BaseFragment;

public class DetailFragment extends BaseFragment<FragmentDetailBinding> {


    @Override
    protected FragmentDetailBinding getViewBinding() {
        return FragmentDetailBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.e("DetailFragment", "onViewCrate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("DetailFragment", "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("DetailFragment", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("DetailFragment", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("DetailFragment", "onDetach");
    }

}