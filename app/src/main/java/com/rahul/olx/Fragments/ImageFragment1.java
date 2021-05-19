package com.rahul.olx.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.rahul.olx.R;

public class ImageFragment1 extends Fragment {
    private static String image;
    private ImageView image1;

    public static ImageFragment1 newInstance(String image1)
    {
        image = image1;
        ImageFragment1 imageFragment1 = new ImageFragment1();
        return imageFragment1;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        image1 = view.findViewById(R.id.Image1);
        Glide.with(image1).load(image).into(image1);

    }
}