package com.mymvp.view.activity;

import android.view.View;
import android.widget.EditText;

import com.mymvp.R;
import com.mymvp.view.RegView;
import com.mymvp.common.BaseActivity;
import com.mymvp.presenter.RegPresenter;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class RegActivity extends BaseActivity<RegPresenter> implements RegView{

    @ViewInject(R.id.editText3)
    private EditText contact;
    @ViewInject(R.id.editText4)
    private EditText password;

    private RegPresenter presenter;

    @Event(value = {R.id.button2})
    private void onClick(View view) {
        switch (view.getId()){
            case R.id.button2 :presenter.reg();break;
            default:break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reg;
    }

    @Override
    protected RegPresenter getPresenter() {
        presenter = new RegPresenter(this);
        return presenter;
    }

    @Override
    protected void initData() {

    }

    @Override
    public String getContact() {
        return contact.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }
}
