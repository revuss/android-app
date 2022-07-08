package com.example.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PythoActivity extends AppCompatActivity {

    private TextView quickp,basicp,introp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytho);
        getSupportActionBar().hide();


        quickp = findViewById(R.id.quickp);
        basicp = findViewById(R.id.basicp);
        introp = findViewById(R.id.introp);

        introp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PythoActivity.this,IntropyActivity.class));
            }
        });

        basicp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PythoActivity.this,PythonActivity.class));
            }
        });
        quickp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PythoActivity.this,PyintActivity.class));
            }
        });
    }
}