package com.admiralfivetigers.fiveghost.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;

/**
 * Created by Administrator on 2018/1/11.
 */

public class HomeAdapter extends BaseAdapter {
    Context context;

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
//        holder.mEnglishOrder
//            holder.mLeft_Image
//        holder.mOrder
//        holder.mRight_Image
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView mLeft_Image;
        public TextView mOrder;
        public TextView mEnglishOrder;
        public ImageView mRight_Image;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.mLeft_Image = (ImageView) rootView.findViewById(R.id.mLeft_Image);
            this.mOrder = (TextView) rootView.findViewById(R.id.mOrder);
            this.mEnglishOrder = (TextView) rootView.findViewById(R.id.mEnglishOrder);
            this.mRight_Image = (ImageView) rootView.findViewById(R.id.mRight_Image);
        }

    }
}
