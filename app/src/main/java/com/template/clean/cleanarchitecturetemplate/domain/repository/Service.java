package com.template.clean.cleanarchitecturetemplate.domain.repository;

import com.template.clean.cleanarchitecturetemplate.domain.model.SampleArtistModel;
import com.template.clean.cleanarchitecturetemplate.domain.repository.contract.ApiContract;

import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ismael Vayra on 2/4/2018.
 */

public class Service {

    private static final String BASE_URL = "rest.bandsintown.com";

    private Retrofit retrofit;

    public Service() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public ApiContract getApiClient() {
        return retrofit.create(ApiContract.class);
    }
}
