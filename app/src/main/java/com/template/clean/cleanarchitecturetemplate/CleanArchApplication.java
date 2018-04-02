package com.template.clean.cleanarchitecturetemplate;

import android.app.Activity;
import android.app.Application;

import com.template.clean.cleanarchitecturetemplate.dagger.components.DaggerMainComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Ismael Vayra on 30/3/2018.
 */

public class CleanArchApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMainComponent.create().inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
