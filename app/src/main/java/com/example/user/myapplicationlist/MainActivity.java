package com.example.user.myapplicationlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView l;
    String[] days={"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp = (TextView) view;
        Toast.makeText(this, temp.getText() + "" + position, Toast.LENGTH_SHORT).show();
        if (position == 0) {
            Intent myintent = new Intent(view.getContext(), Sun.class);
            startActivityForResult(myintent, 0);
        }
        if (position == 1) {
            Intent myintent = new Intent(view.getContext(), Mon.class);
            startActivityForResult(myintent, 1);
        }
        if (position == 2) {
            Intent myintent = new Intent(view.getContext(), Tue.class);
            startActivityForResult(myintent, 2);
        }
        if (position == 3) {
            Intent myintent = new Intent(view.getContext(), Wed.class);
            startActivityForResult(myintent, 3);
        }
        if (position == 4) {
            Intent myintent = new Intent(view.getContext(), Thur.class);
            startActivityForResult(myintent, 4);
        }
        if (position == 5) {
            Intent myintent = new Intent(view.getContext(), Fri.class);
            startActivityForResult(myintent, 5);
        }
        if (position == 6) {
            Intent myintent = new Intent(view.getContext(), Sat.class);
            startActivityForResult(myintent, 6);
        }

    }
}
