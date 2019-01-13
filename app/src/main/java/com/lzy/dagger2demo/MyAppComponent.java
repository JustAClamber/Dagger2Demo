package com.lzy.dagger2demo;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author lzy
 * @date 2018/11/4 21:19
 */

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,})
public interface MyAppComponent {
    void inject(MyApplication application);
}
