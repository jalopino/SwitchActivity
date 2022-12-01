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
                long globalValue = getNum(text.getText().toString());
                switch(checkNum(globalValue)){
                    case 1:
                        Intent even = new Intent(MainActivity.this, EvenActivity.class);
                        even.putExtra("even", text.getText().toString());
                        startActivity(even);
                        break;
                    case 2:
                        Intent odd = new Intent(MainActivity.this, OddActivity.class);
                        odd.putExtra("odd", text.getText().toString());
                        startActivity(odd);
                        break;
                }
            }
        });
    }
    public long getNum(String number) {
        long value = Long.parseLong(number);
        return value;
    }
    public int checkNum(long num) {
        if (num % 2 == 0) {
            return 1;
        } else
            return 2;
    }
}