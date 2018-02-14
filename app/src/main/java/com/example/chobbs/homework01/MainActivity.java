/*
HomeWork 01
Group 5: Dalton Carter and Christopher Hobbs
  */
package com.example.chobbs.homework01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    public static final int REQ_CODE = 100;
    public static final String CONTACT_KEY = "CONTACT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main");

        //Create a New Contact
        findViewById(R.id.buttonCreateNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateNewContact.class);
                startActivityForResult(intent, REQ_CODE);
                Log.d("demo", "Clicked New Contact Button");
            }
        });
        //Edit a Contact
        findViewById(R.id.buttonEditContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this, ContactList.class);
                startActivity(intentEdit);
                Log.d("demo", "Clicked Edit Contact Button");
            }
        });
        //Display a Contact(s)
        findViewById(R.id.buttonDisplayContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDisplay = new Intent(MainActivity.this, ContactList.class);
                startActivity(intentDisplay);
                Log.d("demo", "Clicked View Contact List Button");
            }
        });
        //Delete a Contact
        findViewById(R.id.buttonDeleteContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDelete = new Intent(MainActivity.this,ContactList.class);
                startActivity(intentDelete);
                Log.d("demo", "Clicked Delete Contact Button");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQ_CODE){
            if(resultCode == RESULT_OK){
                    Contact contact = getIntent().getExtras().getParcelable(CreateNewContact.CONTACT_KEY);
                    Toast.makeText(this, contact.toString(), Toast.LENGTH_SHORT).show();
                    Log.d("demo", "If you see this, then you made it all the way home");
            }else if(resultCode == RESULT_CANCELED){
                Log.d("demo", "value not received");
            }
        }
    }
}
