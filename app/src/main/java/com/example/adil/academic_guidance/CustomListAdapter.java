package com.example.adil.academic_guidance;

/**
 * Created by Adil on 1/22/2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] itemname;
   private final Integer[] imgid;
    public CustomListAdapter(Activity context,String[] itemname,Integer[] imgid)
    {
        super(context,R.layout.activity_mylist,itemname);
        this.context=context;
        this.itemname=itemname;
       this.imgid=imgid;
    }
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_mylist,null,true);
        TextView txtTitle=(TextView)rowView.findViewById(R.id.text);
        ImageView imageview=(ImageView)rowView.findViewById(R.id.pic);

        txtTitle.setText(itemname[position]);
       imageview.setImageResource(imgid[position]);

        return rowView;
    }
}
