package com.example.volley;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Recyclerview_Adapter extends RecyclerView.Adapter<Recyclerview_Adapter.RecyclerviewHolder> {
    MainActivity mainActivity;
    ArrayList<DataModel> list;

    public Recyclerview_Adapter(MainActivity mainActivity, ArrayList<DataModel> list) {
        this.mainActivity = mainActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public Recyclerview_Adapter.RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item,parent,false);
        RecyclerviewHolder holder = new RecyclerviewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_Adapter.RecyclerviewHolder holder, int position) {
//        holder.id.setText(list.get(position).getId());
        holder.name.setText(list.get(position).getName());
        holder.username.setText(list.get(position).getUsername());
        holder.phone.setText(list.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerviewHolder extends RecyclerView.ViewHolder {
        TextView id,name,username,phone;
        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.recyclerview_id);
            name = itemView.findViewById(R.id.name);
            username = itemView.findViewById(R.id.username);
            phone = itemView.findViewById(R.id.phone);
        }
    }
}
