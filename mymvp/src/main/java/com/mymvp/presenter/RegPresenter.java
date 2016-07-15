package com.mymvp.presenter;

import com.mymvp.view.RegView;
import com.mymvp.common.BasePresenter;
import com.mymvp.controller.RegController;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class RegPresenter extends BasePresenter<RegView> implements RegController{
    public RegPresenter(RegView view) {
        super(view);
    }

    @Override
    public void reg() {
    }

}
