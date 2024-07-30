package com.ssasit.pr3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button imp,exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.txturl);
        imp = findViewById(R.id.btnimp);
        exp = findViewById(R.id.btnexp);

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exintent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(exintent);
            }
        });

        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent impintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url.getText().toString()));
                startActivity(impintent);
            }
        });

    }
}
