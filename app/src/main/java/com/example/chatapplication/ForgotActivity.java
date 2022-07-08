package com.example.chatapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.chip.Chip;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotActivity extends AppCompatActivity {
    private EditText editTextForgot;
    private Chip buttonForgot;

    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        getSupportActionBar().hide();

        auth = FirebaseAuth.getInstance();

        editTextForgot = findViewById(R.id.editTextForgot);
        buttonForgot = findViewById(R.id.buttonForgot);

        buttonForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextForgot.getText().toString();
                if(!email.equals(""))
                {
                    passwordReset(email);
                }
            }
        });

    }
    public void passwordReset(String email)
    {
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(ForgotActivity.this,"successfully sent an email",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ForgotActivity.this,"Check",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}