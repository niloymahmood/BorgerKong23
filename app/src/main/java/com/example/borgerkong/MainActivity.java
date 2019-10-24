package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerView);
        layoutManager = new LinearLayoutManager( this);
        recyclerView.setLayoutManager(layoutManager);

        Adapter adapter = new Adapter();

        adapter.setData(FoodDatabase.getAllFood());
        recyclerView.setAdapter(adapter);


    }
}
