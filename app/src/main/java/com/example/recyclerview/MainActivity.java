package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     // Button click_button;
      RecyclerView recycler_view;
      RecyclerAdapter adapter;
      String monthNames[]= {"January","February","March","April","May","June","July","August","September"
    ,"October","November","December"};
      TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button click_button= findViewById(R.id.click_button);
      //  RecyclerView recycler_view = findViewById(R.id.recycler_view);
        RecyclerView recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this,monthNames);
        recycler_view.setAdapter(adapter);
        TextView textView = findViewById(R.id.textView);
    }
}