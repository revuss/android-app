package com.example.chatapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PayActivity extends AppCompatActivity {
    private Button pays;
    private TextView Gpay;
    private EditText name,amount,cardno,month,cvv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        getSupportActionBar().hide();

        pays = findViewById(R.id.pays);
        Gpay = findViewById(R.id.Gpay);
        name = findViewById(R.id.name);
        amount= findViewById(R.id.amount);
        cardno = findViewById(R.id.cardno);
        month = findViewById(R.id.month);
        cvv = findViewById(R.id.cvv);





        pays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm = name.getText().toString();
                String am = amount.getText().toString();
                String card = amount.getText().toString();
                String mn = month.getText().toString();
                String cv = month.getText().toString();
                if(!am.equals("") && !card.equals("") && !card.equals("") && !mn.equals("") && !cv.equals(""))
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(PayActivity.this);
                    alertDialog.setTitle("Status")
                            .setMessage("Payment Successful").setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                    dialogInterface.cancel();
                                }
                            }).show();
                    alertDialog.create();
                }
                else
                {
                    Toast.makeText(PayActivity.this,"Enter all field",Toast.LENGTH_SHORT).show();
                }
            }
        });

//        if(!nm.equals("") && !am.equals("") && !card.equals("") && !card.equals("") && !mn.equals("") && !cv.equals(""))
//        {
//

//                }
//            });
//        }
//        else
//        {
//            Toast.makeText(this,"Enter all fields",Toast.LENGTH_SHORT).show();
//        }


        Gpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.paisa.user");

//
                if(launchIntent != null)
                {
                    startActivity(launchIntent);
                }
                else
                {
                    Toast.makeText(PayActivity.this,"App not found",Toast.LENGTH_LONG).show();
                }

            }
        });




//        pays.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//

//            }
//        });




    }
}