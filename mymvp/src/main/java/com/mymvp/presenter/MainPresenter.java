package com.mymvp.presenter;

import com.mymvp.view.MainView;
import com.mymvp.bean.Action;
import com.mymvp.bean.User;
import com.mymvp.callback.ResultCallback;
import com.mymvp.common.BasePresenter;
import com.mymvp.controller.MainController;
import com.orhanobut.logger.Logger;

import org.xutils.http.RequestParams;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class MainPresenter extends BasePresenter<MainView> implements MainController{
    public MainPresenter(MainView view) {
        super(view);
    }

    @Override
    public void login() {
        RequestParams params = new RequestParams("");
        getView().post(params, new ResultCallback<User>() {
            @Override
            public void onFinished() {

            }

            @Override
            public void onStart() {

            }

            @Override
            public void onSucceed(User result) {
                Logger.json(result.toJson());
            }

            @Override
            public void onFailed(int errorCode, String errorMessage) {

            }
        });
    }

    @Override
    public void reg() {
        startActivity(Action.REG);
    }
}
