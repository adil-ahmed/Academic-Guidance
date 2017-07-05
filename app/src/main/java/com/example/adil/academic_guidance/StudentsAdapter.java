package com.example.adil.academic_guidance;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adil on 12/3/2016.
 */

public class StudentsAdapter extends BaseAdapter {

    /*ActionBar actionBar = getSupportActionBar();
    if(actionBar!=null)

    {
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
*/

    private Activity context;
    /**
     * Whole activity is called Context
     */
    ArrayList<String> BatchList;

    //ArrayList<String> info;



    /**
     * Constructor
     */

    public StudentsAdapter(StudentsInfo StudentsInfo, ArrayList<String> BatchList)
    {

        this.context = StudentsInfo;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoEEE StudentsInfoEEE, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoEEE;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoBBA StudentsInfoBBA, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoBBA;
        this.BatchList = BatchList;

    }
   public StudentsAdapter(StudentsInfoCIVIL StudentsInfoCIVIL, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoCIVIL;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoARCHITECTURE StudentsInfoARCHITECTURE, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoARCHITECTURE;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoLLB StudentsInfoLLB, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoLLB;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoENGLISH StudentsInfoENGLISH, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoENGLISH;
        this.BatchList = BatchList;

    }
    public StudentsAdapter(StudentsInfoISLAMIC StudentsInfoISLAMIC, ArrayList<String> BatchList)
    {

        this.context = StudentsInfoISLAMIC;
        this.BatchList = BatchList;

    }






    @Override
    public int getCount() /** its works until the array size is over */
    {
        return BatchList.size();


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
            convertView = context.getLayoutInflater().inflate(R.layout.list_item, parent, false);
        }


        /** Finding value form XML file */
        TextView NameOfDepartment = (TextView) convertView.findViewById(R.id.Department);



        String name = BatchList.get(position); /**  */
        NameOfDepartment.setText(name);



        return convertView;





    }






}
