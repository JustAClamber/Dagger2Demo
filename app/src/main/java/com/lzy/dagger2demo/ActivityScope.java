package com.lzy.dagger2demo;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lzy
 * @date 2018/11/4 22:05
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
