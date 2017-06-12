package com.example.user1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View v) {

        // Get the input and output controls.
        EditText input = (EditText) findViewById(R.id.etInput);
        TextView output = (TextView) findViewById(R.id.tvOutput);

        // Process the data.
        int base = Integer.valueOf(input.getText().toString());
        int result = base * base;
        String formattedResult = String.format("%,d", result);

        // Output the result.
        output.setText("Result: " + formattedResult);
    }



}
