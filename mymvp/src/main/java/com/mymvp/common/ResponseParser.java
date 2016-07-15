package com.mymvp.common;

import com.google.gson.Gson;

import org.xutils.http.request.UriRequest;

import java.lang.reflect.Type;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class ResponseParser implements org.xutils.http.app.ResponseParser{
    @Override
    public void checkResponse(UriRequest request) throws Throwable {

    }

    @Override
    public Object parse(Type resultType, Class<?> resultClass, String result) throws Throwable {
        return new Gson().fromJson(result,resultType);
    }
}
