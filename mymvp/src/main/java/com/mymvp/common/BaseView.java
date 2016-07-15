package com.mymvp.common;

import android.content.Context;
import android.content.Intent;

import com.mymvp.callback.ResultCallback;

import org.xutils.http.RequestParams;

/**
 * Created by jacyayj on 2016/7/14.
 */
public interface BaseView {

    Context getContext();
    Intent getBaseIntent();
    void toast(String msg);
    void post(RequestParams params, ResultCallback resultCallback);
}
