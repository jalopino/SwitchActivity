package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.odd_activity);
        final TextView textViewToChange = (TextView) findViewById(R.id.oddValue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("odd");
            //The key argument here must match that used in the other activity
            textViewToChange.setText(value);
        }
        Button btn = (Button)findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent main = new Intent(OddActivity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}