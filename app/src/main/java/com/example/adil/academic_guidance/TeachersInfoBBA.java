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

public class TeachersInfoBBA extends AppCompatActivity
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
        setContentView(R.layout.activity_teachers_info_bb);
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

        TeachersList.add("Prof. Md. Nazrul Islam");
        Email.add("E-mail: head_bua@lus.ac.bd");
        Tcell.add("01718824376");

        TeachersList.add("Prof. Md. Abul Kalam Chowdhury(Professor )");
        Email.add("E-mail: a.k.chowdhury111@gmail.com");
        Tcell.add("01715615800");

        TeachersList.add("Prof. Dr. Md. Azizul Baten");
        Email.add("E-mail: baten_math@yahoo.com");
        Tcell.add("01716262947");

        TeachersList.add("Prof. Dr. Md. Zahurul Alam(Advisor)");
        Email.add("E-mail: zahurulcu@gmail.com");
        Tcell.add("01819848547");

        TeachersList.add("Prof. Dr. S. M. Ali Akkas(Professor)");
        Email.add("E-mail:  abuafra1954@gmail.com");
        Tcell.add("01755582280");

        TeachersList.add("Mohammad Shahansha Molla(Assistant Professor)");
        Email.add("E-mail: shahansha06@yahoo.com");
        Tcell.add("01196078632");

        TeachersList.add("Atikur Rahman Baizid(Assistant Professor)");
        Email.add("E-mail: sustatik2@gmail.com");
        Tcell.add("01913099227");

        TeachersList.add("Md. Jahangir Alam(Assistant Professor(Marketing) )");
        Email.add("E-mail:  jalam160@yahoo.com");
        Tcell.add("01711009899");


        TeachersList.add("Md. Mahbubur Rahaman (Assistant Professor(MIS) )");
        Email.add("E-mail: mahbub_200610@yahoo.com");
        Tcell.add("01717019305");

        TeachersList.add("Shamsu Uddin (Assistant Professor(Marketing) )");
        Email.add("E-mail: sushakib@yahoo.com");
        Tcell.add("01195399384");

        TeachersList.add("Musa. Halima Begum (Assistant Professor(Sociology))");
        Email.add("E-mail: musa.halimabegum@yahoo.com");
        Tcell.add("01913946475");

        TeachersList.add("Dr. Md. Rashedul Azim ACS (Assistant Professor)");
        Email.add("E-mail: rashedulazim9@gmail.com");
        Tcell.add("01716599135");

        TeachersList.add("Anwar Ahmad Arif (Senior Lecturer)");
        Email.add("E-mail: aaarif@lus.ac.bd");
        Tcell.add("01712661446");

        TeachersList.add("Wahida Akther (Senior Lecturer(AIS) )");
        Email.add("E-mail: wahidaala@gmail.com");
        Tcell.add("01819538975");

        TeachersList.add("Md. Shamimul Islam(Senior Lecturer(HRM))");
        Email.add("E-mail: mshamim09@gmail.com");
        Tcell.add("01918942572");

        TeachersList.add("Mohammed Zahed Hossain (Senior Lecturer(Finance & Banking) )");
        Email.add("E-mail: zahedbtc@gmail.com");
        Tcell.add("01196076832");

        TeachersList.add("Iehit Sharma(Senior Lecturer Accounting )");
        Email.add("E-mail: iehitnipu09@gmail.com");
        Tcell.add("01819848464");

        TeachersList.add("Tahmina Khanom(Senior Lecturer(Finance & Accounting) )");
        Email.add("E-mail: tmm87@gmail.com");
        Tcell.add("01715610930");

        TeachersList.add("Sabia Akter Bhuiyan (Senior Lecturer(Mathematics) )");
        Email.add("E-mail: aktersabia@yahoo.com");
        Tcell.add("01714506159");

        TeachersList.add("Md.Hafizur Rahman Khan (Senior Lecturer )");
        Email.add("E-mail: hrk128@gmail.com");
        Tcell.add("01196078632");

        TeachersList.add("Md. Abdul Muhith Chowdhury(Senior Lecturer(HRM) )");
        Email.add("E-mail: nasim_17@yahoo.com");
        Tcell.add("01911528681");

        TeachersList.add("Farhad Hossain (Senior Lecturer)");
        Email.add("E-mail: farhad@lus.ac.bd");
        Tcell.add("01611504166");

        TeachersList.add("S.M. Atiqur Rahman (Senior Lecturer)");
        Email.add("E-mail: athiq_wesl@yahoo.com");
        Tcell.add("01711484771");

        TeachersList.add("Md. Asraful Islam Chowdhury (Senior Lecturer(Management) )");
        Email.add("E-mail: ashraful.cu@gmail.com");
        Tcell.add("01196078632");

        TeachersList.add("Shahedul Alam Khan (Senior Lecturer)");
        Email.add("E-mail: shahed_shuvo@yahoo.com");
        Tcell.add("01670565548");

        TeachersList.add("Chowdhury Tabassum Shakila (Senior Lecturer(Accounting) )");
        Email.add("E-mail: eva.dace@yahoo.com");
        Tcell.add("01717567346");

        TeachersList.add("Najia Jahura Joni(Lecturer(AIS) )");
        Email.add("E-mail: najiajahura@gmail.com");
        Tcell.add("01913586897");

        TeachersList.add("Shantono Hasan(Senior Lecturer(HRM) )");
        Email.add("E-mail: shantono_cumgt@yahoo.com");
        Tcell.add("01719889069");

        TeachersList.add("Mohammad Awal Hossen (Senior Lecturer)");
        Email.add("E-mail: ahossen178@gmail.com");
        Tcell.add("01670727194");

        TeachersList.add("Ms. Juhora Jamin Juha(Senior Lecturer(Marketing) )");
        Email.add("E-mail: jamin-3011@yahoo.com");
        Tcell.add("01775099906");

        TeachersList.add("Md. Rashidul Hasan(Lecturer(Statistics) )");
        Email.add("E-mail: rashidulhasan067@gmail.com");
        Tcell.add("01728885514");

        TeachersList.add("Tahrima Chowdhury Jannath (Lecturer (AIS))");
        Email.add("E-mail: tahrima@lus.ac.bd");
        Tcell.add("01196078632");

        TeachersList.add("Jaynob Sarker (Lecturer (AIS))");
        Email.add("E-mail: kantajnu@gmail.com");
        Tcell.add("01683931272");

        TeachersList.add("Marina Akter (Lecturer (Economics))");
        Email.add("E-mail: marine_sust@yahoo.com");
        Tcell.add("01739970624");

        TeachersList.add("Md. Mahbobor Rahaman(Lecturer (MIS))");
        Email.add("E-mail: mahbobdumis@gmail.com");
        Tcell.add("01723347110");

        TeachersList.add("Ram Proshad Barman (Lecturer(Sociology) )");
        Email.add("E-mail: proshadram2400@gmail.com");
        Tcell.add("01736202610");

        TeachersList.add("Kapizul Islam (Lecturer)");
        Email.add("E-mail: kapizul.ais.cu@gmail.com");
        Tcell.add("01746819645");

        TeachersList.add("Mohammad Saiful Islam (Lecturer (Banking))");
        Email.add("E-mail: saif_kazal@yahoo.com");
        Tcell.add("01913763700");

        TeachersList.add("Md. Sajadul Islam Sarker (Lecturer (Finance))");
        Email.add("E-mail:  sajadul.comilla@gmail.com");
        Tcell.add("01725356173");


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
                AlertDialog.Builder builder = new AlertDialog.Builder(TeachersInfoBBA.this);
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

