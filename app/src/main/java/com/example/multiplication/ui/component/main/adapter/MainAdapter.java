package com.example.multiplication.ui.component.main.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiplication.data.dto.RankItem;
import com.example.multiplication.databinding.ItemMainBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<RankItem> mRankList;

    public MainAdapter(ArrayList<RankItem> rankList) {
        this.mRankList = rankList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMainBinding binding = ItemMainBinding.inflate (
                LayoutInflater.from(parent.getContext()),
                parent,
                false);

        return new MainViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(mRankList.get(position));
    }

    @Override
    public int getItemCount() {
        return mRankList.size();
    }
}
