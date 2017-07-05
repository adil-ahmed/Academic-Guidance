package com.example.adil.academic_guidance;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity
{
    DatabaseHelper helper = new DatabaseHelper(this);
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */

        signUp = (Button) findViewById(R.id.btSignUp);
        signUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText name = (EditText) findViewById(R.id.TFName);
                EditText uname = (EditText) findViewById(R.id.TFUID);
                EditText pass1 = (EditText) findViewById(R.id.TFPass1);
                EditText pass2 = (EditText) findViewById(R.id.TFPass2);

                String namestr = name.getText().toString();
                String unamestr = uname.getText().toString();
                String pass1str = pass1.getText().toString();
                String pass2str = pass2.getText().toString();


                    if(pass1str.length() > 0 && pass2str.length() > 0)
                    {
                        if(!pass1str.equals(pass2str))
                        {
                            Toast.makeText(getApplicationContext(), "Password  don't match! ", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Contact c = new Contact();
                            c.setName(namestr);
                            c.setUname(unamestr);
                            c.setPass(pass1str);

                            helper.insertContact(c);
                            Toast.makeText(getApplicationContext(), "Registration successful! Please sign in", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(SignUp.this,HomePage.class);
                            startActivity(i);
                        }
                    }
                else if(pass1str.length() == 0 && pass2str.length() == 0 && namestr.length() == 0 && unamestr.length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Please complete the fields", Toast.LENGTH_LONG).show();
                    }



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
