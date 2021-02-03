package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.rahul.olx.AllInOneResponseClasses.AllInOneResponseClasses;
import com.rahul.olx.AllInOneResponseClasses.DataClasses;
import com.rahul.olx.ApiCallInterfaces.AllInOneApiClient;
import com.rahul.olx.ApiCallInterfaces.BikeApiClient;
import com.rahul.olx.BikesResponseClasses.BikeResponseClass;
import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.olx.Networks.Network;
import com.rahul.olx.R;
import com.rahul.olx.ViewAdatpers.AllInOneViewAdapter;
import com.rahul.olx.ViewAdatpers.BikeViewAdapter;
import com.rahul.olx.ViewAdatpers.BrowseCategoriesAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Homepage extends AppCompatActivity {

    private ArrayList<BrowseCategoriesModelClass> modelClassArrayList = new ArrayList<>();
    private RecyclerView rvBrowseCategories,rvForAll ;
    private List<DataClasses> dataClassesArrayList = new ArrayList<>();
    private AllInOneViewAdapter adapter;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        buildBrowseCategory();
        initViewsAndListeners();
        getApiInsideRecyclerView();
        setAdapter();
    }

    private void setAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rvForAll.setLayoutManager(gridLayoutManager);
        adapter = new AllInOneViewAdapter(dataClassesArrayList);
        rvForAll.setAdapter(adapter);
    }

    private void getApiInsideRecyclerView() {
        AllInOneApiClient apiClient = Network.getInstance().create(AllInOneApiClient.class);
        apiClient.fetchApi().enqueue(new Callback<AllInOneResponseClasses>() {
            @Override
            public void onResponse(Call<AllInOneResponseClasses> call, Response<AllInOneResponseClasses> response) {
                if(response.body() != null)
                {
                    dataClassesArrayList = response.body().getData();
                    adapter.updateDataFromApi(dataClassesArrayList);
                    pb.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<AllInOneResponseClasses> call, Throwable t) {

            }
        });
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
        rvBrowseCategories = findViewById(R.id.rvBrowseCategories);
        rvForAll = findViewById(R.id.RVForAll);
        pb = findViewById(R.id.ProgressBar);
        BrowseCategoriesAdapter adapter = new BrowseCategoriesAdapter(modelClassArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rvBrowseCategories.setLayoutManager(linearLayoutManager);
        rvBrowseCategories.setAdapter(adapter);
    }
}