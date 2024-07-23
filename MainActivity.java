package com.ssasit.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText U_name;
    EditText Pass;
    CheckBox Remember;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        U_name = findViewById(R.id.txt_u_name);
        Pass = findViewById(R.id.txt_pass);
        Remember = findViewById(R.id.chk_rem);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Remember.isActivated()){
                Toast.makeText(MainActivity.this, "Welcome "+U_name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Me:(From future) I've never seen You before!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
