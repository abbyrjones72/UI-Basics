package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeoutException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private EditText edtTxtEmail;
    private TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        edtTxtEmail = findViewById(R.id.edtTxtEmail);
        txtEmail = findViewById(R.id.txtEmail);

        btnSubmit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "I'm being pressed long!", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.btnSubmit:
                Toast.makeText(this, "I need a job...", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "This House is Clean.", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }
    }
}