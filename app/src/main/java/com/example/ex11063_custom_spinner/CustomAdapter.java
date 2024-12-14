package com.example.ex11063_custom_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private Country[] countries;

    public CustomAdapter (Context context, Country[] countries) {
    }
        this.context = context;
        this.countries = countries;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spin_layout, parent, false); ImageView img = (ImageView) view.findViewById(R.id.iv);
        TextView str = (TextView) view.findViewById(R.id.tV);
        str.setText();
        img.setImageResource(countries[i]);
        return view;
    }
}
