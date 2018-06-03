package com.samsunglabo.aplikacjaKM.fragmenty;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by user on 29.05.2018.
 */

public interface Api {
    @GET("/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4128329f-5adb-4082-b326-6e1aea7caddf/download/routes.json")
    String get(Callback<String> callback);

}
