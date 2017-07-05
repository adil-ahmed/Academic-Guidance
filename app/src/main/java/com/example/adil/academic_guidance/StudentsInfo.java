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

import java.security.PublicKey;
import java.util.ArrayList;

public class StudentsInfo extends AppCompatActivity
{

    ListView listView;
    String idd;

    /*int mm=Integer.parseInt(iddd.getTag().toString());
    quantity.setTag(mcustomers_basket_id);*/




    /**
     * For access ListView from XML
     */
    ArrayList<String> BatchList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_info);
        Bundle b = getIntent().getExtras();
        if(b != null)
        {

            idd = b.getString("U");
        }

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
        BatchList.add("33rd");
        BatchList.add("34th");
        BatchList.add("35th(A)");
        BatchList.add("35th(B)");
        BatchList.add("36th");
        BatchList.add("37th");
        BatchList.add("38th(A)");
        BatchList.add("38th(B)");
        BatchList.add("38th(C)");
        BatchList.add("38th(D)");
        BatchList.add("38th(E)");
        BatchList.add("38th(F)");
        BatchList.add("39th");
        BatchList.add("40th");
        BatchList.add("41st(A)");
        BatchList.add("41st(B)");
        BatchList.add("41st(C)");
        BatchList.add("41st(D)");
        BatchList.add("41st(E)");
        BatchList.add("42nd");
        BatchList.add("43rd");
        BatchList.add("44th(A)");
        BatchList.add("44th(B)");
        BatchList.add("44th(C)");
        BatchList.add("44th(D)");
        BatchList.add("44th(E)");

        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        StudentsAdapter adepter = new StudentsAdapter(this,BatchList); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String name = BatchList.get(position);

                /*String idd;*/

                    if (position == 2)
                    {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                        Intent i = new Intent(StudentsInfo.this, A35.class);
                        i.putExtra("TAG", name);
                        startActivity(i);
                    }
                    else if (position == 3)
                    {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchB.class);
                        Intent i = new Intent(StudentsInfo.this, B35.class);
                        i.putExtra("TAG", name);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Developed only for CSE 35th Batch", Toast.LENGTH_LONG).show();
                       /* Intent i = new Intent();
                        i.putExtra("TAG", name);
                        finish();*/
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

