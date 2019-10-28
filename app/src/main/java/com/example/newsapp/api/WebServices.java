package com.example.newsapp.api;

import com.example.newsapp.model.SourceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebServices {

    @GET("sources")
    Call<SourceResponse> getNewSources(@Query("apiKey") String apiKey);
}
