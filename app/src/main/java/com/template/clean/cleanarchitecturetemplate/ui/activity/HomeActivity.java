package com.template.clean.cleanarchitecturetemplate.ui.activity;

import android.widget.TextView;

import com.template.clean.cleanarchitecturetemplate.R;
import com.template.clean.cleanarchitecturetemplate.domain.usecase.SampleUseCase;
import com.template.clean.cleanarchitecturetemplate.ui.activity.base.BaseActivity;
import com.template.clean.cleanarchitecturetemplate.ui.presenter.HomePresenter;

import butterknife.BindView;

/**
 * Created by Ismael Vayra on 30/3/2018.
 */

public class HomeActivity extends BaseActivity implements HomePresenter.View {

    private HomePresenter homePresenter;

    @BindView(R.id.sampleText)
    TextView sampleText;

    @Override
    public int getLayoutId() {
        return R.layout.main_layout;
    }

    @Override
    public void initViews() {
        super.initViews();
        homePresenter = new HomePresenter(this, new SampleUseCase());
        homePresenter.initialize();
    }

    @Override
    public void setSampleText(String text) {
        sampleText.setText(text);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
