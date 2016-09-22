package com.example.tylereustis.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailedView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        TextView name = (TextView) findViewById(R.id.name);
        TextView age = (TextView) findViewById(R.id.age);
        TextView secret = (TextView) findViewById(R.id.secret);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        age.setText(intent.getIntExtra("age", 0));
        secret.setText(intent.getStringExtra("secret"));

    }
}
