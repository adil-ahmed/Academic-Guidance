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

public class TeachersInfoENGLISH extends AppCompatActivity
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
        setContentView(R.layout.activity_teachers_info_english);
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

        TeachersList.add("Md. Rezaul Karim (Assistant Professor ( Former Head and Proctor))");
        Email.add("E-mail: tahrez2005@yahoo.com");
        Tcell.add("01711467396");

        TeachersList.add("Muhammad Nazrul Islam(Assistant Professor Head (Acting) )");
        Email.add("E-mail: nazrul@lus.ac.bd");
        Tcell.add("01717326505");

        TeachersList.add("Mrs. Rumpa Sharmin (Associate Professor)");
        Email.add("E-mail: rushmin.bd@gmail.com");
        Tcell.add("01711147833");

        TeachersList.add("Mrs. Manfath Jabin Haque(Senior Lecturer)");
        Email.add("E-mail: manfath@gmail.com");
        Tcell.add("01916100250");

        TeachersList.add("Mahbub Alam(Senior Lecturer)");
        Email.add("E-mail: mahbubalam518@yahoo.com");
        Tcell.add("01717235903");

        TeachersList.add("Abu Saeed Md. Naheed (Lecturer)");
        Email.add("E-mail: naahid.asm@gmail.com");
        Tcell.add("01913607825");

        TeachersList.add("Sheikh Md. Muniruzzaman ( Lecturer)");
        Email.add("E-mail: sm_mzaman@yahoo.com");
        Tcell.add("01913607825");

        TeachersList.add("Ms. Shammi Akter (Senior Lecturer)");
        Email.add("E-mail: aktershammi26@gmail.com");
        Tcell.add("01674764323");


        TeachersList.add("Ahsan Uddin Tohel(Senior Lecturer)");
        Email.add("E-mail: tohel32@gmail.com");
        Tcell.add("01710716940");

        TeachersList.add("Ms. Touhida Sultana(Lecturer)");
        Email.add("E-mail: touhida@lus.ac.bd");
        Tcell.add("01911243565");

        TeachersList.add("Ashfaque Ahmad Shovon (Lecturer)");
        Email.add("E-mail: ashfaque_shovon@hotmail.com");
        Tcell.add("01674676796");


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
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfoENGLISH.this);
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

