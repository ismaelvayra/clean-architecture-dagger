package com.template.clean.cleanarchitecturetemplate.dagger.components;

import com.template.clean.cleanarchitecturetemplate.CleanArchApplication;
import com.template.clean.cleanarchitecturetemplate.dagger.modules.MainModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        MainModule.class,
})
public interface MainComponent extends AndroidInjector<CleanArchApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(CleanArchApplication application);
        MainComponent build();
    }
    void inject(CleanArchApplication app);
}
