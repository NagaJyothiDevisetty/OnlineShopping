package com.example.electronicequipment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
private Button loginBtn;
    EditText emailId,userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailId=findViewById(R.id.email);
        userPassword=findViewById(R.id.password);
        loginBtn=findViewById(R.id.signIn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String email=emailId.getText().toString().trim();
              String password=userPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                emailId.setError("Email Field is Required.");
                return;
            }
            if (TextUtils.isEmpty(password)){
                userPassword.setError("Password Field is Required");
                return;
            }
            if (password.length() <= 8) {
                userPassword.setError("Password Field must be equal or less than 8 charecters");
                return;
            }
            }
            });
    }
}