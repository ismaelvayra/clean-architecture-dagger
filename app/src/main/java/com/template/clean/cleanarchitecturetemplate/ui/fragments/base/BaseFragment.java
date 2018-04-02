package com.template.clean.cleanarchitecturetemplate.ui.fragments.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.template.clean.cleanarchitecturetemplate.ui.view.binder.ViewBinder;

import butterknife.ButterKnife;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public abstract class BaseFragment extends Fragment implements ViewBinder {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void bindViews() {
        ButterKnife.bind(this, getView());
    }

    @Override
    public int getLayoutId() {
        return -1;
    }

    @Override
    public void initViews() {

    }
}
