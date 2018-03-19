package com.pg.databinding;

import android.databinding.DataBindingUtil;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

import com.pg.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends ParentActivity {
    private String TAG = "MainActivity";
    private ArrayList<UserBean> userArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        for (int i = 0; i < 5; i++) {
            UserBean userBean = new UserBean(i + "", i + " address ", i + " username");
            bindings.setUser(userBean);
            userBean.setUserId(i + "");
            userBean.setUserName(i + " UserName");
            userBean.setAddress(i + " Address");
            userArrayList.add(userBean);
        }
        getData();
    }


    @Override
    protected void getData() {
        super.getData();
        Log.d(TAG, "Do something method called");
    }
}
