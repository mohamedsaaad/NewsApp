package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.newsapp.api.ApiManager;
import com.example.newsapp.model.SourceResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNewsApi(){
        ApiManager.getApis().getNewSources(Cosant.apiKey).enqueue(new Callback<SourceResponse>() {
            @Override
            public void onResponse(Call<SourceResponse> call, Response<SourceResponse> response) {

            }

            @Override
            public void onFailure(Call<SourceResponse> call, Throwable t) {

            }
        });
    }
}
