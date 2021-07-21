package com.example.a3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnChangi;
    TextView txtvalue;
    EditText etvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangi = findViewById(R.id.btn_change);
        txtvalue = findViewById(R.id.txt_value);
        etvalue=findViewById(R.id.et_value);

        btnChangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etvalue.getText().toString();
                txtvalue.setText(value);

            }
        });

    }


    }
