package com.example.andrew.rss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] descriptions;


public ItemAdapter(Context c, String[] i,String[] d) {

        items = i;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


}
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail,null);
        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = v.findViewById(R.id.descriptionTextView);

        String name = items[i];
        String desc = items[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);



        return v;
    }
}
