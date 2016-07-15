package com.mymvp.view.activity;

import android.view.View;
import android.widget.EditText;

import com.mymvp.R;
import com.mymvp.view.MainView;
import com.mymvp.common.BaseActivity;
import com.mymvp.common.BasePresenter;
import com.mymvp.presenter.MainPresenter;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;


public class MainActivity extends BaseActivity implements MainView{

    @ViewInject(R.id.editText)
    private EditText contact;
    @ViewInject(R.id.editText2)
    private EditText password;

    private MainPresenter presenter;

    @Event(value = {R.id.button,R.id.button3})
    private void onClick(View view) {
        switch (view.getId()){
            case R.id.button :presenter.login();break;
            case R.id.button3 :presenter.reg();break;
            default:break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter getPresenter() {
        presenter = new MainPresenter(this);
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
