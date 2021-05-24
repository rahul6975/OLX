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


public class FragmentBuying extends Fragment {
private Button mBtnExploreTheADS_buying;
    private MainActivity chatActivity;
    private Button btnExplore;

    public FragmentBuying() {
        // Required empty public constructor
    }
    public static  FragmentBuying newInstanse() {
        FragmentBuying fragmentBuying = new FragmentBuying();
        return fragmentBuying;
    }

    public static FragmentBuying newInstance(String param1, String param2) {
        FragmentBuying fragment = new FragmentBuying();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        chatActivity =(MainActivity) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        btnExplore = view.findViewById(R.id.btnExploreTheAds_buying);

        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews(View view) {
        mBtnExploreTheADS_buying = view.findViewById(R.id.btnExploreTheAds_buying);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buying, container, false);
    }
}