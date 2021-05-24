package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.AllInOneResponseClasses.AllInOneResponseClasses;
import com.rahul.olx.BangaloreResponseClasses.ResponseBangaloreClasses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AllInOneApiClient {

    @GET("relevance/v2/search?facet_limit=100&location=1000001&location_facet_limit=20&platform=web-desktop&user=177617c8e60x2ac165fa&lang=en")
    Call<AllInOneResponseClasses> fetchApi();

}
