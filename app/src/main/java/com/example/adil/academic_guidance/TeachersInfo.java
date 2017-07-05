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

public class TeachersInfo extends AppCompatActivity
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
        setContentView(R.layout.activity_teachers_info);

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
        /** Declaring Array */


        /** add item on items array */
        TeachersList.add("Prof Dr. Khandoker Mohammad Mominul Haque (Dean)");
        Email.add("E-mail: momin66@gmail.com");
        Tcell.add("0192369195"); // Dean


        TeachersList.add("Md. Asaduzzaman Khan (Acting Head)");
        Email.add("E-mail: head_cse@lus.ac.bd");
        Tcell.add("01711003233"); // Head

        TeachersList.add("Dr. Refat Kibria (Associate Professor)");
        Email.add("E-mail: co-ordinator_cse@lus.ac.bd");
        Tcell.add("01847174571"); // Coordinator

        TeachersList.add("Rumel M. S. Rahman Pir (Assistant Professor)");
        Email.add("E-mail: rumelpir@gmail.com");
        Tcell.add("01678124356"); // rumelsir

        TeachersList.add("Arif Ahmad (Assistant Professor)");
        Email.add("E-mail: arif@lus.ac.bd");
        Tcell.add("01715274319"); // Arifsir

        TeachersList.add("Minhazul Haque Bhuiyan (Senior Lecturer,Convener, Project/Thesis Committee)");
        Email.add("E-mail: minhazulriad@yahoo.com");
        Tcell.add("01678174660"); // Riad sir

        TeachersList.add("Selina Sharmin (Senior Lecturer)");
        Email.add("E-mail: selinasharmin_bd@yahoo.com");
        Tcell.add("01719191660"); // Moni maam

        TeachersList.add("Alak Kanti Sarma (Senior Lecturer,Member Of Routine Committee)");
        Email.add("E-mail: sarma.cse47@gmail.com");
        Tcell.add("01713806862"); // Alak sir


        TeachersList.add("Arafat Habib Quraishi (Lecturer)");
        Email.add("E-mail: ahq.cse@gmail.com");
        Tcell.add("01914487146"); // Arafat sir

        TeachersList.add("Md. Ebrahim Hossain (Lecturer)");
        Email.add("E-mail: sajib.it1412@gmail.com");
        Tcell.add("01916497701"); // Ebrahim Sir

        TeachersList.add("Md. Saiful Ambia Chowdhury (Lecturer,Coach Of Programming Contest Teams )");
        Email.add("E-mail: sas2505@lus.ac.bd");
        Tcell.add("01718377269"); // Ambia Sir

        TeachersList.add("Iffat Jahan Choudhury (Lecturer)");
        Email.add("E-mail: iffat.lu@gmail.com");
        Tcell.add("01723344455");



        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        TeachersAdapter adepter = new TeachersAdapter(this,TeachersList,Email,Tcell); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String name = TeachersList.get(position);
                final String cell = Tcell.get(position);


               /* Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + cell));

                if (ActivityCompat.checkSelfPermission(TeachersInfo.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);*/
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfo.this);
                builder.setMessage(name);
                builder.setTitle("Call Teacher");
                builder.setPositiveButton("Call", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

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

