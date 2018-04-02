package com.template.clean.cleanarchitecturetemplate.domain.repository.contract;

import com.template.clean.cleanarchitecturetemplate.domain.model.SampleArtistModel;
import com.template.clean.cleanarchitecturetemplate.domain.usecase.SampleUseCase;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Ismael Vayra on 2/4/2018.
 */

public interface ApiContract {

    @GET("/artists/{artistname}")
    Call<SampleArtistModel> getArtistByName(
            @Path("artistname") String artistName,
            @Query("app_id") String appId
    );

}
