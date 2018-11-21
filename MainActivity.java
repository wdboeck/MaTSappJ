package com.example.wdboeck.matsappj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private EditText input3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.editText1);
        input2 = (EditText) findViewById(R.id.editText2);
        input3 = (EditText) findViewById(R.id.editText3);

        Button resistButton = (Button) findViewById(R.id.button1);
        resistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = new Double(input2.getText().toString())
                        / new Double(input3.getText().toString());
                input1.setText(Double.toString(result));
            }
        });

    }
}
