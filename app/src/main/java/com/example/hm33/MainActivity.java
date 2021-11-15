package com.example.hm33;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText gmail, them, mess;
    private Button Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.f1);
        them = findViewById(R.id.f2);
        mess = findViewById(R.id.f3);
        Send = findViewById(R.id.f4);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW
                , Uri.parse("mailto:" + gmail.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT,them.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,mess.getText().toString());
                startActivity(intent);
            }
        });


            }

        }

