package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    Weather[] objects;
    private Context context;
    private int resource;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {//PRIMERA VEZ,HAY QUE CREAR EL LAYOUT
            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent,false);
        }
        //HAY QUE RECUPERAR LOS COMPONENTES
        ImageView imgView1;
        TextView txtViewName,txtViewTemp,txtViewDesc;
        imgView1 = convertView.findViewById(R.id.imgView1);
        txtViewName = convertView.findViewById(R.id.txtViewName);
        txtViewTemp = convertView.findViewById(R.id.txtViewTemp);
        txtViewDesc = convertView.findViewById(R.id.txtViewDesc);
        imgView1.setImageResource(objects[position].getImage());
        txtViewName.setText(objects[position].getCity());
        txtViewTemp.setText(""+objects[position].getTemp());
        txtViewDesc.setText(objects[position].getDesc());


        return convertView;
    }

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
    }
}
