package com.mymvp.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class CommonAdapter extends BaseAdapter{

    private List data;
    private Context context;
    private BaseItemView itemView;

    public CommonAdapter(Context context, BaseItemView itemView) {
        this.context = context;
        this.itemView = itemView;
        data = new ArrayList<>();
    }

    public void refresh(List data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = itemView.getItemView(parent,context);
        }
        itemView.setData(data.get(position));
        return convertView;
    }
}
