package com.mymvp.common;

import android.content.Intent;

import java.lang.ref.WeakReference;

/**
 * Created by jacyayj on 2016/7/14.
 */
public abstract class BasePresenter<T extends BaseView> {

    private WeakReference<T> weakReference;

    public BasePresenter(T view) {
        attachView(view);
    }

    protected T getView(){
        return weakReference.get();
    }

    protected void startActivity(String action){
        getView().getContext().startActivity(new Intent(action));
    }

    protected void attachView(T view){
        weakReference = new WeakReference<>(view);
    }

    protected void detachView(){
        if (weakReference != null){
            weakReference.clear();
            weakReference = null;
        }
    }

    protected boolean isViewAttached(){
        return weakReference != null && weakReference.get() != null ? true : false;
    }

}
