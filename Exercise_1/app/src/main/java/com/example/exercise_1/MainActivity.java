package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText un;
    private  EditText ps;
    private Button btn;
    private TextView Info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un = (EditText) findViewById(R.id.editUN);
        ps = (EditText) findViewById(R.id.editPass);
        btn = (Button) findViewById(R.id.btnok);

        Info.setText("No of attempts reaming: 5");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(un.getText().toString(), ps.getText().toString());
            }
        });
    }
    private void validate (String userName, String userPassword) {
        if((userName == "admin") && (userPassword == "123")) {
            Intent intent = new Intent(MainActivity.this, Main2.class);
            startActivity(intent);
        }else {
            counter--;

            Info.setText("No of attempts reaming: " + String.valueOf(counter));

            if(counter == 0) {
                btn.setEnabled(false);
            }
        }
    }

    public void showPopup(View view) {
    }
}
