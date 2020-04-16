package com.example.finalproject1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SchoolAdapter extends BaseAdapter {

    ArrayList<Schools> list;
    Context context;

    public SchoolAdapter(ArrayList<Schools> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.school_list_item,parent,false);

        TextView name = rowView.findViewById(R.id.textView2);
        TextView info = rowView.findViewById(R.id.textView4);
        ImageView img = rowView.findViewById(R.id.imageView);

        name.setText(list.get(position).getName());
        info.setText(list.get(position).getInfo());
        img.setImageResource(list.get(position).getImageReference());




        return rowView;
    }
}
