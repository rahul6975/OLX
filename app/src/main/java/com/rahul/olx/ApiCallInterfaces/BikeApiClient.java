package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.BikesResponseClasses.BikeResponseClass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BikeApiClient {

    @GET("relevance/v2/search?category=81&facet_limit=100&location=2001163&location_facet_limit=20&platform=web-desktop&user=177617c8e60x2ac165fa&lang=en")
    Call<BikeResponseClass> getApi();
}
