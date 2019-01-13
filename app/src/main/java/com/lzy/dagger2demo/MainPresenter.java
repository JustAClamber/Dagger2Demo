package com.lzy.dagger2demo;

import javax.inject.Inject;

/**
 * @author lzy
 * @date 2018/11/4 22:08
 */
public class MainPresenter implements MainContract.Presenter{

    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }
}
