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

import java.util.ArrayList;

public class B35 extends AppCompatActivity
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
        setContentView(R.layout.activity_b35);

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
        v.add("Post Notice");
        v.add("View Notice");
        v.add("Routine");
        v.add("Course List");
        v.add("Books");
        v.add("Students Information");






        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        BStyle adepter = new BStyle(this,v); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = v.get(position);
                if(position == 2)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                    Intent i = new Intent(B35.this,RoutineB.class);
                    i.putExtra("TAG",name);
                    startActivity(i);
                }
                else if(position == 0)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                    Intent i = new Intent(B35.this,Notices.class);
                    i.putExtra("TAG",name);
                    startActivity(i);
                }
                else if(position == 1)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                    Intent i = new Intent(B35.this,ViewNotice.class);
                    i.putExtra("TAG",name);
                    startActivity(i);
                }
                else if(position == 3)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                    Intent i = new Intent(B35.this,CourseList.class);
                    i.putExtra("TAG",name);
                    startActivity(i);
                }
                else if(position == 4)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);

                    Intent i = new Intent(B35.this,Book.class);
                    i.putExtra("TAG",name);
                    startActivity(i);

                }
                else if(position == 5)
                {
//                    Intent i = new Intent(StudentsInfo.this,Students_35thBatchA.class);
                    Intent i = new Intent(B35.this,Students_35thBatchB.class);
                    i.putExtra("TAG",name);
                    startActivity(i);
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

