package com.mymvp.bean;

import com.mymvp.common.ResponseParser;

import org.xutils.http.annotation.HttpResponse;

/**
 * Created by jacyayj on 2016/7/14.
 */
@HttpResponse(parser = ResponseParser.class)
public class Response<T> {

    String message;
    int code;
    T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
