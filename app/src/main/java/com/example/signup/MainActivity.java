package com.example.signup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sendToParse;
    EditText edtName,edtFamilyName,edtCountry,edtSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        sendToParse = findViewById ( R.id.button );
        edtName = findViewById ( R.id.edtName );
        edtFamilyName = findViewById ( R.id.edtFamilyName );
        edtCountry = findViewById ( R.id.edtCountry );
        edtSkills = findViewById ( R.id.edtSkills );

        sendToParse.setOnClickListener ( MainActivity.this );

    }

    @Override
    public void onClick(View view) {
        final ParseObject kikBoxer = new ParseObject ( "kikBoxer" );
        kikBoxer.put ( "name",edtName.getText ().toString () );
        kikBoxer.put ( "familyName",edtFamilyName.getText ().toString () );
        kikBoxer.put ( "country",edtCountry.getText ().toString () );
        kikBoxer.put ( "skills",edtSkills.getText ().toString () );
        kikBoxer.saveInBackground ( new SaveCallback ( ) {
            @Override
            public void done(ParseException e) {
                if(e == null)
                {
                    Toast.makeText ( MainActivity.this,kikBoxer.get("name")+"    the action has succeed",Toast.LENGTH_LONG ).show ();
                }
            }
        } );

    }
}
