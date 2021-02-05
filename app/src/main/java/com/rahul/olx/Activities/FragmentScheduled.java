package com.rahul.olx.Activities;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahul.olx.R;

public class FragmentScheduled extends Fragment {


    private MyOrdersActivity myOrdersActivity;

    public FragmentScheduled() {
        // Required empty public constructor
    }

    public static FragmentScheduled newInstance() {
        FragmentScheduled fragmentScheduled = new FragmentScheduled();
        return fragmentScheduled;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myOrdersActivity = (MyOrdersActivity) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scheduled, container, false);
    }
}