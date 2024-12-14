package com.example.ex11063_custom_spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    TextView tV_country;
    Spinner spin;

    String[] countries = {"Austria" ,"French" ,"Israel" ,"USA","Canada", "Germany", "Italy"};
    int[] countries_flags_img = {
            R.drawable.flag_of_austria,
            R.drawable.flag_of_french,
            R.drawable.flag_of_israel,
            R.drawable.flag_of_usa,
            R.drawable.flag_of_canada,
            R.drawable.flag_of_germany,
            R.drawable.flag_of_italy
    };
    String[] countries_capital = {"Vienna", "Paris", "Jerusalem", "Washington, D.C.", "Ottawa", "Berlin", "Rome"};
    String[] countries_population = {"8.9 million", "68 million", "9.7 million", "331 million", "39 million", "84 million", "60 million"};
    Country[] countries_p = new Country[7];
    customAdapter spinCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV_country = findViewById(R.id.tV_country);
        spin = findViewById(R.id.spin);

        for(int i = 0; i < 7; i++)
        {
            countries_p[i] = new Country(countries[i], countries_flags_img[i], countries_capital[i], countries_population[i]);
        }

        spinCustomAdapter = new customAdapter(this, countries_p);
        spin.setAdapter(spinCustomAdapter);
        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tV_country.setText(countries_p[position].toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}