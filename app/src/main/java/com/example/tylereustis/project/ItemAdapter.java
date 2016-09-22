package com.example.tylereustis.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tyler.eustis on 9/22/2016.
 */
public class ItemAdapter extends ArrayAdapter<String> {
    public ItemAdapter(Context context, ArrayList<String> names){
        super(context,0,records);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String s = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView age = (TextView) convertView.findViewById(R.id.age);

        String [] record = s.split(",");
        name.setText(record[0]);
        age.setText(record[1]);

        return convertView;
    }

}
