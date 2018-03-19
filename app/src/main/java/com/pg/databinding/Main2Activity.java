package com.pg.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/****
 * Created by PG on Jan 3 ,2017 (Wednesday)
 * Functionality : Recylerview demo
 */
public class Main2Activity extends AppCompatActivity {

    private String TAG = "Main2Activity";
    private RecyclerView listUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listUser = findViewById(R.id.listUser);
        listUser.setAdapter(new AdapterClass(this));
    }
}   //end of class Main2Activity
