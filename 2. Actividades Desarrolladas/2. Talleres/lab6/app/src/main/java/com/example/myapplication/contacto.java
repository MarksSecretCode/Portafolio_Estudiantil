package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class contacto extends AppCompatActivity {

    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        listView1 = findViewById(R.id.listView1);

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(R.drawable.dc1, "Flash", "Tel: 6548153"));
        arrayList.add(new Person(R.drawable.dc2, "Batman", "Tel: 15481531"));
        arrayList.add(new Person(R.drawable.dc3, "Superman", "Tel: 4812325"));
        arrayList.add(new Person(R.drawable.dc4, "WonderWoman", "Tel: 112354"));

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.item_list, arrayList);

        listView1.setAdapter(personAdapter);
    }

    public void regresar(View view){
        finish();
    }

}

