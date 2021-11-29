package com.lamlh2008110053.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class AppleTestDrive 
{
    public static void main(String[] args) 
    {
        
        List<Apple> khoApple = new ArrayList<>();
      
        int nhapCN;
      
        do
        {
        System.out.println("--------- MEUNU ---------");
        System.out.println("1. In Ra Danh Scah Tao Hien Co Trong Kho ");
        System.out.println("2/ Them Tao Vao Danh Sach ");
        System.out.println("3. Tim Tao Theo Mau Sac");
        System.out.println("4. In Ra Danh Sach Tao");
        System.out.println("-----------------------------------------");
        Scanner nhapCNN = new Scanner(System.in);
        nhapCN = nhapCNN.nextInt();
        switch(nhapCN)
        {
            case 1: 
            {
                danhSachAppleCoSan(khoApple);
                inThongTinApple2(khoApple);
                break;
            }

            case 2:
            {
                nhapApple2(khoApple);
                break;
            }

            case 3:
            {
         
                break;
            }

            case 4: 
            {
                inThongTinApple2(khoApple);
                break;
            }

        }

        }while( nhapCN >= 1 && nhapCN <=5);
    }

    static void danhSachAppleCoSan(List<Apple> khoApple)
    {
        khoApple.add(new Apple(123, 3.2, "Do"));
        khoApple.add(new Apple(456, 3.1, "Cam"));
        khoApple.add(new Apple(789, 3.0, "Xanh"));
    }
   

    static void nhapApple2(List<Apple> khoApple)
    {
        Scanner nhapVao = new Scanner(System.in);
        int maAp;
        double klAp;
        String mauAp;

            for(int i = 0; i < 3; i++)
            {
                System.out.println("Nhap Vao Ma Apple Thu:  "+ (i+1));
                maAp = nhapVao.nextInt();
                System.out.println("Nhap Vao Khoi Luong Apple Thu:  "+ (i+1));
                klAp = nhapVao.nextDouble();
                nhapVao.nextLine();
                System.out.println("Nhap Vao Mau Sac Apple Thu:  "+ (i+1));
                mauAp = nhapVao.nextLine();
                    
                khoApple.add(new Apple(maAp, klAp, mauAp));
            }
    }

    static void inThongTinApple2(List<Apple> khoApple)
    {
        for( Apple apple : khoApple)
        {
            apple.inThongTinApple();
        }
    }


    static void timTheoMauSacApple(String mauSacApple, List<Apple> khoApple)
    {
        Apple result = null;
        for(Apple appleS : khoApple)
        {
            if(appleS.mauSacApple.equals(mauSacApple))
            result = appleS;
        }
    }


   
}
