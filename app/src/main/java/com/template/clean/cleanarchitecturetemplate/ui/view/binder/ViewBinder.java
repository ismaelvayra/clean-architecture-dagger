package com.template.clean.cleanarchitecturetemplate.ui.view.binder;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public interface ViewBinder {

    /**
     * Every object annotated with {@link butterknife.BindView} its gonna injected trough butterknife
     */
    void bindViews();

    /**
     * @return The layout id that's gonna be the activity view.
     */
    int getLayoutId();

    /**
     * Use this method to initialize view components.
     */
    void initViews();
}
