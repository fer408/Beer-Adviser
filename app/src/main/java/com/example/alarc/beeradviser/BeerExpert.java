package com.example.alarc.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alarc on 5/19/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Jack The Piper Amber");
            brands.add("Hobo Magic");

        }
        if(color.equals("light")){
            brands.add("Red Dragon Tequila");
            brands.add("Big Dipper Vodka");
            brands.add("Severe Hangover Gin");
            brands.add("Horny Gringo Vodka");
            brands.add("Silly Penguin");
            brands.add("Screaming Eagle Tequila");
            brands.add("Loud Neighbors Vodka");
        }
        if(color.equals("brown")){
            brands.add("Pissed Offed Redneck");
            brands.add("Cousin Fucker Deluxe");
            brands.add("Dumb Hillbilly");
            brands.add("Classy Gentlemen Whiskey");
        }
        if(color.equals("pale")) {
            brands.add("Jail Pale Ale");
            brands.add("Old Pale Ale");
            brands.add("Loose Waitress Pale Ale");
            brands.add("Blue Balls");
            brands.add("Lazy Stoner");
        }
        return brands;
    }
}
