package com.example.adil.academic_guidance;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
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

public class Book extends AppCompatActivity
{

    ListView listView;
    String name;
    /**
     * For access ListView from XML
     */
    ArrayList<String> v;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        listView = (ListView) findViewById(R.id.listView);
        v= new ArrayList<String>();
        /** Declaring Array */
        /** Declaring Array */


        /** add item on items array */
        v.add("Artificial Intelligence");
        v.add("Management Information System");
        v.add("Computer Graphics");
        v.add("Web Technology");







        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        BStyle adepter = new BStyle(this,v); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = v.get(position);
                if(position == 0)
                {
                    Toast.makeText(getApplicationContext(),"Download from drive.",Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse("https://drive.google.com/file/d/0B-SCukri_RwFQ3o0bWV5NEtYQTQ/view");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position == 1)
                {
                    Toast.makeText(getApplicationContext(),"Download from drive.",Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse("https://drive.google.com/file/d/0B-SCukri_RwFTFhndWVBUGQtNEE/view");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position == 2)
                {
                    Toast.makeText(getApplicationContext(),"Download from drive.",Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse("https://drive.google.com/file/d/0B-SCukri_RwFYmF1ZTd5ajdHNEU/view");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position == 3)
                {
                    Toast.makeText(getApplicationContext(),"Download from drive.",Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse("https://drive.google.com/file/d/0B-SCukri_RwFamZFaHpQUkVmak0/view");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }



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

