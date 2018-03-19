package com.pg.databinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PG pm Jan 3 ,2017 (Wednesday)
 */

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    private Context context;

    public AdapterClass(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.list_user, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtUserName.setText("User name : " + position);
        holder.txtUserDesignation.setText("User Designation : " + position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtUserName, txtUserDesignation;

        public MyViewHolder(View view) {
            super(view);
            txtUserName = view.findViewById(R.id.txtUserName);
            txtUserDesignation = view.findViewById(R.id.txtUserDesignation);

        }
    }
}   //end of AdapterClass

