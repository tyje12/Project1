package com.example.tylereustis.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        ArrayList <String> records = new ArrayList<String>();
        for(int i=0;i<Data.names.length;i++){
            records.add(Data.names[i] + "," + Data.ages[i] + "," + Data.secrets[i]);
        }

        ItemAdapter adapter = new ItemAdapter(this,records);

        ListView listView2 = (ListView) findViewById(R.id.listview);

        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<> parent, View view, int position, long id){
                //create intent
                Intent intent = new Intent(view.getContext(),DetailedView.class);

                //pack in info
                intent.putExtra("name",Data.names[position]);
                intent.putExtra("age",Data.ages[position]);
                intent.putExtra("secret",Data.secrets[position]);

                //start activity
                startActivity(intent);
            }

        });

    }
}
