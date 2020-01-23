package com.example.testtontine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TontineActivity extends AppCompatActivity {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tontine );

        Button Invitation = findViewById(R.id.btninvitation);
        ImageButton btn1= findViewById( R.id.btn1);
        ImageButton btn2= findViewById( R.id.btn2 );
        ImageButton btn3= findViewById( R.id.btn3 );

        Invitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TontineActivity.this, InvitationActivity.class);
                startActivity(i);
                finish();

            }
        });

        Button Creation = findViewById(R.id.btncreation);

        Creation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TontineActivity.this, CreerActivity.class);
                startActivity(i);
                finish();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TontineActivity.this, T10Activity.class);
                startActivity(i);
                finish();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TontineActivity.this, T50Activity.class);
                startActivity(i);
                finish();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TontineActivity.this, TmatActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}
