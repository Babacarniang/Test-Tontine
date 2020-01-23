package com.example.testtontine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtphon;
    Button btninscri;
    DatabaseReference reff;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toast.makeText( MainActivity.this,"Connexion Firebase reussi",Toast.LENGTH_LONG).show();

txtname = (EditText)findViewById( R.id.etnom );
txtphon = (EditText)findViewById( R.id.etphon );
btninscri = (Button)findViewById( R.id.btninvi );
member =  new Member();
reff= FirebaseDatabase.getInstance().getReference().child( "Membre" );
btninscri.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Long phon=Long.parseLong( txtphon.getText().toString().trim() );

        member.setName(txtname.getText().toString().trim());
        member.setPhon(phon);
        reff.child("membre1").setValue(member);
Toast.makeText( MainActivity.this, "Insertion données reussi",Toast.LENGTH_LONG).show();
    }
} );

        Button inscrire = findViewById(R.id.btninvi );

        inscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AccueilActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}
