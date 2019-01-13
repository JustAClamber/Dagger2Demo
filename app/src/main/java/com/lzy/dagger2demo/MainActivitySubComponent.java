package com.lzy.dagger2demo;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * @author lzy
 * @date 2018/11/4 21:20
 */

@Subcomponent(modules = {AndroidInjectionModule.class, MainActivitySubComponent.SubModule.class})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideName() {
            return MainActivity.class.getName();
        }

        @Provides
        Student provideStudent() {
            return new Student();
        }

        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }

        @Provides
        MainModel provideModel() {
            return new MainModel();
        }
    }

}
