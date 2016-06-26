package com.example.alarc.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

        //Call when User clicks button
        public void onClickFindBeer(View view){

            TextView brands = (TextView) findViewById(R.id.brands);

        //Call when user clicks on spinner

            Spinner color = (Spinner) findViewById(R.id.color);

        //Call for beertype

        String beerType = String.valueOf(color.getSelectedItem());

         //Code to get recomendations from the beer expert class

        List<String>brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
            for(String brand : brandList){
                brandsFormatted.append(brand).append("\n");
            }

        //Display the item
        brands.setText(brandsFormatted);
    }

}
