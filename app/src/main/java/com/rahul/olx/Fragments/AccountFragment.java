package com.rahul.olx.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.olx.Activities.EditProfileActivity;
import com.rahul.olx.Activities.Help_and_Support;
import com.rahul.olx.Activities.Invoices_and_billing;
import com.rahul.olx.Activities.SavePreference;
import com.rahul.olx.Activities.Settings;
import com.rahul.olx.R;

public class AccountFragment extends Fragment {

    private ImageView ivHome, ivChat, ivSell, ivHeart, ivAccount;
    private TextView tvName, tvEdit, tvBuyPackages, tvSettings, tvHelp;
    private static String NAME = "name";

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivHome = view.findViewById(R.id.ibRefresh);
        ivChat = view.findViewById(R.id.ibLocation);
        ivSell = view.findViewById(R.id.ibHeart);
        tvBuyPackages = view.findViewById(R.id.TvBuyPackages);
        tvHelp = view.findViewById(R.id.TvHelpAndSupport);
        ivHeart = view.findViewById(R.id.ibChat);
        tvSettings = view.findViewById(R.id.TvSettings);
        tvEdit = view.findViewById(R.id.TvViewAndEdit);
        ivAccount = view.findViewById(R.id.ibUser);
        tvName = view.findViewById(R.id.TvSettingsProfileName);

        tvName.setText(SavePreference.getStringFromPre(getContext(), NAME));

        tvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditProfileActivity.class);
                startActivity(intent);
            }
        });

        tvBuyPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Invoices_and_billing.class);
                startActivity(intent);
            }
        });

        tvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Settings.class);
                startActivity(intent);
            }
        });

        tvHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Help_and_Support.class);
                startActivity(intent);
            }
        });

    }

    }
