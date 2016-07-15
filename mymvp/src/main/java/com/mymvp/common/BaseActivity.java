package com.mymvp.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mymvp.callback.ResultCallback;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by jacyayj on 2016/7/14.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{

    private T p;
    private Toast toast;
    private Callback.Cancelable cancelable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        x.view().inject(this);
        p = getPresenter();
    }

    @Override
    public void post(RequestParams params, ResultCallback resultCallback){
        cancelable = x.http().post(params,resultCallback.getCallback());
        resultCallback.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }

    @Override
    public void toast(String msg) {
        if (toast == null)
            toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        else
            toast.setText(msg);
        toast.show();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Intent getBaseIntent() {
        return getIntent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        p.detachView();
    }

    @Override
    public void onBackPressed() {
        if (cancelable != null && cancelable.isCancelled())
            cancelable.cancel();
        else
            super.onBackPressed();
    }

    protected abstract int getLayoutId();
    protected abstract T getPresenter();
    protected abstract void initData();
}
