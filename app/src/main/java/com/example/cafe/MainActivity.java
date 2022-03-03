package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton viewItems, viewItems2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewItems = findViewById(R.id.viewItems1);
        viewItems2 = findViewById(R.id.viewItems2);


        viewItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTabs = new Intent(MainActivity.this, Tabs.class);
                startActivity(toTabs);
            }
        });

        viewItems2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDataList = new Intent(MainActivity.this, data_list.class);
                startActivity(toDataList);
            }
        }));

    }
}