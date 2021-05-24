package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.BangaloreResponseClasses.ResponseBangaloreClasses;
import com.rahul.olx.DelhiResponseClasses.ResponseDelhiClasses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BangaloreApiClient {

    @GET("relevance/feed?location=2001159&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseBangaloreClasses> getApit();

}
