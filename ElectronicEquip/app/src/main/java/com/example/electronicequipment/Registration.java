package com.example.electronicequipment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    private Button CreateAccountbtn;
    private EditText fNameInput,lNameInput,phNumberInput,emailInput,passwordInput;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        CreateAccountbtn=findViewById(R.id.registerBtn);
        fNameInput=findViewById(R.id.firstName);
        lNameInput=findViewById(R.id.lastName);
        phNumberInput=findViewById(R.id.phnumber);
        emailInput=findViewById(R.id.email);
        passwordInput=findViewById(R.id.password);
        loadingBar=new ProgressDialog(this);

        CreateAccountbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount();
            }
        }));
    }

    private void createAccount() {
        String fname=fNameInput.getText().toString();
        String lname=lNameInput.getText().toString();
        String phone=phNumberInput.getText().toString();
        String emailid=emailInput.getText().toString();
        String passwordfield=passwordInput.getText().toString();

        if(TextUtils.isEmpty(fname))
        {
            Toast.makeText(this,"Please Write Your First Name",Toast.LENGTH_LONG).show();
        }
        if(TextUtils.isEmpty(lname))
        {
            Toast.makeText(this,"Please Write Your Last Name",Toast.LENGTH_LONG).show();
            if(TextUtils.isEmpty(phone))
            {
                Toast.makeText(this,"Please Write Your Phone Number",Toast.LENGTH_LONG).show();
            }
        } if(TextUtils.isEmpty(emailid))
        {
            Toast.makeText(this,"Please Write Your EmailId",Toast.LENGTH_LONG).show();
        } if(TextUtils.isEmpty(passwordfield))
        {
            Toast.makeText(this,"Please Write Your Password",Toast.LENGTH_LONG).show();
        }
        else
        {
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait a moment,we are Verifying the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();
            ValidateEmailId(fname,lname,phone,emailid,passwordfield);
        }

    }

    private void ValidateEmailId(String fname, String lname, String phone, String emailid, String passwordfield) {

    }
}