package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.BangaloreResponseClasses.ResponseBangaloreClasses;
import com.rahul.olx.ElectronicsResponseClasses.ResponseElectronicClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ElectronicApiClient {

    @GET("relevance/v2/search?category=99&facet_limit=100&location=1000001&location_facet_limit=20&platform=web-desktop&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseElectronicClasses> getApit();
}
