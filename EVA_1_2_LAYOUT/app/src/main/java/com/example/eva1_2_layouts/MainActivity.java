package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTxtNom, edtTxtApe, edtTxtEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect components
        edtTxtApe = findViewById(R.id.edtTxtApell);
        edtTxtNom = findViewById(R.id.edtTxtNob);
        edtTxtEdad = findViewById(R.id.editTextEdad);
    }
}
