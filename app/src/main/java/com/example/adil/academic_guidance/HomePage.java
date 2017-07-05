package com.example.adil.academic_guidance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomePage extends AppCompatActivity
{

    DatabaseHelper helper = new DatabaseHelper(this);
    Button SignIn;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        SignIn = (Button) findViewById(R.id.signIn);
        SignUp = (Button) findViewById(R.id.signUp);



        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(v.getId() == R.id.signIn)
                {
                    EditText a = (EditText)findViewById(R.id.uName);
                    String userName = a.getText().toString();
                    EditText b = (EditText)findViewById(R.id.password);
                    String pass = b.getText().toString();
                    String password = helper.searchPass(userName);
                    if(pass.length() > 0 && password.length() > 0 && userName.length() > 0)
                    {
                        if(pass.equals(password))
                        {
                            String u = userName;


                                Intent signInIntent = new Intent(getApplicationContext(),  DepartmentActivity.class);
                                signInIntent.putExtra("U", u);
                                startActivity(signInIntent);








                            /*Intent i = new Intent(TeachersInfoCIVIL.this,OneTapCall.class);
                            i.putExtra("TAG",name);
                            i.putExtra("CELL", cell);
                            startActivity(i);*/
                        }

                        else
                        {
                            Toast.makeText(getApplicationContext(), "Username not exists! ", Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Please insert id and password! ", Toast.LENGTH_LONG).show();
                    }


                }

            }
        });
        SignUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                Intent signUpIntent = new Intent(getApplicationContext(), SignUp.class);
                startActivity(signUpIntent);
            }
        });
    }


}
