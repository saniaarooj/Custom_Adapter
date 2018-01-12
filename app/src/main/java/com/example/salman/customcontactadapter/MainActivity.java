package com.example.salman.customcontactadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = (ListView) findViewById(R.id.ListView);

        ArrayList<User> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(new User("           Name = " + i, "           Phone = " + i));
        }

        CustomContactAdapter customContactAdapter = new CustomContactAdapter(MainActivity.this, arrayList);
        l.setAdapter(customContactAdapter);


    }


}