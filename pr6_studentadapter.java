package com.ssasit.pr6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class studentadapter extends RecyclerView.Adapter<studentadapter.studentviewholder> {
    private Context context;
    private List<student> studentlist;
    private onDeleteClickListener onDeleteClickListener;

    public studentadapter(Context context, List<student> studentlist, onDeleteClickListener onDeleteClickListener) {
        this.context = context;
        this.studentlist = studentlist;
        this.onDeleteClickListener = onDeleteClickListener;
    }

    @NonNull
    @Override
    public studentviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {  // Here, viewGroup is parent.
        View view = LayoutInflater.from(context).inflate(R.layout.student_item,viewGroup,false);    //pass the parent here.
        return new studentviewholder(view,onDeleteClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull studentviewholder studentviewholder, int i) { //Here, int i is the position.
        student student = studentlist.get(i);   // pass the position here.
        studentviewholder.nametv.setText((student.getName()));
        studentviewholder.addresstv.setText((student.getAddress()));
        studentviewholder.photoid.setImageResource((student.getImage()));
    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }

    public interface onDeleteClickListener{
        void onDeleteClick(int i); // Here, i is the position of item, which user wants to be deleted.
    }

    public class studentviewholder extends RecyclerView.ViewHolder{
        TextView nametv,addresstv;
        ImageView photoid;
        Button deletebutton;

        public studentviewholder(@NonNull View itemView, onDeleteClickListener onDeleteClickListener) {
            super(itemView);
            nametv = itemView.findViewById(R.id.txtname);
            addresstv = itemView.findViewById(R.id.txtaddress);
            photoid = itemView.findViewById(R.id.img);
            deletebutton = itemView.findViewById(R.id.btn);

            deletebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onDeleteClickListener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            onDeleteClickListener.onDeleteClick(position);
                        }
                    }
                }
            });
        }
    }
}
