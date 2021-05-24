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

public class ImageFragment2 extends Fragment {

    private ImageView image2;
    private static String image;
    public static ImageFragment2 newInstance(String image2)
    {
        image = image2;
        ImageFragment2 imageFragment2 = new ImageFragment2();
        return imageFragment2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        image2 = view.findViewById(R.id.Image2);
        Glide.with(image2).load(image).into(image2);


    }
}