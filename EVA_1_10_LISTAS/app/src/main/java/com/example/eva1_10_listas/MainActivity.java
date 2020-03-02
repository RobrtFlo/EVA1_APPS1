package com.example.eva1_10_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener  {

    ListView listBandas;
    String[] Bandonas = {
            "ACDC",
            "Cuarteto de Nos",
            "Queen",
            "Rolling Stones",
            "U2",
            "Enanitos Verdes",
            "The Beatles",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listBandas = findViewById(R.id.list1);
        listBandas.setAdapter(
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        Bandonas
                ));

        listBandas.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), Bandonas[position], Toast.LENGTH_SHORT).show();

    }
}
