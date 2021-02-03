package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.rahul.olx.ApiCallInterfaces.BikeApiClient;
import com.rahul.olx.ApiCallInterfaces.CarApiClient;
import com.rahul.olx.ApiCallInterfaces.ElectronicApiClient;
import com.rahul.olx.ApiCallInterfaces.JobApiClient;
import com.rahul.olx.ApiCallInterfaces.MobileApiClient;
import com.rahul.olx.ApiCallInterfaces.PropertyApiClient;
import com.rahul.olx.BikesResponseClasses.BikeResponseClass;
import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.CarResponseClasses.ResponseCarClasses;
import com.rahul.olx.ElectronicsResponseClasses.DataElectronicClasses;
import com.rahul.olx.ElectronicsResponseClasses.ResponseElectronicClasses;
import com.rahul.olx.JobsReponseClasses.DataJobClasses;
import com.rahul.olx.JobsReponseClasses.ResponseJobClasses;
import com.rahul.olx.MobilesResponseClasses.DataMobileClasses;
import com.rahul.olx.MobilesResponseClasses.ResponseMobileClasses;
import com.rahul.olx.Networks.Network;
import com.rahul.olx.PropertiesResponseClasses.DataPropertyClasses;
import com.rahul.olx.PropertiesResponseClasses.ResponsePropertyClasses;
import com.rahul.olx.R;
import com.rahul.olx.ViewAdatpers.BikeViewAdapter;
import com.rahul.olx.ViewAdatpers.BikesViewAdapter;
import com.rahul.olx.ViewAdatpers.CarViewAdapter;
import com.rahul.olx.ViewAdatpers.ElectronicsViewAdapter;
import com.rahul.olx.ViewAdatpers.JobsViewAdapter;
import com.rahul.olx.ViewAdatpers.MobileViewAdapter;
import com.rahul.olx.ViewAdatpers.PropertyViewAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrowseCategoryDisplayer extends AppCompatActivity {
    private RecyclerView rv;
    private int position;
    private TextView tvCategoryName;
    private CarViewAdapter carViewAdapter;
    private ProgressBar pb;
    private BikesViewAdapter bikeViewAdapter;
    private JobsViewAdapter jobsViewAdapter;
    private ElectronicsViewAdapter electronicsViewAdapter;
    private MobileViewAdapter mobileViewAdapter;
    private PropertyViewAdapter propertyViewAdapter;
    private List<DataClass> bikeDataClassList = new ArrayList<>();
    private List<DataCarClasses> dataCarClassesArrayList = new ArrayList<>();
    private List<DataElectronicClasses> dataElectronicClassesArrayList = new ArrayList<>();
    private List<DataJobClasses> dataJobClassesArrayList = new ArrayList<>();
    private List<DataPropertyClasses> dataPropertyClassesArrayList = new ArrayList<>();
    private List<DataMobileClasses> dataMobileClassesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_category_displayer);
        initViews();
        getIntents();
        checkPosition();
    }

    private void initViews() {
        rv = findViewById(R.id.RVBC);
        tvCategoryName = findViewById(R.id.tvCategoryNameBC);
        pb = findViewById(R.id.ProgressBarBC);
    }

    private void checkPosition() {
        if (position == 0) {
            tvCategoryName.setText(R.string.cars);
            setCarRecyclerView();
            setCarAdapter();
        }
        if (position == 1) {
            tvCategoryName.setText(R.string.property);
            setPropertyRecyclerView();
            setPropertyAdapter();
        }
        if (position == 2) {
            tvCategoryName.setText(R.string.mobiles);
            setMobileRecyclerView();
            setMobileAdapter();
        }
        if (position == 3) {
            tvCategoryName.setText(R.string.jobs);
            setJobsRecyclerView();
            setJobsAdapter();
        }
        if (position == 4) {
            tvCategoryName.setText(R.string.bikes);
            setBikesRecyclerView();
            setBikesAdapter();
        }
        if (position == 5) {
            tvCategoryName.setText(R.string.electronics);
            setElectronicsRecyclerView();
            setElectronicsAdapter();
        }
    }

    private void setElectronicsAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        electronicsViewAdapter = new ElectronicsViewAdapter(dataElectronicClassesArrayList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(electronicsViewAdapter);
    }

    private void setElectronicsRecyclerView() {
        ElectronicApiClient apiClient = Network.getInstance().create(ElectronicApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseElectronicClasses>() {
            @Override
            public void onResponse(Call<ResponseElectronicClasses> call, Response<ResponseElectronicClasses> response) {
                if (response.body() != null) {
                    dataElectronicClassesArrayList = response.body().getData();
                    electronicsViewAdapter.updateData(dataElectronicClassesArrayList);
                    pb.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<ResponseElectronicClasses> call, Throwable t) {

            }
        });
    }

    private void setBikesAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        bikeViewAdapter = new BikesViewAdapter(bikeDataClassList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(bikeViewAdapter);
    }

    private void setBikesRecyclerView() {
        BikeApiClient apiClient = Network.getInstance().create(BikeApiClient.class);
        apiClient.getApi().enqueue(new Callback<BikeResponseClass>() {
            @Override
            public void onResponse(Call<BikeResponseClass> call, Response<BikeResponseClass> response) {
                if (response.body() != null) {
                    bikeDataClassList = response.body().getData();
                    bikeViewAdapter.updateData(bikeDataClassList);
                    pb.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<BikeResponseClass> call, Throwable t) {

            }
        });
    }

    private void setJobsAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        jobsViewAdapter = new JobsViewAdapter(dataJobClassesArrayList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(jobsViewAdapter);
    }

    private void setJobsRecyclerView() {
        JobApiClient apiClient = Network.getInstance().create(JobApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseJobClasses>() {
            @Override
            public void onResponse(Call<ResponseJobClasses> call, Response<ResponseJobClasses> response) {
                if (response.body() != null) {
                    dataJobClassesArrayList = response.body().getData();
                    jobsViewAdapter.updateData(dataJobClassesArrayList);
                    pb.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<ResponseJobClasses> call, Throwable t) {

            }
        });
    }

    private void setMobileAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mobileViewAdapter = new MobileViewAdapter(dataMobileClassesArrayList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(mobileViewAdapter);
    }

    private void setMobileRecyclerView() {
        MobileApiClient apiClient = Network.getInstance().create(MobileApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseMobileClasses>() {
            @Override
            public void onResponse(Call<ResponseMobileClasses> call, Response<ResponseMobileClasses> response) {
                if (response.body() != null) {
                    dataMobileClassesArrayList = response.body().getData();
                    mobileViewAdapter.updateData(dataMobileClassesArrayList);
                    pb.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<ResponseMobileClasses> call, Throwable t) {

            }
        });
    }

    private void setPropertyAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        propertyViewAdapter = new PropertyViewAdapter(dataPropertyClassesArrayList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(propertyViewAdapter);
    }

    private void setPropertyRecyclerView() {
        PropertyApiClient apiClient = Network.getInstance().create(PropertyApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponsePropertyClasses>() {
            @Override
            public void onResponse(Call<ResponsePropertyClasses> call, Response<ResponsePropertyClasses> response) {
                if (response.body() != null) {
                    dataPropertyClassesArrayList = response.body().getData();
                    propertyViewAdapter.updateData(dataPropertyClassesArrayList);
                    pb.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<ResponsePropertyClasses> call, Throwable t) {

            }
        });
    }

    private void setCarAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        carViewAdapter = new CarViewAdapter(dataCarClassesArrayList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(carViewAdapter);
    }

    private void setCarRecyclerView() {
        CarApiClient apiClient = Network.getInstance().create(CarApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseCarClasses>() {
            @Override
            public void onResponse(Call<ResponseCarClasses> call, Response<ResponseCarClasses> response) {
                if (response.body() != null) {
                    dataCarClassesArrayList = response.body().getData();
                    carViewAdapter.updateData(dataCarClassesArrayList);
                    pb.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ResponseCarClasses> call, Throwable t) {

            }
        });
    }


    private void getIntents() {
        if (getIntent() != null) {
            position = getIntent().getIntExtra("position", 0);
        }
    }
}