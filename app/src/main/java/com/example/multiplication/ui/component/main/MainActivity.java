package com.example.multiplication.ui.component.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.app.Activity;
import android.os.Bundle;

import com.example.multiplication.data.dto.RankItem;
import com.example.multiplication.databinding.ActivityMainBinding;
import com.example.multiplication.ui.base.BaseActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<ActivityMainBinding> {


    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpTempData();


    }

    private void setUpTempData() {
        ArrayList<RankItem> item = new ArrayList<>();
        item.add(new RankItem(0, "A", 10, "2020-02-16"));
        item.add(new RankItem(1, "B", 5, "2020-02-14"));
        item.add(new RankItem(2, "C", 20, "2020-02-15"));
        item.add(new RankItem(3, "D", 20, "2020-02-12"));

    }

    @Override
    protected void setUpListener() {

    }

}