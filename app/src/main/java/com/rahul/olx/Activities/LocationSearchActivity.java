package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.rahul.olx.ApiCallInterfaces.BangaloreApiClient;
import com.rahul.olx.ApiCallInterfaces.DelhiApiClient;
import com.rahul.olx.ApiCallInterfaces.KolkataApiCient;
import com.rahul.olx.ApiCallInterfaces.MumbaiApiClient;
import com.rahul.olx.BangaloreResponseClasses.DataBangaloreClasses;
import com.rahul.olx.BangaloreResponseClasses.ResponseBangaloreClasses;
import com.rahul.olx.DelhiResponseClasses.DataDelhiClasses;
import com.rahul.olx.DelhiResponseClasses.ResponseDelhiClasses;
import com.rahul.olx.KolKataResponseClasses.DataKolkataClasses;
import com.rahul.olx.KolKataResponseClasses.ResponseKolkataClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.MumbaiResponseClasses.ResponseMumbaiClasses;
import com.rahul.olx.Networks.Network;
import com.rahul.olx.R;
import com.rahul.olx.ViewAdatpers.BangaloreViewAdapter;
import com.rahul.olx.ViewAdatpers.DelhiViewAdapter;
import com.rahul.olx.ViewAdatpers.KolkataViewAdapter;
import com.rahul.olx.ViewAdatpers.MumbaiViewAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LocationSearchActivity extends AppCompatActivity {
    private TextView tvLocation;
    private RecyclerView rv;
    private String location;
    private ProgressBar pb;
    private MumbaiViewAdapter adapter;
    private KolkataViewAdapter kolkataViewAdapter;
    private BangaloreViewAdapter bangaloreViewAdapter;
    private List<DataBangaloreClasses> dataBangaloreClassesList = new ArrayList<>();
    private List<DataDelhiClasses> dataDelhiClassesList = new ArrayList<>();
    private List<DataKolkataClasses> dataKolkataClassesList = new ArrayList<>();
    private List<DataMumbaiClasses> dataMumbaiClassesList = new ArrayList<>();
    private DelhiViewAdapter delhiViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_search);
        initViews();
        getIntents();
        checkLocation();
    }

    private void initViews() {
        tvLocation = findViewById(R.id.tvLocationName);
        pb = findViewById(R.id.ProgressBar);
        rv = findViewById(R.id.RV);


    }

    private void getIntents() {
        if (getIntent() != null) {
            location = getIntent().getStringExtra("location");
            tvLocation.setText(location);
        }
    }

    private void checkLocation() {
        if (location.contains("Mumbai") || location.contains("mumbai")) {
            setReyclerOfMumbai();
            setMumbaiAdapter();
        }
        else if(location.contains("Delhi") || location.contains("delhi"))
        {
            setReyclerOfDelhi();
            setDelhiAdapter();
        }
        else if(location.contains("Bangalore") || location.contains("bangalore"))
        {
            setReyclerOfBangalore();
            setBangaloreAdapter();
        }
        else if(location.contains("Kolkata") || location.contains("kolkata"))
        {
            setReyclerOfKolkata();
            setKolkataAdapter();
        }
    }

    private void setKolkataAdapter() {
        kolkataViewAdapter = new KolkataViewAdapter(dataKolkataClassesList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(kolkataViewAdapter);
    }

    private void setReyclerOfKolkata() {
        KolkataApiCient apiCient = Network.getInstance().create(KolkataApiCient.class);
        apiCient.getApi().enqueue(new Callback<ResponseKolkataClasses>() {
            @Override
            public void onResponse(Call<ResponseKolkataClasses> call, Response<ResponseKolkataClasses> response) {
                if(response.body() != null)
                {
                    dataKolkataClassesList = response.body().getData();
                    kolkataViewAdapter.updateData(dataKolkataClassesList);
                    pb.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ResponseKolkataClasses> call, Throwable t) {

            }
        });
    }

    private void setBangaloreAdapter() {
        bangaloreViewAdapter = new BangaloreViewAdapter(dataBangaloreClassesList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(bangaloreViewAdapter);
    }

    private void setReyclerOfBangalore() {
        BangaloreApiClient apiClient = Network.getInstance().create(BangaloreApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseBangaloreClasses>() {
            @Override
            public void onResponse(Call<ResponseBangaloreClasses> call, Response<ResponseBangaloreClasses> response) {
                if(response.body() != null)
                {
                    dataBangaloreClassesList = response.body().getData();
                    bangaloreViewAdapter.updateData(dataBangaloreClassesList);
                    pb.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ResponseBangaloreClasses> call, Throwable t) {

            }
        });
    }

    private void setDelhiAdapter() {
        delhiViewAdapter = new DelhiViewAdapter(dataDelhiClassesList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(delhiViewAdapter);
    }

    private void setReyclerOfDelhi() {
        DelhiApiClient apiClient = Network.getInstance().create(DelhiApiClient.class);
        apiClient.getApit().enqueue(new Callback<ResponseDelhiClasses>() {
            @Override
            public void onResponse(Call<ResponseDelhiClasses> call, Response<ResponseDelhiClasses> response) {
                if(response.body() != null)
                {
                   dataDelhiClassesList = response.body().getData();
                   delhiViewAdapter.updateData(dataDelhiClassesList);
                   pb.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ResponseDelhiClasses> call, Throwable t) {

            }
        });

    }

    private void setMumbaiAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new MumbaiViewAdapter(dataMumbaiClassesList);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapter);
    }

    private void setReyclerOfMumbai() {
        MumbaiApiClient apiClient = Network.getInstance().create(MumbaiApiClient.class);
        apiClient.getApi().enqueue(new Callback<ResponseMumbaiClasses>() {
            @Override
            public void onResponse(Call<ResponseMumbaiClasses> call, Response<ResponseMumbaiClasses> response) {
                if (response.body() != null) {
                    dataMumbaiClassesList = response.body().getData();
                    adapter.updateData(dataMumbaiClassesList);
                    pb.setVisibility(View.GONE);

                }
            }
            @Override
            public void onFailure(Call<ResponseMumbaiClasses> call, Throwable t) {

            }
        });
    }
}