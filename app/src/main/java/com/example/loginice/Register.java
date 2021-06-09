package com.example.loginice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void register(View view) {
        EditText txtUsername2 = (EditText) findViewById(R.id.txtUsername2);
        EditText txtPassword2 = (EditText) findViewById(R.id.txtPassword2);
        EditText txtPassword3 = (EditText) findViewById(R.id.txtPassword3);

        String userName = txtUsername2.getText().toString();
        String password1 = txtPassword2.getText().toString();
        String password2 = txtPassword3.getText().toString();


        if (password1.equals(password2)) {
            userData.userName = userName;
            userData.password = password1;
            Toast.makeText(this, "User created!", Toast.LENGTH_SHORT).show();
            goToLogin();
        }
        else {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
        }
    }

    private void goToLogin() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}