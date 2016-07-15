package com.mymvp.common;

import com.google.gson.Gson;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class BaseBean {
    public String toJson(){
        return new Gson().toJson(this);
    }
}
