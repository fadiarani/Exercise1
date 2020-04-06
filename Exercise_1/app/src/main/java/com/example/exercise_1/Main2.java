package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Main2 extends AppCompatActivity {

    Button btnprsg, btnling, btnprsgpnjg, btntrape, btnsgtg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnprsg = (Button) findViewById(R.id.button1);
    }
}
