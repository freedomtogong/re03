package com.example.re03;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class PuRecyclerActivity extends AppCompatActivity {
    RecyclerView but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler);
        but=findViewById(R.id.rv_pu);
        but.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        but.setAdapter(new AtaggerAdapter(PuRecyclerActivity.this));
    }
}