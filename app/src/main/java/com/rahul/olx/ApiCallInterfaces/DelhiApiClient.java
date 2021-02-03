package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.DelhiResponseClasses.ResponseDelhiClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DelhiApiClient {
    @GET("relevance/feed?location=4058659&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseDelhiClasses> getApit();
}
