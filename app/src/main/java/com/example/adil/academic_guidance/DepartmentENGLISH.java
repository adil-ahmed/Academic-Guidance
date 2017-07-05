package com.example.adil.academic_guidance;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DepartmentENGLISH extends AppCompatActivity {

    Button TeachersInformation;
    Button Batch;
    String idd;
    /*Button StudentsInformation;
    Button Notices;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_english);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        TeachersInformation = (Button) findViewById(R.id.TeachersInfoeng);
        Batch = (Button) findViewById(R.id.Batcheng);
        /*StudentsInformation = (Button) findViewById(R.id.StudentsInfo);
        Notices = (Button) findViewById(R.id.notices);*/
        Bundle b = getIntent().getExtras();
        if(b != null)
        {

            idd = b.getString("U");
        }




        TeachersInformation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                Intent TeachersInfoIntent = new Intent(getApplicationContext(), TeachersInfoENGLISH.class);
                startActivity(TeachersInfoIntent);
            }
        });
        Batch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(idd.equals("091101") || idd.equals("091102") || idd.equals("091103") || idd.equals("091104") || idd.equals("091105") ||
                        idd.equals("091106") || idd.equals("091107") || idd.equals("091108") || idd.equals("091115") || idd.equals("091109") || idd.equals("091113") || idd.equals("091110") || idd.equals("091114") ||
                        idd.equals("091005") || idd.equals("091006") || idd.equals("091007") || idd.equals("091008") || idd.equals("091009") ||
                        idd.equals("091010") || idd.equals("091011") || idd.equals("091012") || idd.equals("091013") || idd.equals("091014") ||
                        idd.equals("091015") || idd.equals("091016") || idd.equals("091017") || idd.equals("090901") || idd.equals("090902") || idd.equals("090903") || idd.equals("090904") || idd.equals("090905") ||
                        idd.equals("090906") || idd.equals("090907") || idd.equals("090908") || idd.equals("090909") || idd.equals("090910") ||
                        idd.equals("090911") || idd.equals("090912") || idd.equals("090913") || idd.equals("090914") || idd.equals("090915"))
                {
                    Intent b = new Intent(getApplicationContext(), StudentsInfoENGLISH.class);
                    startActivity(b);
                }

                else
                {


                    Toast.makeText(getApplicationContext(), "You are not part of English Department.", Toast.LENGTH_LONG).show();
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



