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

public class DepartmentCSE extends AppCompatActivity {

    Button TeachersInformation;
    Button Batch;
    String idd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        TeachersInformation = (Button) findViewById(R.id.TeachersInfo);
        Batch = (Button) findViewById(R.id.Batch);
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
               /* Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();*/
                Intent TeachersInfoIntent = new Intent(getApplicationContext(), TeachersInfo.class);
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
                        idd.equals("090911") || idd.equals("090912") || idd.equals("090913") || idd.equals("090914") || idd.equals("090915") || idd.equals("1412020001") || idd.equals("1412020002") || idd.equals("1412020003") ||idd.equals("1412020004") ||
                        idd.equals("1412020005") || idd.equals("1412020006") || idd.equals("1412020007") || idd.equals("1412020008") ||
                        idd.equals("1412020009") || idd.equals("1412020010") || idd.equals("1412020011") || idd.equals("1412020012") ||
                        idd.equals("1412020013") || idd.equals("1412020014") || idd.equals("1412020015") || idd.equals("1412020016") ||
                        idd.equals("1412020017") || idd.equals("1412020018") || idd.equals("1412020019") || idd.equals("1412020020") ||
                        idd.equals("1412020021") || idd.equals("1412020022") || idd.equals("1412020023") || idd.equals("1412020024") ||
                        idd.equals("1412020025") || idd.equals("1412020026") || idd.equals("1412020027") || idd.equals("1412020028") ||
                        idd.equals("1412020029") || idd.equals("1412020030") || idd.equals("1412020031") || idd.equals("1412020032") ||
                        idd.equals("1412020033") || idd.equals("1412020034") || idd.equals("1412020035") || idd.equals("1412020036") ||
                        idd.equals("1412020037") || idd.equals("1412020038") || idd.equals("1412020039") || idd.equals("1412020040") ||
                        idd.equals("1412020041") || idd.equals("1412020042") || idd.equals("1412020043") || idd.equals("1412020044") ||
                        idd.equals("1412020045") || idd.equals("1412020046") || idd.equals("1412020047") || idd.equals("1412020048") ||idd.equals("1412020049") ||
                        idd.equals("1412020050") || idd.equals("1412020051") || idd.equals("1412020052") || idd.equals("1412020053") ||
                        idd.equals("1412020054") || idd.equals("1412020055") || idd.equals("1412020056") || idd.equals("1412020057") ||
                        idd.equals("1412020058") || idd.equals("1412020059") || idd.equals("1412020060") || idd.equals("1412020061") ||
                        idd.equals("1412020062") || idd.equals("1412020063") || idd.equals("1412020064") || idd.equals("1412020065") ||
                        idd.equals("1412020066") || idd.equals("1412020067") || idd.equals("1412020068") || idd.equals("1412020069") ||
                        idd.equals("1412020070") || idd.equals("1412020071") || idd.equals("1412020072") || idd.equals("1412020073") ||
                        idd.equals("1412020074") || idd.equals("1412020075") || idd.equals("1412020076") || idd.equals("1412020077") ||
                        idd.equals("1412020078") || idd.equals("1412020079") || idd.equals("1412020080") || idd.equals("1412020081") ||
                        idd.equals("1412020082") || idd.equals("1412020083") || idd.equals("1412020084") || idd.equals("1412020085") ||
                        idd.equals("1412020086") || idd.equals("1412020087") || idd.equals("1412020088") || idd.equals("1412020089") ||
                        idd.equals("1412020090") || idd.equals("1412020091") || idd.equals("1412020092") || idd.equals("1412020093") ||
                        idd.equals("1412020094") || idd.equals("1412020095") || idd.equals("1412020096"))

                {


                    Intent b = new Intent(getApplicationContext(), StudentsInfo.class);
                    b.putExtra("U", idd);
                    startActivity(b);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "You are not part of CSE department", Toast.LENGTH_LONG).show();
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



