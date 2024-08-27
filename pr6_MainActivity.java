package com.ssasit.pr6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.CallLog;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private studentadapter adapter;
    private List<student> studentlist; // Here, <student> is datatype of list &
                                       // studentlist is object of list.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentlist = new ArrayList<>(); // Generate Empty array list, to use during runtime.
        studentlist.add(new student("Jeet","123, ABC Street, Surat",R.drawable.img1));
        studentlist.add(new student("WIR","245, BBC Street, Delhi",R.drawable.img2));
        studentlist.add(new student("GKD","765, HDS Street, Pune",R.drawable.img1));
        studentlist.add(new student("ABC","356, FSE Street, Rajkot",R.drawable.img2));
        studentlist.add(new student("PQR","687, YRE Street, Gandhinagar",R.drawable.img1));
        studentlist.add(new student("XYZ","456, HFD Street, Baroda",R.drawable.img2));
        studentlist.add(new student("LMA","344, HKG Street, Rajkot",R.drawable.img1));
        studentlist.add(new student("SDK","234, LTK Street, Mumbai",R.drawable.img2));
        studentlist.add(new student("KFD","133, PRE Street, Mumbai",R.drawable.img1));
        studentlist.add(new student("AKR","456, HIT Street, Rajkot",R.drawable.img2));

        adapter = new studentadapter(this,studentlist,this::onDeleteClick);
        recyclerView.setAdapter(adapter);
    }

    public void onDeleteClick(int position){
        studentlist.remove(position);
        adapter.notifyItemRemoved(position);
    }

}
