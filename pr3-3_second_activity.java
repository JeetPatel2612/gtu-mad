package com.ssasit.pr3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class second_activity extends AppCompatActivity {

    EditText etv;
    Button sbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        etv = findViewById(R.id.etxtname);
        sbtn = findViewById(R.id.btn);

        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = etv.getText().toString();
                Intent int2 = new Intent();
                int2.putExtra("msg",msg);
                setResult(21,int2);
                finish();
            }
        });

    }
}
