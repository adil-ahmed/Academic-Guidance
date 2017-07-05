package com.example.adil.academic_guidance;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RoutineA extends AppCompatActivity {

    Button cr;
    Button er;
    String u;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_a);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        cr = (Button) findViewById(R.id.cr);
        er = (Button) findViewById(R.id.er);
        /*StudentsInformation = (Button) findViewById(R.id.StudentsInfo);
        Notices = (Button) findViewById(R.id.notices);*/
        Bundle b = getIntent().getExtras();
        if(b != null)
        {

            u = b.getString("U");
        }




        cr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               /* Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();*/
                Intent TeachersInfoIntent = new Intent(getApplicationContext(), CRoutineA.class);
                startActivity(TeachersInfoIntent);
            }
        });
        er.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                Intent b = new Intent(getApplicationContext(), ExamRoutine.class);
                b.putExtra("U",u);
                startActivity(b);
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



