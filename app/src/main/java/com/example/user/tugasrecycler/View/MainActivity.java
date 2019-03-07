package com.example.user.tugasrecycler.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.tugasrecycler.Adapter.TempatAdapter;
import com.example.user.tugasrecycler.Model.TempatModel;
import com.example.user.tugasrecycler.Presenter.TempatPresenter;
import com.example.user.tugasrecycler.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    RecyclerView rv,rv1,rv2;
    TempatAdapter adapter;
    TempatPresenter data;
    List<TempatModel> tempatModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler_vertikal);
        rv1 = findViewById(R.id.recycler_horizontal);
        rv2 = findViewById(R.id.recycler_grid);

        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TempatAdapter(this, tempatModels);
        rv.setAdapter(adapter);
        data = new TempatPresenter(this,this);
        data.setData();

        rv1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        adapter = new TempatAdapter(this, tempatModels);
        rv1.setAdapter(adapter);
        data = new TempatPresenter(this,this);
        data.setData();

        rv2.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        adapter = new TempatAdapter(this, tempatModels);
        rv2.setAdapter(adapter);
        data = new TempatPresenter(this,this);
        data.setData();
    }

    public void onSuccess(List<TempatModel> tempatModels){
        this.tempatModels.clear();
        this.tempatModels.addAll(tempatModels);
        this.adapter.notifyDataSetChanged();
    }
}
