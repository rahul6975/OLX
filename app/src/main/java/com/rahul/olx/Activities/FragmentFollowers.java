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


public class FragmentFollowers extends Fragment {


    private Button mBtnInviteFriends_followers;
    private MyNetworkActivity myNetworkActivity;

    public FragmentFollowers() {
        // Required empty public constructor
    }
    public static  FragmentFollowers newInstanse() {
        FragmentFollowers fragmentFollowers = new FragmentFollowers();
        return fragmentFollowers;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myNetworkActivity =(MyNetworkActivity) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mBtnInviteFriends_followers= view.findViewById(R.id.btnInviteFriends_Followers);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_followers, container, false);
    }
}