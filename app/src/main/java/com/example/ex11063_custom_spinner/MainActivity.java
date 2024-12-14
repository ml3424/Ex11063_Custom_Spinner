package com.example.ex11063_custom_spinner;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tV_country;
    Spinner spin;

    String[] countries = {"Austria" ,"French" ,"Israel" ,"USA","Canada", "Germany", "Italy"};
    int[] countries_flags_img = {
            R.drawable.Flag_of_Austria,
            R.drawable.Flag_of_French,
            R.drawable.Flag_of_Israel,
            R.drawable.Flag_of_USA,
            R.drawable.Flag_of_Canada,
            R.drawable.Flag_of_Germany,
            R.drawable.Flag_of_Italy
    };
    String[] countries_capital = {"Vienna", "Paris", "Jerusalem", "Washington, D.C.", "Ottawa", "Berlin", "Rome"};
    String[] countries_population = {"8.9 million", "68 million", "9.7 million", "331 million", "39 million", "84 million", "60 million"};
    Country[] countries_p = new Country[7];

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
    }
}