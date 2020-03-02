package com.example.eva_1_3_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAnd;
    TextView txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAnd = findViewById(R.id.imgAndroid);
        txtTitle = findViewById(R.id.txtTitle);
        imgAnd.setImageResource(R.drawable.ic_launcher_foreground);
        txtTitle.setText("resources");
    }
}
