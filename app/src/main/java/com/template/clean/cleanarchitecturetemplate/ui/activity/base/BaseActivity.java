package com.template.clean.cleanarchitecturetemplate.ui.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.template.clean.cleanarchitecturetemplate.ui.view.binder.ViewBinder;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

/**
 * Created by Ismael Vayra on 29/3/2018.
 *
 * Base activity that exposes all of common methods
 */

public abstract class BaseActivity extends AppCompatActivity implements ViewBinder {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        bindViews();
        initViews();
    }

    @Override
    public void bindViews() {
        ButterKnife.bind(this);
    }

    @Override
    public int getLayoutId() {
        return -1;
    }

    @Override
    public void initViews() {
        AndroidInjection.inject(this);
    }
}

