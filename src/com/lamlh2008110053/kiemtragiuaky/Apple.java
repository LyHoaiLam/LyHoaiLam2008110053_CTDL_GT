package com.lamlh2008110053.kiemtragiuaky;

import java.util.Scanner;

public class Apple 
{
    int maApple;
    double khoiLuongApple;
    String mauSacApple;
    
    Apple()
    {

    }

    Apple(int m, double kl, String ms )
    {
        maApple = m;
        khoiLuongApple = kl;
        mauSacApple = ms;
    }

    void inThongTinApple()
    {
        System.out.println("Ma Apple: " + maApple + "--*"+  "Mau Apple: " + mauSacApple + "--*" +  "Khoi Luong Apple: " + khoiLuongApple );
      
    }

  
}
