package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.MumbaiResponseClasses.ResponseMumbaiClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MumbaiApiClient {

    @GET("relevance/feed?location=4058997&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseMumbaiClasses> getApi();
}
