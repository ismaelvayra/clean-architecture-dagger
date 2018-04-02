package com.template.clean.cleanarchitecturetemplate.dagger.modules;

import com.template.clean.cleanarchitecturetemplate.domain.usecase.SampleUseCase;
import com.template.clean.cleanarchitecturetemplate.ui.activity.HomeActivity;
import com.template.clean.cleanarchitecturetemplate.ui.presenter.HomePresenter;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

@Module
public class MainModule {

    @Provides
    HomePresenter providesHomePresenter(HomePresenter.View view, SampleUseCase useCase) {
        return new HomePresenter(view, useCase);
    }

    @Provides
    SampleUseCase providesSampleUseCase() {
        return new SampleUseCase();
    }
}
