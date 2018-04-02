package com.template.clean.cleanarchitecturetemplate.ui.presenter.base;

import com.template.clean.cleanarchitecturetemplate.domain.usecase.base.BaseUseCase;

import javax.inject.Inject;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class BasePresenter<T extends BasePresenter.View, V extends BaseUseCase> {

    private T view;
    private V useCase;

    @Inject
    public BasePresenter(T view, V useCase) {
        this.view = view;
        this.useCase = useCase;
    }

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }

    public V getUseCase() {
        return useCase;
    }

    public void setUseCase(V useCase) {
        this.useCase = useCase;
    }

    public void initialize() {

    }

    public interface View {

        void showLoading();

        void hideLoading();
    }

}
