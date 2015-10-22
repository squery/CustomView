package com.telephone.squery.customview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.telephone.squery.customview.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ${ZhangYan}[Squery] on 2015/10/22.
 */
public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ArrayList<HashMap<String, Object>>> mList;
    private Context mContext;

    public ListViewAdapter(ArrayList<ArrayList<HashMap<String, Object>>> mList, Context mContext) {
        super();
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (mList == null) {
            ret=0;
        }else {
            ret =mList.size();
        }
        return ret;
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from
                    (this.mContext).inflate(R.layout.listview_item, null, false);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.gridView = (GridView) convertView.findViewById(R.id.listview_item_gridview);
        if (this.mList != null) {
            if (holder.gridView != null) {
                ArrayList<HashMap<String, Object>> arrayListForEveryGridView = this.mList.get(position);
                GridViewAdapter gridViewAdapter=new GridViewAdapter(mContext, arrayListForEveryGridView);
                holder.gridView.setAdapter(gridViewAdapter);
            }

        }
        return convertView;

    }
    private class ViewHolder {
        GridView gridView;
    }

}
