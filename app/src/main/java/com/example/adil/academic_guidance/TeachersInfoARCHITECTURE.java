package com.example.adil.academic_guidance;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TeachersInfoARCHITECTURE extends AppCompatActivity
{
    ListView listView;
    String name;
    /**
     * For access ListView from XML
     */
    ArrayList<String> TeachersList;
    ArrayList<String> Email;
    ArrayList<String> Tcell;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_info_architecture);
        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        listView = (ListView) findViewById(R.id.listView);
        TeachersList = new ArrayList<String>();
        Email = new ArrayList<String>();
        Tcell = new ArrayList<String>();/** Declaring Array */

        TeachersList.add("Prof. Chowdhury Mushtaq Ahmed (Advisor )");
        Email.add("E-mail: arcmushtaq@gmail.com");
        Tcell.add("01711800326");

        TeachersList.add("Ar. Rajon Das (Assistant Professor)");
        Email.add("E-mail: sreerajon@gmail.com");
        Tcell.add("01717794232");


        TeachersList.add("Ar. Md. Shawkat Jahan Chowdhury (Head)");
        Email.add("E-mail: shawkat_cb@yahoo.com");
        Tcell.add("01712204903");


        TeachersList.add("Ar. Md. Tanwer Burhan (Senior Lecturer)");
        Email.add("E-mail: btanwer@ymail.com");
        Tcell.add(" 01917189340");


        TeachersList.add("Tanjima Siddika Chandni (Senior Lecturer)");
        Email.add("E-mail: tanjima.arch15@gmail.com");
        Tcell.add("01912581499");


        TeachersList.add("Khondaker Ahsan Habib (Senior Lecturer)");
        Email.add("E-mail: ar.ahsanhabib@gmail.com");
        Tcell.add("01196078632");


        TeachersList.add("Noorjahan Begum (Lecturer)");
        Email.add("E-mail: mukta_arch@yahoo.com");
        Tcell.add("01913524380");


        TeachersList.add("Syed Mohsin Ali (Lecturer)");
        Email.add("E-mail: srvnishow@gmail.com");
        Tcell.add("01742824848");


        TeachersList.add("Salina Akther (Lecturer)");
        Email.add("E-mail: sumi-arcbk@yahoo.com");
        Tcell.add("01918774428");


        TeachersList.add("Ms. Shadgeya Athrin (Lecturer)");
        Email.add("E-mail: shadgeyaafrin@yahoo.com");
        Tcell.add("01937831485");





        TeachersAdapter adepter = new TeachersAdapter(this,TeachersList,Email,Tcell); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = TeachersList.get(position);
                final String cell = Tcell.get(position);


                /*Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + cell));

                if (ActivityCompat.checkSelfPermission(TeachersInfoARCHITECTURE.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);*/
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfoARCHITECTURE.this);
                builder.setMessage(name);
                builder.setTitle("Call Teacher");
                builder.setPositiveButton("Call", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                        Intent call = new Intent(Intent.ACTION_DIAL);
                        call.setData(Uri.parse("tel: " + cell));
                        startActivity(call);

                    }
                });
                builder.show();






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

