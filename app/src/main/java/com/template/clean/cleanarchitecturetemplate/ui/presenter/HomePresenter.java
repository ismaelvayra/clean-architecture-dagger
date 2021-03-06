package com.template.clean.cleanarchitecturetemplate.ui.presenter;

import com.template.clean.cleanarchitecturetemplate.domain.model.SampleArtistModel;
import com.template.clean.cleanarchitecturetemplate.domain.usecase.SampleUseCase;
import com.template.clean.cleanarchitecturetemplate.ui.presenter.base.BasePresenter;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class HomePresenter extends BasePresenter<HomePresenter.View, SampleUseCase> implements SampleUseCase.HomeUseCaseCallBack {

    @Inject
    public HomePresenter(View view, SampleUseCase useCases) {
        super(view, useCases);
    }

    @Override
    public void initialize() {
        super.initialize();
        getUseCase().loadArtistList("Santana", "2");
    }

    @Override
    public void onGetArtistListResponse(SampleArtistModel artist) {
        String agag;
    }

    @Override
    public void onGetArtistListError() {

    }

    public interface View extends BasePresenter.View {
        void setSampleText(String text);
    }
}
