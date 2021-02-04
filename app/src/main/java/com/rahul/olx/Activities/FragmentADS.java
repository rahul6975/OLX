package com.rahul.olx.Activities;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rahul.olx.R;


public class FragmentADS extends Fragment {

        private Button mBtnDiscoverAds;
        private MyAdsActivity myAdsActivity;

        public FragmentADS() {
            // Required empty public constructor
        }
    public static  FragmentADS newInstanse() {
        FragmentADS fragmentADS = new FragmentADS();
        return fragmentADS;
    }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public void onAttach(@NonNull Context context) {
            super.onAttach(context);
           myAdsActivity =(MyAdsActivity)context;
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            initViews(view);
        }

        private void initViews(View view) {
         mBtnDiscoverAds = view.findViewById(R.id.btnDiscover_ads);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_a_d_s, container, false);
        }

}