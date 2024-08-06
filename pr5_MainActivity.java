package com.ssasit.pr5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar mn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mn = findViewById(R.id.mtool);
        setSupportActionBar(mn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mnu = getMenuInflater();
        mnu.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.profile){
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.info) {
            Toast.makeText(this, "info", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.setting) {
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.aboutus) {
            Toast.makeText(this, "About US", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
    }
}
