package com.rahul.olx.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rahul.olx.R;


public class FragmentFavourites extends Fragment {

    private Button mBtnDiscoverFav, btnDiscover;
    private MainActivity myAdsActivity;

    public FragmentFavourites() {
        // Required empty public constructor
    }
    public static  FragmentFavourites newInstanse() {
        FragmentFavourites fragmentFavourites = new FragmentFavourites();
        return fragmentFavourites;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myAdsActivity =(MainActivity)context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
         btnDiscover = view.findViewById(R.id.btnDiscover_fav);
         btnDiscover.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getContext(), MainActivity.class);
                 startActivity(intent);
             }
         });
    }

    private void initViews(View view) {
        mBtnDiscoverFav= view.findViewById(R.id.btnDiscover_fav);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites, container, false);
    }
}