package com.template.clean.cleanarchitecturetemplate.dagger.modules;

import com.template.clean.cleanarchitecturetemplate.ui.activity.HomeActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

@Module
public abstract class MainModule {

    @ContributesAndroidInjector
    abstract HomeActivity contributeActivityInjector();

}
