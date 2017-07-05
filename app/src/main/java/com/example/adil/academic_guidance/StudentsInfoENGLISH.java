package com.example.adil.academic_guidance;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentsInfoENGLISH extends AppCompatActivity {

    ListView listView;
    /**
     * For access ListView from XML
     */
    ArrayList<String> BatchList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_info_english);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        listView = (ListView) findViewById(R.id.listView);
        BatchList = new ArrayList<String>(); /** Declaring Array */


        /** add item on items array */
        BatchList.add("34th");
        BatchList.add("35th");
        BatchList.add("36th");
        BatchList.add("37th");
        BatchList.add("38th");
        BatchList.add("39th");
        BatchList.add("40th");
        BatchList.add("41st");
        BatchList.add("42nd");
        BatchList.add("43rd");
        BatchList.add("44th");
        BatchList.add("45th");

        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        StudentsAdapter adepter = new StudentsAdapter(this,BatchList); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = BatchList.get(position);
                Toast.makeText(getApplicationContext(),"Developed only for CSE 35th Batch",Toast.LENGTH_LONG).show();
                /*Intent i = new Intent();
                i.putExtra("TAG",name);
                finish();*/



                //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                //Toast.makeText(getApplicationContext(),"To sign out tap on action bar!",Toast.LENGTH_LONG).show();
                break;
            case R.id.app:
                Intent p = new Intent(this,AboutApp.class);
                startActivity(p);
                break;
            case R.id.about:
                //Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_LONG).show();
                Intent i = new Intent(this,Dev1.class);
                startActivity(i);
                break;
            case R.id.signOut:
                Intent j = new Intent(this,HomePage.class);
                startActivity(j);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }


}

