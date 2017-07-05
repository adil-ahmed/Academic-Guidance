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

public class Students_35thBatchA extends AppCompatActivity
{

    ListView listView;
    /**
     * For access ListView from XML
     */
    ArrayList<String> StudentName;
    ArrayList<String> ID;
    ArrayList<String> StudentCell;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_35th_batch_a);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar *//** ActionBar This is back button*/



        listView = (ListView) findViewById(R.id.listView);
        StudentName = new ArrayList<String>();
        ID = new ArrayList<String>();
        StudentCell = new ArrayList<String>();/** Declaring Array */


        /** add item on items array */




        StudentName.add("Md. Shahel Kamaly");
        ID.add("1412020001");
        StudentCell.add("01715095852");

        StudentName.add("Afzal Ahmed Chy Tanvir");
        ID.add("1412020002");
        StudentCell.add("01727 625146");

        StudentName.add("Shihanur Rahman Chy");
        ID.add("1412020003");
        StudentCell.add("01719896982");

        StudentName.add("Salman Ahmed");
        ID.add("1412020004");
        StudentCell.add("01715095852");

        StudentName.add("Shipon Chandra Banik");
        ID.add("1412020005");
        StudentCell.add("01765796511");

        StudentName.add("Jannatul Ferdousi Tarin");
        ID.add("1412020006");
        StudentCell.add("01715095852");

        StudentName.add("Suprio Das");
        ID.add("1412020007");
        StudentCell.add("01677710956");

        StudentName.add("Sourav Baishnab");
        ID.add("1412020008");
        StudentCell.add("01758724871");

        StudentName.add("kamrul Islam Shubho");
        ID.add("1412020009");
        StudentCell.add("01715095852");

        StudentName.add("Iqbal Bahar Chowdhury");
        ID.add("1412020010");
        StudentCell.add("01687148484");

        StudentName.add("Md. Monsur Hussain");
        ID.add("1412020011");
        StudentCell.add("01726944457");

        StudentName.add("Oishi das");
        ID.add("1412020012");
        StudentCell.add("01715095852");

        StudentName.add("Washim Haider Chowdhury");
        ID.add("1412020013");
        StudentCell.add("01675402995");

        StudentName.add("Md. Rafsun");
        ID.add("1412020014");
        StudentCell.add("01723327906");

        StudentName.add("Md.AbdulKadir");
        ID.add("1412020015");
        StudentCell.add("01740202032");


        StudentName.add("Selina Akther");
        ID.add("1412020017");
        StudentCell.add("01687022600");


        StudentName.add("Fuyad Ahmed");
        ID.add("1412020021");
        StudentCell.add("01724273929");

        StudentName.add("Tahmina Islam Shammee");
        ID.add("1412020022");
        StudentCell.add("01916029752");

        StudentName.add("Mahmud Hussain Khan");
        ID.add("1412020023");
        StudentCell.add("01687022600");

        StudentName.add("Rahul Debnath");
        ID.add("1412020024");
        StudentCell.add("01676148892");

        StudentName.add("Shofi Ahmed Rocky");
        ID.add("1412020025");
        StudentCell.add("01729560503");

        StudentName.add("Md. Khaled Hussain");
        ID.add("1412020026");
        StudentCell.add("01737411487");

        StudentName.add("Adil Ahmed Chowdhury");
        ID.add("1412020027");
        StudentCell.add("01771852888");

        StudentName.add("Gazi Muhammad Akil");
        ID.add("1412020028");
        StudentCell.add("01942010059");

        StudentName.add("Tohura Tabassum Adiba");
        ID.add("1412020029");
        StudentCell.add("01754663805");

        StudentName.add("Kawsaruzzaman");
        ID.add("1412020030");
        StudentCell.add("01767666403");

        StudentName.add("Mujibur Rahman Rajib");
        ID.add("1412020031");
        StudentCell.add("01684042830");

        StudentName.add("Jannatara Puspo");
        ID.add("1412020032");
        StudentCell.add("01732121982");

        StudentName.add("Adnan Ibna Motin");
        ID.add("1412020033");
        StudentCell.add("01756759540");

        StudentName.add("Sajeda Akther");
        ID.add("1412020034");
        StudentCell.add("01767666403");

        StudentName.add("Md. Shah Nawaz Khan");
        ID.add("1412020035");
        StudentCell.add("01771852213");

        StudentName.add("Zubaer Haque");
        ID.add("1412020036");
        StudentCell.add("01738441211");

        StudentName.add("Susmita Dutta Piya");
        ID.add("1412020037");
        StudentCell.add("01521461503");

        StudentName.add("Md. Shamayun Kobir");
        ID.add("1412020038");
        StudentCell.add(" 01738441211");

        StudentName.add("Abdul Ahad Shanna");
        ID.add("1412020039");
        StudentCell.add("01737769223");

        StudentName.add("Md. Mahfuzur Rahman");
        ID.add("1412020040");
        StudentCell.add("01521461503");

        StudentName.add("Md. Ashiqur Rahman");
        ID.add("1412020041");
        StudentCell.add("01750358866");

        StudentName.add("Nuruzzaman Chowdhury");
        ID.add("1412020042");
        StudentCell.add("01624680304");


        StudentName.add("Md. Abu Tuhel Rana");
        ID.add("1412020043");
        StudentCell.add("01750067573");



        StudentName.add("Md. Abedur Rahman");
        ID.add("1412020045");
        StudentCell.add("01750358866");






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




                AlertDialog.Builder builder = new AlertDialog.Builder(Students_35thBatchA.this);
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
