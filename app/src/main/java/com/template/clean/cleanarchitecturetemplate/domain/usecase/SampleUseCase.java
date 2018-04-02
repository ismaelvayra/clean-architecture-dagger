package com.template.clean.cleanarchitecturetemplate.domain.usecase;

import com.template.clean.cleanarchitecturetemplate.domain.model.SampleArtistModel;
import com.template.clean.cleanarchitecturetemplate.domain.repository.Service;
import com.template.clean.cleanarchitecturetemplate.domain.usecase.base.BaseUseCase;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class SampleUseCase extends BaseUseCase {

    @Inject
    Service service;

    private HomeUseCaseCallBack homeUseCaseCallBack;

    public SampleUseCase() {}

    public void loadArtistList(String artistName, String appId) {
        Call<SampleArtistModel> artistCall = service.getApiClient().getArtistByName(artistName, appId);
        artistCall.enqueue(new Callback<SampleArtistModel>() {
            @Override
            public void onResponse(Call<SampleArtistModel> call, Response<SampleArtistModel> response) {
                homeUseCaseCallBack.onGetArtistListResponse(response.body());
            }

            @Override
            public void onFailure(Call<SampleArtistModel> call, Throwable t) {
                homeUseCaseCallBack.onGetArtistListError();
            }
        });
    }

    public interface HomeUseCaseCallBack {
        void onGetArtistListResponse(SampleArtistModel artist);
        void onGetArtistListError();
    }
}
