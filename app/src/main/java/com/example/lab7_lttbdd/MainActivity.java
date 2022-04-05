package com.example.lab7_lttbdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataUser dataUser=new DataUser(this,"userdb.sqlite",null,1);
        dataUser.addUser(new User("Bac"));
        dataUser.addUser(new User("Long"));
        dataUser.addUser(new User("Dat"));
        dataUser.addUser(new User("Nam"));
    }
}