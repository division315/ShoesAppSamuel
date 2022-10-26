package com.example.shoesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<com.example.shoesapp.AdapterRecyclerView.ViewHolder> {

    private ArrayList<itemModel> dataItem;


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubHead;
        TextView hargaLine;
        ImageView listGambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_produk);
            textSubHead = itemView.findViewById(R.id.text_subproduk);
            hargaLine = itemView.findViewById(R.id.harga_produk);
            listGambar = itemView.findViewById(R.id.imageList);

        }
    }

    AdapterRecyclerView(ArrayList<itemModel>dataItem){
        this.dataItem= dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView textSubHead = holder.textSubHead;
        TextView hargaLine = holder.hargaLine;
        ImageView listGambar = holder.listGambar;

        textHead.setText(dataItem.get(position).getName());
        textSubHead.setText(dataItem.get(position).getName());
        hargaLine.setText(dataItem.get(position).getName());
        listGambar.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
