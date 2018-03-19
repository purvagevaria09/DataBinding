package com.pg.databinding;

import android.databinding.BaseObservable;

/**
 * Created by test on 1/1/18.
 */

public class UserBean extends BaseObservable {
    private String userName, userId, address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public UserBean(String userId, String userName, String address) {
        this.address = address;
        this.userName = userName;
        this.userId = userId;

    }
}
