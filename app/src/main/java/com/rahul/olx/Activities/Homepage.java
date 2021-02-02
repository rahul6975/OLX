package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rahul.olx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.olx.R;
import com.rahul.olx.ViewAdatpers.BrowseCategoriesAdapter;

import java.util.ArrayList;

public class Homepage extends AppCompatActivity {

    private ArrayList<BrowseCategoriesModelClass> modelClassArrayList = new ArrayList<>();
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        buildBrowseCategory();
        initViewsAndListeners();
    }

    private void buildBrowseCategory() {
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_car,"OLX Autos (CARS)"));
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_house,"PROPERTIES"));
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_smartphone,"MOBILES"));
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_jobs,"JOBS"));
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_motorbike,"BIKES"));
        modelClassArrayList.add(new BrowseCategoriesModelClass(R.drawable.ic_desktop,"ELECTRONICS"));
    }

    private void initViewsAndListeners() {
        rv = findViewById(R.id.rvBrowseCategories);
        BrowseCategoriesAdapter adapter = new BrowseCategoriesAdapter(modelClassArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapter);

    }
}