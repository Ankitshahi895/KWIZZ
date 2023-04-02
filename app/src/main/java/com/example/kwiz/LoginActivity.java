package com.example.kwiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText email, pass;
    private Button loginB;
    private TextView forgotPassB , signupB ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        loginB = findViewById(R.id.loginB);
        forgotPassB = findViewById(R.id.forgotPassB);
        signupB = findViewById(R.id.signupB);

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validdateData())
                {
                    login();
                }
            }
        });
    }

    private boolean validdateData()
    {
        boolean status = false;
        if(email.getText().toString().isEmpty())
        {
            email.setError("Enter email ID");
            return false;
        }
        if(pass.getText().toString().isEmpty())
        {
            pass.setError("Enter password");
            return false;
        }

        return true;
    }

    private void  login()
    {

    }
}