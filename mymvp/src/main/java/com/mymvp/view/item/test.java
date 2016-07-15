package com.mymvp.view.item;

import android.view.View;
import android.widget.TextView;

import com.mymvp.R;
import com.mymvp.bean.User;
import com.mymvp.common.BaseItemView;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class test extends BaseItemView<User>{

    private TextView name;
    private TextView label;

    @Override
    protected void initView(View view) {
        name = (TextView) view.findViewById(R.id.name);
        label = (TextView) view.findViewById(R.id.label);
    }

    @Override
    protected void setData(User data) {
        name.setText(data.getContact());
        label.setText(data.getPassword());
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.list_item;
    }
}
