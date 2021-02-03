package com.rahul.olx.ApiCallInterfaces;

import com.rahul.olx.JobsReponseClasses.ResponseJobClasses;
import com.rahul.olx.MobilesResponseClasses.ResponseMobileClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MobileApiClient {

    @GET("relevance/v2/search?category=1411&facet_limit=100&location=1000001&location_facet_limit=20&platform=web-desktop&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseMobileClasses> getApit();
}
