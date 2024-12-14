package com.example.ex11063_custom_spinner;

public class Country {
    String name;
    int flag_img;
    String capital_city;
    String population;

    public Country(String name, int flag_img, String capital_city, String population) {
        this.name = name;
        this.flag_img = flag_img;
        this.capital_city = capital_city;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country" +
                "name: " + name + '\n' +
                "capital_city: " + capital_city + '\n' +
                "population: " + population;
    }
}
