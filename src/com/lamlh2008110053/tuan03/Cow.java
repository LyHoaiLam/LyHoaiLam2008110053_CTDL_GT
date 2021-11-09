package com.lamlh2008110053.tuan03;

public class Cow 
    {
        float weight;
        String breed;
        String color;
        
        Cow()
        {

        }

        Cow( float w)
        {
            weight = w;
        }

        Cow(float w, String br, String cl)
        {
            weight = w;
            breed = br;
            color = cl;
        }

        void inthongtin1()
        {
            System.out.println("Weight La: "+ weight);
        }

        void inthongtin2()
        {
            System.out.println("Weight La: "+ weight);
            System.out.println("Breed La: "+ breed);
            System.out.println("Color La: "+ color);
        }
    }
