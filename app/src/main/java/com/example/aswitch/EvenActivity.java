package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class EvenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.even_activity);
        final TextView textViewToChange = (TextView) findViewById(R.id.evenValue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("even");
            //The key argument here must match that used in the other activity
            textViewToChange.setText(value);
        }
        Button btn = (Button)findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent main = new Intent(EvenActivity.this, MainActivity.class);
                startActivity(main);
                }
            });
        }
    }

