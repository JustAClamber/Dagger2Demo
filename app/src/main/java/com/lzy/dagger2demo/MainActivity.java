package com.lzy.dagger2demo;

import android.content.SharedPreferences;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {
    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;
    @Inject
    Student s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
