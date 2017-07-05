package com.example.adil.academic_guidance;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adil on 12/2/2016.
 */

public class DepartmentAdapter extends BaseAdapter {

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
    ArrayList<String> Departments;

    //ArrayList<String> BatchList;

    //ArrayList<String> info;



    /**
     * Constructor
     */
    public DepartmentAdapter(DepartmentActivity DepartmentActivity, ArrayList<String> Departments)
    {

        this.context = DepartmentActivity;
        this.Departments = Departments;


    }







    @Override
    public int getCount() /** its works until the array size is over */
    {
        return Departments.size();


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




        String name = Departments.get(position); /**  */
        NameOfDepartment.setText(name);




        return convertView;





    }





}
