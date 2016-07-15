package com.mymvp.callback;

import com.mymvp.bean.Response;
import com.mymvp.bean.User;

import org.xutils.common.Callback;

/**
 * Created by jacyayj on 2016/7/14.
 */
public abstract class ResultCallback<T> implements Callback.CommonCallback<Response>{

    public CommonCallback getCallback(){
        return this;
    }

    @Override
    public void onSuccess(Response result) {
        switch (result.getCode()){
            case 0 : onSucceed((T) result.getData());break;
            default: break;
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
//        onFailed(500,ex.getMessage());
        User user = new User();
        user.setPassword("123");
        user.setContact("jacy");
        onSucceed((T) user);
    }

    @Override
    public void onCancelled(CancelledException cex) {
        onFailed(400,cex.getMessage());
    }

    public abstract void onStart();
    public abstract void onSucceed(T result);
    public abstract void onFailed(int errorCode, String errorMessage);
}
