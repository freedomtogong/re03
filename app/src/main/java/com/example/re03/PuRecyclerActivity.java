package com.example.re03;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class PuRecyclerActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler);
        recyclerView =findViewById(R.id.rv_pu);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new AtaggerAdapter(PuRecyclerActivity.this, new AtaggerAdapter.MyOnclickLinstener() {

            @Override
            public void setOnclick(int pos) {
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(PuRecyclerActivity.this, "图片"+pos, Toast.LENGTH_SHORT).show();


                    }
                };
            }
        }));
    }
}