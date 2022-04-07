package com.example.recyclerviewpoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("Kinnekulle", "Billingen", "K2", "Kebenikaise",
                                               "Hanneberg", "Hunneberg");

        recyclerView = findViewById(R.id.my_recycler_view);
    }
}