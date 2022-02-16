package com.example.multiplication.ui.component.main.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiplication.data.dto.RankItem;
import com.example.multiplication.databinding.ItemMainBinding;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private ItemMainBinding mBinding;

    public MainViewHolder(ItemMainBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public void bind(RankItem rankItem) {
        mBinding.name.setText(rankItem.getName());
    }


}
