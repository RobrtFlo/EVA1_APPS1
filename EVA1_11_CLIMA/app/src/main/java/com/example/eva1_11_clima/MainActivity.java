package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstVwClima;

    Weather[] cities = {
            new Weather("Chihuahua", 20, "Nublado", R.drawable.light_rain),
            new Weather("Delicias", 15, "Nublado", R.drawable.light_rain),
            new Weather("Jimenez", 27, "Soleado", R.drawable.sunny),
            new Weather("Juarez", 3, "Nevando", R.drawable.snow),
            new Weather("Camargo", 23, "LLoviendo", R.drawable.rainy),
            new Weather("Parral", 20, "Nublado", R.drawable.light_rain),
            new Weather("Aldama", 16, "Despejado", R.drawable.sunny),
            new Weather("Batopilas", 24, "Lloviendo", R.drawable.thunderstorm),
            new Weather("Creel", 17, "Nublado", R.drawable.light_rain),
            new Weather("Ojinaga", 28, "Soleado", R.drawable.sunny)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout,cities));
    }
}
