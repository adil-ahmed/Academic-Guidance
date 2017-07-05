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

public class BStyle extends BaseAdapter
{
    private Activity context;
    /**
     * Whole activity is called Context
     */
    ArrayList<String> v;




    /**
     * Constructor
     */

    public BStyle(A35 A35, ArrayList<String> v)
    {

        this.context = A35;
        this.v = v;


    }
    public BStyle(B35 B35, ArrayList<String> v)
    {

        this.context = B35;
        this.v = v;


    }
    public BStyle(Book Book, ArrayList<String> v)
    {

        this.context = Book;
        this.v = v;


    }






    @Override
    public int getCount() /** its works until the array size is over */
    {
        return v.size();

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
            convertView = context.getLayoutInflater().inflate(R.layout.activity_bstyle, parent, false);
        }


        /** Finding value form XML file */
        TextView Val = (TextView) convertView.findViewById(R.id.v);
        //Button TeacherCell = (Button) convertView.findViewById(R.id.buttonCall);
        //ImageView flag = (ImageView) convertView.findViewById(R.id.flag);



        String name = v.get(position); /**  */
        Val.setText(name);




        return convertView;





    }

}
