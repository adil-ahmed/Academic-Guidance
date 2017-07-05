package com.example.adil.academic_guidance;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class OneTapCall extends AppCompatActivity
{
    ImageButton button;
    String name,cell;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_tap_call);
        button = (ImageButton) findViewById(R.id.buttonCall);

        Bundle b = getIntent().getExtras();
        if(b != null)
        {
            name = b.getString("TAG");
            cell = b.getString("CELL");
        }
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + cell));

                if (ActivityCompat.checkSelfPermission(OneTapCall.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
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