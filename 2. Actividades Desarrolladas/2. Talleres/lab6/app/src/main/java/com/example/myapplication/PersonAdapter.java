package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {

    private Context mContext;
    private int mResrouce;
    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResrouce = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResrouce, parent, false);

        ImageView imageView = convertView.findViewById(R.id.imagen);
        TextView txtName = convertView.findViewById(R.id.texto1);
        TextView txtDesc = convertView.findViewById(R.id.texto2);

        imageView.setImageResource(getItem(position).getImg());
        txtName.setText(getItem(position).getName());
        txtDesc.setText(getItem(position).getDesc());

        return convertView;
    }
}
