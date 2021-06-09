package com.example.loginice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View view) {
        EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
        EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        String userName = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        
        if (userName.equals(userData.userName)) {
            if (password.equals(userData.password)) {
                goToHome();
            }
            else {
                Toast.makeText(this, "Password is incorrect", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "Username does not exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToActivity2 (View view) {
        Intent intent = new Intent (this, Register.class);
        startActivity(intent);
    }

    private void goToHome() {
        Intent intent = new Intent (this, Home.class);
        startActivity(intent);
    }
}