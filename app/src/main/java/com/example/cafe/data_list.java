package com.example.cafe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class data_list extends AppCompatActivity {

    private final String[] itemsList = {"Chowmein", "Momo", "Kathi Roll", "Mouse", "Monitor", "Chowmein", "Momo", "Kathi Roll", "Mouse", "Monitor"};


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        ItemListAdapter itemListAdapter = new ItemListAdapter(itemsList);
        recyclerView.setAdapter(itemListAdapter);

    }
}