package com.example.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JavaActivity extends AppCompatActivity {
    private Button intro,quick,basic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        getSupportActionBar().hide();

        intro = findViewById(R.id.intro);
        quick = findViewById(R.id.quick);
        basic = findViewById(R.id.basic);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JavaActivity.this,IntroActivity.class));
            }
        });

        quick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JavaActivity.this,quickActivity.class));
            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JavaActivity.this,basicActivity.class));
            }
        });
    }
}