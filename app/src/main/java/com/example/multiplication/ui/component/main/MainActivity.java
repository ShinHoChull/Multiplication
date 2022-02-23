package com.example.multiplication.ui.component.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.multiplication.R;
import com.example.multiplication.data.dto.RankItem;
import com.example.multiplication.databinding.ActivityMainBinding;
import com.example.multiplication.ui.base.BaseActivity;
import com.example.multiplication.ui.component.detail.DetailFragment;
import com.example.multiplication.ui.component.main.adapter.MainAdapter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    private MainAdapter mAdapter;


    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpTempData();
        setUpInit();
    }

    private void setUpInit() {
        binding.recyclerView.setAdapter(mAdapter);
    }

    private void setUpTempData() {

        ArrayList<RankItem> itemList = new ArrayList<>();
        itemList.add(new RankItem(0, "A", 10, "2020-02-16"));
        itemList.add(new RankItem(1, "B", 5, "2020-02-14"));
        itemList.add(new RankItem(2, "C", 20, "2020-02-15"));
        itemList.add(new RankItem(3, "D", 20, "2020-02-12"));

        mAdapter = new MainAdapter(itemList);
    }

    @Override
    protected void setUpListener() {
        binding.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_dark);
                dialog.setCancelable(true);

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

                dialog.show();
                dialog.getWindow().setAttributes(lp);

                ((Button)dialog.findViewById(R.id.start_button)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.hide();

                        if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_view) == null) {
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fragment_container_view, new DetailFragment())
                                    .commit();
                        }
                    }
                });

                ((ImageButton)dialog.findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.hide();
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Log.e("backButtonClick", "onBackPressed");
        //binding.fragmentContainerView.setVisibility(View.GONE);
        if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_view) != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(
                            getSupportFragmentManager().findFragmentById(R.id.fragment_container_view))
                    .commit();
        }


    }
}