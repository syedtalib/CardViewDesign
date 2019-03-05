package com.example.customrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView list;
    ArrayList<Contact> contacts;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.contact_list);
        contacts=new ArrayList<>();
        contacts.add(new Contact(R.mipmap.ic_launcher,"Ali","12345",android.R.drawable.ic_menu_call));

        contactAdapter=new ContactAdapter(this,contacts);

        list.setAdapter(contactAdapter);

        LinearLayoutManager  layoutManager=new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);

    }
}
