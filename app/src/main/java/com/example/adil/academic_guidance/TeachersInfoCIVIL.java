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

public class TeachersInfoCIVIL extends AppCompatActivity
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
        setContentView(R.layout.activity_teachers_info_civil);
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

        TeachersList.add("Abul Abrar Masrur Ahmed (Head)");
        Email.add("E-mail: E-mail: masrur@lus.ac.bd");
        Tcell.add("01912140065");

        TeachersList.add("Md. Mamunur Rashid (Senior Lecturer)");
        Email.add("E-mail: mmrashid_cee@yahoo.com");
        Tcell.add("01552422508");

        TeachersList.add("Md. Abu Zafor (Assistant Professor)");
        Email.add("E-mail: zaforcee@gmail.com");
        Tcell.add("01191083433");

        TeachersList.add("Md. Aminul Haque (Assistant Professor)");
        Email.add("E-mail: eman.cee2008@gmail.com");
        Tcell.add("01672005555");

        TeachersList.add("Syeda Zehan Farzana (Senior Lecturer)");
        Email.add("E-mail: zehan_farzana@yahoo.com");
        Tcell.add("01911017626");

        TeachersList.add("Md. Yeasin Ahmed (Lecturer)");
        Email.add("E-mail: yeasinopu.sust@gmail.com");
        Tcell.add("01911379811");

        TeachersList.add("Shahjalal Selim (Senior Lecturer)");
        Email.add("E-mail: shahjalal.Selim@gmail.com");
        Tcell.add("01717534048");

        TeachersList.add("Syed Mustakim Ali Shah (Senior Lecturer)");
        Email.add("E-mail: mustakim.bd@gmail.com");
        Tcell.add("01717679169");

        TeachersList.add("Sheikh Hefzul Bari (Faculty)");
        Email.add("E-mail: bari_cee1989@yahoo.com");
        Tcell.add("01711188073");

        TeachersList.add("Amit Chakraborty (Lecturer)");
        Email.add("E-mail: amitjoy.ce12@gmail.com");
        Tcell.add("01719232497");


        TeachersList.add("Shabbir Ahmed Osmani (Senior Lecturer)");
        Email.add("E-mail: osmani2000@gmail.com");
        Tcell.add("01751232163");


        TeachersList.add("Md. Faruak Ahmad (Senior Lecturer)");
        Email.add("E-mail: farukahmedche@yahoo.com");
        Tcell.add("01719478023");


        TeachersList.add("Jafor Ahmed Limon (Lecturer)");
        Email.add("E-mail: jaforlimon@gmail.com");
        Tcell.add("01737401051");


        TeachersList.add("Kazi Md. Jahid Hasan (Lecturer)");
        Email.add("E-mail: kjahid.sust@gmail.com");
        Tcell.add("01676480060");


        TeachersList.add("Nazmun Nahar Papri (Lecturer)");
        Email.add("E-mail: npapri21@gmail.com");
        Tcell.add("01762912958");








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
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfoCIVIL.this);
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

