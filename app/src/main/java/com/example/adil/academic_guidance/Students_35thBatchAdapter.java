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

public class Students_35thBatchAdapter extends BaseAdapter
{
    private Activity context;
    /**
     * Whole activity is called Context
     */

    ArrayList<String> StudentName;
    ArrayList<String> ID;
    ArrayList<String> StudentCell;

    //ArrayList<String> info;



    /**
     * Constructor
     */

    public Students_35thBatchAdapter(Students_35thBatchA Students_35thBatchA, ArrayList<String> StudentName ,ArrayList<String> ID ,ArrayList<String> StudentCell) {

        this.context = Students_35thBatchA;
        this.StudentName = StudentName;
        this.ID = ID;
        this.StudentCell = StudentCell;

    }
    public Students_35thBatchAdapter(Students_35thBatchB Students_35thBatchB, ArrayList<String> StudentName ,ArrayList<String> ID ,ArrayList<String> StudentCell) {

        this.context = Students_35thBatchB;
        this.StudentName = StudentName;
        this.ID = ID;
        this.StudentCell = StudentCell;

    }




    @Override
    public int getCount() /** its works until the array size is over */
    {
        return StudentName.size();


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
            convertView = context.getLayoutInflater().inflate(R.layout.list_item_students, parent, false);
        }


        /** Finding value form XML file */
        TextView NameOfStudent = (TextView) convertView.findViewById(R.id.Name);
        TextView IDOfStudent = (TextView) convertView.findViewById(R.id.ID);
        TextView CellOfStudent = (TextView) convertView.findViewById(R.id.buttonCall);
   //     Button CellOfStudent = (Button) convertView.findViewById(R.id.buttonCall);



        String name = StudentName.get(position); /**  */
        NameOfStudent.setText(name);

        IDOfStudent.setText(ID.get(position));
        CellOfStudent.setText(StudentCell.get(position));



        return convertView;





    }
}
