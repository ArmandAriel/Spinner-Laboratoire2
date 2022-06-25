package com.example.spinner_laboratoire2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spinner_laboratoire2.R.drawable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements OnItemSelectedListener {

    Spinner spinnerProvince;
    ImageView imagdrapeau;
    TextView textVilles, spinnerVille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerProvince = (Spinner) findViewById(R.id.spinnerProvince);
        //spinnerVille = findViewById(R.id.spinnerVille);
        imagdrapeau = findViewById(R.id.imagdrapeau);
        textVilles = findViewById(R.id.textVilles);
        spinnerProvince.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long arg3) {
        parent.getItemAtPosition(pos);
        if (pos == 0) {
            imagdrapeau.setImageResource(R.drawable.quebec);
            textVilles.setText("Montreal" +"\n"+ "Québec" +"\n"+ "Laval" );
            //ArrayAdapter<CharSequence> adapter = ArrayAdapter
                    //.createFromResource(this, R.array.city_quebec,
                            //android.R.layout.simple_spinner_item);
            //spinnerVille.setAdapter(adapter);


        } else if (pos == 1) {
            imagdrapeau.setImageResource(R.drawable.ontario);
            textVilles.setText("Ottawa" +"\n"+ "Toronto" +"\n"+ "Niagara Falls" );
            //ArrayAdapter<CharSequence> adapter = ArrayAdapter
                    //.createFromResource(this, R.array.city_ontario,
                           // android.R.layout.simple_spinner_item);
            //spinnerVille.setAdapter(adapter);


        } else if (pos == 2) {
            imagdrapeau.setImageResource(drawable.alberta);
            textVilles.setText("Calgary" +"\n"+ "Edmonton" +"\n"+ "Saint-Albert");
            //ArrayAdapter<CharSequence> adapter = ArrayAdapter
                   // .createFromResource(this, R.array.city_alberta,
                           // android.R.layout.simple_spinner_item);
            //spinnerVille.setAdapter(adapter);

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}
