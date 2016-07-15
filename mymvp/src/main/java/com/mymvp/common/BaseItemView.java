package com.mymvp.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jacyayj on 2016/7/14.
 */
public abstract class BaseItemView<T>{

    private View itemView;

    public View getItemView(ViewGroup parent, Context context){
        itemView = LayoutInflater.from(context).inflate(getItemLayoutId(),parent,false);
        initView(itemView);
        return itemView;
    }

    protected abstract void initView(View view);
    protected abstract void setData(T data);
    protected abstract int getItemLayoutId();
}
