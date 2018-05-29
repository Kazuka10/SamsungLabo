package com.samsunglabo.aplikacjaKM.fragmenty;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by user on 29.05.2018.
 */

public class DataStorage {

    private static DataStorage instance;
    private final Retrofit retrofit;
    private final Api api;

    private DataStorage() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://91.244.248.19")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);
        api.get(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.v("AAAA", response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }

    public static DataStorage getInstance() {
        if (instance == null)
            instance = new DataStorage();
        return instance;
    }


}
