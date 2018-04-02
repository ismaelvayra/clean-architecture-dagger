package com.template.clean.cleanarchitecturetemplate.ui.presenter;

import com.template.clean.cleanarchitecturetemplate.domain.usecase.SampleUseCase;
import com.template.clean.cleanarchitecturetemplate.ui.presenter.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class HomePresenter extends BasePresenter<HomePresenter.View, SampleUseCase> {

    @Inject
    public HomePresenter(View view, SampleUseCase useCases) {
        super(view, useCases);
    }

    @Override
    public void initialize() {
        super.initialize();
        getView().setSampleText(getUseCase().getSampleEntity().getName());
    }

    public interface View extends BasePresenter.View {
        void setSampleText(String text);
    }
}
