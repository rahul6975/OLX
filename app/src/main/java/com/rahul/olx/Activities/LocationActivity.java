package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rahul.olx.R;
import com.rahul.olx.ViewAdatpers.LocationViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class LocationActivity extends AppCompatActivity {
    private RecyclerView rv;

    private List<LocationModelClass> modelClasses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        rv = findViewById(R.id.RVLocation);
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        LocationViewAdapter adapter = new LocationViewAdapter(modelClasses);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapter);
    }

    private void buildData() {
        modelClasses.add(new LocationModelClass("Andaman & Nicobar Islands"));
        modelClasses.add(new LocationModelClass("Andhra Pradesh"));
        modelClasses.add(new LocationModelClass("Arunachal Pradesh"));
        modelClasses.add(new LocationModelClass("Assam"));
        modelClasses.add(new LocationModelClass("Bihar"));
        modelClasses.add(new LocationModelClass("Chandigarh"));
        modelClasses.add(new LocationModelClass("Chhattisgarh"));
        modelClasses.add(new LocationModelClass("Dadra & Nagar Haveli"));
        modelClasses.add(new LocationModelClass("Daman & Diu"));
        modelClasses.add(new LocationModelClass("Delhi"));
        modelClasses.add(new LocationModelClass("Goa"));
        modelClasses.add(new LocationModelClass("Gujarat"));
        modelClasses.add(new LocationModelClass("Haryana"));
        modelClasses.add(new LocationModelClass("Himachal Pradesh"));
        modelClasses.add(new LocationModelClass("Jammu & Kashmir"));
        modelClasses.add(new LocationModelClass("Jharkhand"));
        modelClasses.add(new LocationModelClass("Karnataka"));
        modelClasses.add(new LocationModelClass("Kerala"));
        modelClasses.add(new LocationModelClass("Lakshadweep"));
        modelClasses.add(new LocationModelClass("Madhya Pradesh"));
        modelClasses.add(new LocationModelClass("Maharashtra"));
        modelClasses.add(new LocationModelClass("Manipur"));
        modelClasses.add(new LocationModelClass("Meghalaya"));
        modelClasses.add(new LocationModelClass("Mizoram"));
        modelClasses.add(new LocationModelClass("Nagaland"));
        modelClasses.add(new LocationModelClass("Odisha"));
        modelClasses.add(new LocationModelClass("Pondicherry"));
        modelClasses.add(new LocationModelClass("Punjab"));
        modelClasses.add(new LocationModelClass("Rajasthan"));
        modelClasses.add(new LocationModelClass("Tamil Nadu"));
        modelClasses.add(new LocationModelClass("Telangana"));
        modelClasses.add(new LocationModelClass("Tripura"));
        modelClasses.add(new LocationModelClass("Uttar Pradesh"));
        modelClasses.add(new LocationModelClass("Uttaranchal"));
        modelClasses.add(new LocationModelClass("West Bengal"));
    }
}