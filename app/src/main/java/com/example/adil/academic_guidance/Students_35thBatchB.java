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

public class Students_35thBatchB extends AppCompatActivity {

    ListView listView;
    /**
     * For access ListView from XML
     */
    ArrayList<String> StudentName;
    ArrayList<String> ID;
    ArrayList<String> StudentCell;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_35th_batch_b);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */


        listView = (ListView) findViewById(R.id.listView);
        StudentName = new ArrayList<String>();
        ID = new ArrayList<String>();
        StudentCell = new ArrayList<String>();/** Declaring Array */


        /** add item on items array */


        StudentName.add("Shabnaj Begum Shomi");
        ID.add("1412020046");
        StudentCell.add("01196078632");

        StudentName.add("Abdul Karim");
        ID.add("1412020047");
        StudentCell.add("01796078632");

        StudentName.add("Nishat Kadir Shuvo");
        ID.add("1412020048");
        StudentCell.add("0168178632");

        StudentName.add("M.A.Parvej");
        ID.add("1412020049");
        StudentCell.add("0156078632");

        StudentName.add("Mahfuza Anjum Nishat");
        ID.add("1412020050");
        StudentCell.add("01996078612");

        StudentName.add("Ishfaq Ahmed");
        ID.add("1412020051");
        StudentCell.add("01745904995");

        StudentName.add("Shawon Chowdhury");
        ID.add("1412020052");
        StudentCell.add("01196078632");

        StudentName.add("Jahedur Rahman Jahid");
        ID.add("1412020053");
        StudentCell.add("0156078632");

        StudentName.add("Sinku Deb");
        ID.add("1412020054");
        StudentCell.add("01896078612");

        StudentName.add("Bijoy Debnath");
        ID.add("1412020055");
        StudentCell.add("0178128632");

        StudentName.add("Abdul Karim");
        ID.add("1412020056");
        StudentCell.add("01612078632");

        StudentName.add("Nabil Hassan");
        ID.add("1412020057");
        StudentCell.add("01680002458");

        StudentName.add("Iffat Nowrin");
        ID.add("1412020058");
        StudentCell.add("01736078612");

        StudentName.add("Abdullah-al-azad");
        ID.add("1412020059");
        StudentCell.add("01717491696");

        StudentName.add("Md. Mizanur Rahman Masum");
        ID.add("1412020060");
        StudentCell.add("01719893616");

        StudentName.add("Md. Azadur Rahman Shadin");
        ID.add("1412020061");
        StudentCell.add("01196078632");


        StudentName.add("Kopathi Das");
        ID.add("1412020062");
        StudentCell.add("01716078632");

        StudentName.add("Roksana Akhter Mita");
        ID.add("1412020063");
        StudentCell.add("01881607832");

        StudentName.add("Jahidul Islam Sany");
        ID.add("1412020064");
        StudentCell.add("01785924331");


        StudentName.add("Shah Mijanur Rahman");
        ID.add("1412020065");
        StudentCell.add("01764284501");

        StudentName.add("Bipasha Banik");
        ID.add("1412020066");
        StudentCell.add("017816078632");

        StudentName.add("Najmul Alam");
        ID.add("1412020067");
        StudentCell.add("01717542111");

        StudentName.add("Md. Azharul Islam Tipu");
        ID.add("1412020068");
        StudentCell.add("01746649610");

        StudentName.add("Susmita Chowdhury Shawon");
        ID.add("1412020069");
        StudentCell.add("01796178632");

        StudentName.add("Md. Yasir Arafat Anik");
        ID.add("1412020070");
        StudentCell.add("01196078632");

        StudentName.add("Abdul Karim");
        ID.add("1412020071");
        StudentCell.add("01764284501");

        StudentName.add("Britta Chowdhury");
        ID.add("1412020072");
        StudentCell.add("01726078632");

        StudentName.add("Ananya Nandi Sumi");
        ID.add("1412020073");
        StudentCell.add("01786078632");

        StudentName.add("Tajbeed Chowdhury");
        ID.add("1412020074");
        StudentCell.add("01726147425");

        StudentName.add("Noore Awal Chowdhury");
        ID.add("1412020075");
        StudentCell.add("01771707056");

        StudentName.add("Ahnaf Ar Rafi");
        ID.add("1412020076");
        StudentCell.add("01779875347");

        StudentName.add("Nazmus Sakib");
        ID.add("1412020077");
        StudentCell.add("01751701100");

        StudentName.add("Abdul Halim");
        ID.add("1412020078");
        StudentCell.add("01779907940");

        StudentName.add("Abdul Karim");
        ID.add("1412020079");
        StudentCell.add("01196078632");

        StudentName.add("Enamul Islam Khan");
        ID.add("1412020080");
        StudentCell.add("01721781222");

        StudentName.add("Nairita paul");
        ID.add("1412020081");
        StudentCell.add("01718607832");

        StudentName.add("Md.Abdullah");
        ID.add("1412020082");
        StudentCell.add("01196078632");

        StudentName.add("Abdul Karim");
        ID.add("1412020083");
        StudentCell.add("01561278632");

        StudentName.add("Shadip Banik");
        ID.add("1412020084");
        StudentCell.add("01621299290");

        StudentName.add("Maliha Sabera Jaigidar");
        ID.add("1412020085");
        StudentCell.add("01736478632");

        StudentName.add("Suravi das Riya");
        ID.add("1412020086");
        StudentCell.add("01912078632");

        StudentName.add("Nirmita Biswas Bristy");
        ID.add("1412020087");
        StudentCell.add("01950118632");


        StudentName.add("Mizanur Rahman Khan");
        ID.add("1412020088");
        StudentCell.add("01684989211");

        StudentName.add("Sinthi Ahmed Afrin");
        ID.add("1412020089");
        StudentCell.add("01196078632");


        StudentName.add("Farzan Faruk");
        ID.add("1412020090");
        StudentCell.add("01836098080");

        StudentName.add("Jamil Ahmed");
        ID.add("1412020091");
        StudentCell.add("01759287010");

        StudentName.add("Ahsan Rahman");
        ID.add("1412020092");
        StudentCell.add("01666078632");

        StudentName.add("Abdul Karim");
        ID.add("1412020093");
        StudentCell.add("01867078632");

        StudentName.add("Israth Jahan Chowdhury");
        ID.add("1412020094");
        StudentCell.add("01909078632");

        StudentName.add("Md.Akram Habib Shubon");
        ID.add("1412020095");
        StudentCell.add("01712341120");

        StudentName.add("Md. Bahar Hossain");
        ID.add("1412020096");
        StudentCell.add("01986078236");





        /** You should create New class named CustomListAdaptera amd a Object named Adapter */
        Students_35thBatchAdapter adepter = new Students_35thBatchAdapter(this, StudentName, ID, StudentCell); /** Constructor of this class */
        listView.setAdapter(adepter); /** to set and receive ViewList from CustomListAdapter class */


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = StudentName.get(position);
                final String cell = StudentCell.get(position);


                /*Intent i = new Intent(Students_35thBatchA.this,OneTapCall.class);
                i.putExtra("TAG", name);
                i.putExtra("CELL", cell);

                startActivity(i);
                //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();*/

                /*Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + cell));

                if (ActivityCompat.checkSelfPermission(Students_35thBatchA.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);*/




                AlertDialog.Builder builder = new AlertDialog.Builder(Students_35thBatchB.this);
                builder.setMessage(name);
                builder.setTitle("Call Student");
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
