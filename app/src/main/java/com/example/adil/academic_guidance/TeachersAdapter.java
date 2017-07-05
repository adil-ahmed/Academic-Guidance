package com.example.adil.academic_guidance;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Adil on 12/11/2016.
 */

public class TeachersAdapter extends BaseAdapter
{
    private Activity context;
    /**
     * Whole activity is called Context
     */
    ArrayList<String> TeachersList;
    ArrayList<String> email;
    ArrayList<String> cell;

    //ArrayList<String> info;



    /**
     * Constructor
     */

    public TeachersAdapter(TeachersInfo TeachersInfo, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfo;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }

    public TeachersAdapter(TeachersInfoEEE TeachersInfoEEE, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoEEE;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoBBA TeachersInfoBBA, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoBBA;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoCIVIL TeachersInfoCIVIL, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoCIVIL;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoARCHITECTURE TeachersInfoARCHITECTURE, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoARCHITECTURE;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoLLB TeachersInfoLLB, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoLLB;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoENGLISH TeachersInfoENGLISH, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoENGLISH;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }
    public TeachersAdapter(TeachersInfoISLAMIC TeachersInfoISLAMIC, ArrayList<String> TeachersList,ArrayList<String>
            email,ArrayList<String> cell)
    {

        this.context = TeachersInfoISLAMIC;
        this.TeachersList = TeachersList;
        this.email = email;
        this.cell = cell;


    }



    @Override
    public int getCount() /** its works until the array size is over */
    {
        return TeachersList.size();

    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    /**For creating first view of arraylist */
    /** ConvertView == To create main view */
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            /** To creating view first time, we use getLayoutInflater()  */
            convertView = context.getLayoutInflater().inflate(R.layout.list_item_teachers, parent, false);
        }


        /** Finding value form XML file */
        TextView TeacherName = (TextView) convertView.findViewById(R.id.NameOfTeacher);
        TextView Email = (TextView) convertView.findViewById(R.id.Email);
        TextView TeacherCell = (TextView) convertView.findViewById(R.id.buttonCall);
        //Button TeacherCell = (Button) convertView.findViewById(R.id.buttonCall);
        //ImageView flag = (ImageView) convertView.findViewById(R.id.flag);



        String name = TeachersList.get(position); /**  */
        TeacherName.setText(name);
        Email.setText(email.get(position));
        TeacherCell.setText(cell.get(position));



        return convertView;





    }

}
