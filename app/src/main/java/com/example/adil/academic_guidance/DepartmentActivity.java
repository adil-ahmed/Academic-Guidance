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

public class DepartmentActivity extends AppCompatActivity {

    ListView listView;
    /**
     * For access ListView from XML
     */
    ArrayList<String> Departments;
    String name;
    String u;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);


        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        listView = (ListView) findViewById(R.id.listView);
        Departments = new ArrayList<String>();
         /** Declaring Array */


        /** add item on items array */
        Departments.add("CSE");

        Departments.add("EEE");

        Departments.add("BuA");

        Departments.add("CIVIL");

        Departments.add("ARCHITECTURE");

        Departments.add("LLB");

        Departments.add("ENGLISH");

        Departments.add("ISLAMIC STUDIES");


        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        DepartmentAdapter adepter = new DepartmentAdapter(this, Departments); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */

        Bundle b = getIntent().getExtras();
        if(b != null)
        {

            u = b.getString("U");
        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = Departments.get(position);
                if(position==0)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentCSE.class);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentEEE.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentBBA.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentCIVIL.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentARCHITECTURE.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==5)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentLLB.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==6)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentENGLISH.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }
                else if(position==7)
                {
                    Intent i = new Intent(DepartmentActivity.this,DepartmentISLAMIC.class);
                    i.putExtra("TAG",name);
                    i.putExtra("U",u);
                    startActivity(i);
                }





                //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();

            }
        });





    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                //onBackPressed();
                Toast.makeText(getApplicationContext(),"To sign out tap on action bar!",Toast.LENGTH_LONG).show();
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
