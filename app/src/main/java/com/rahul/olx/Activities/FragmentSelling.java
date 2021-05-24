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

import com.rahul.olx.Fragments.CategoriesFragment;
import com.rahul.olx.R;


public class FragmentSelling extends Fragment {
    private Button mBtnExploreTheADS_selling;
    private MainActivity chatActivity;
    private Button btnExplore;

    public FragmentSelling() {
        // Required empty public constructor
    }
    public static  FragmentSelling newInstanse() {
        FragmentSelling fragmentSelling = new FragmentSelling();
        return fragmentSelling;
    }

    public static FragmentSelling newInstance(String param1, String param2) {
        FragmentSelling fragment = new FragmentSelling();
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

        btnExplore = view.findViewById(R.id.btnStartSelling_selling);
        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


    private void initViews(View view) {
        mBtnExploreTheADS_selling = view.findViewById(R.id.btnStartSelling_selling);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selling, container, false);
    }
}