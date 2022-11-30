package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        EditText text = (EditText)findViewById(R.id.number);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String number =  text.getText().toString();
                int value = Integer.parseInt(number);
                switch(checkNum(value)){
                    case 1:
                        startActivity(new Intent(MainActivity.this, EvenActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, OddActivity.class));
                        break;
                }
            }
        });
    }
    public int checkNum(int num) {
        if (num % 2 == 0) {
            return 1;
        } else
            return 2;
    }
}