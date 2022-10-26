package com.example.shoesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        RecyclerView.Adapter recylcerViewAdapter;
        RecyclerView.LayoutManager recyclerViewLayoutManager;
        ArrayList<itemModel> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recvylerView);
        recyclerView.setHasFixedSize(true);
        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        data = new ArrayList<>();
        for(int i = 0; i < Myitem.headLine.length; i++){
            data.add(new itemModel(
                    Myitem.headLine[i],
                    Myitem.subheadLine[i],
                    Myitem.hargaLine[i],
                    Myitem.listGambar[i]));
        }

        recylcerViewAdapter = new AdapterRecyclerView(data);
        recyclerView.setAdapter(recylcerViewAdapter);

    }
}