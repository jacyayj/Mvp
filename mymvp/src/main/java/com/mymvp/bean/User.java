package com.mymvp.bean;

import com.mymvp.common.BaseBean;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class User extends BaseBean {

    private String contact;
    private String password;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
