package com.mymvp.view.activity;

import android.os.Bundle;

import com.mymvp.view.item.test;
import com.mymvp.bean.User;
import com.mymvp.common.CommonAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class ListActivity extends android.app.ListActivity{

    private List<User> data;
    private CommonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setContact("name"+i);
            user.setPassword("label"+i);
            data.add(user);
        }
        adapter = new CommonAdapter(this,new test());
        setListAdapter(adapter);
        adapter.refresh(data);
    }
}
