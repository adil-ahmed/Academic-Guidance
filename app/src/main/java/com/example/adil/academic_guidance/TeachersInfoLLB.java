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

public class TeachersInfoLLB extends AppCompatActivity
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
        setContentView(R.layout.activity_teachers_info_llb);
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

        TeachersList.add("Prof. Dr. Noor Mohammad (Professor & Head)");
        Email.add("E-mail: noormmu2011@gmail.com");
        Tcell.add("01921376706");

        TeachersList.add("Md. Rashedul Islam(Assistant Professor )");
        Email.add("E-mail: rashed_lu@yahoo.com");
        Tcell.add("01911612529");

        TeachersList.add("Md. Abdul Musabbir Chowdhury (Associate Professor)");
        Email.add("E-mail: sabbir2008@gmail.com");
        Tcell.add("01717568792");

        TeachersList.add("Abdullah Al Mamun(Assistant Professor)");
        Email.add("E-mail: mamundu201@gmail.com");
        Tcell.add("01716604241");

        TeachersList.add("Ms. Soabarin Siddiqua(Assistant Professor)");
        Email.add("E-mail: nishicu@yahoo.com");
        Tcell.add("01552702180");

        TeachersList.add("Barrister Arif Anwar (Assistant Professor)");
        Email.add("E-mail: arif.anwar633@gmail.com");
        Tcell.add("01717365794");

        TeachersList.add("Shah Md. Omer Faruqe Jubaer (Senior Lecturer)");
        Email.add("E-mail: shahjubaer@yahoo.com.uk");
        Tcell.add("01682822534");

        TeachersList.add("Ms. Nusrat Hasina (Senior Lecturer)");
        Email.add("E-mail: shampanusrat@yahoo.com");
        Tcell.add("01717134093");


        TeachersList.add("Md. Shaidul Islam(Senior Lecturer)");
        Email.add("E-mail: sayed.du@rocketmail.com");
        Tcell.add("01718773500");

        TeachersList.add("Md. Nurujjaman Mia(Lecturer)");
        Email.add("E-mail: mdnurujjamanmiah@yahoo.com");
        Tcell.add("01756292835");




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
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfoLLB.this);
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

