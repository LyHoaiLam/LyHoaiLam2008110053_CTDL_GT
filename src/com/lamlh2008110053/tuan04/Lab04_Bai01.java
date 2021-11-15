package com.lamlh2008110053.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_Bai01
{
    public static void main(String[] args) 
    {
             
        List<Double> nhapSoThuc = new ArrayList<>();

        nhapSoThucc(nhapSoThuc);
        inTTSoThuc(nhapSoThuc);

    }  


    static void nhapSoThucc(List<Double> nhapSoThuc)
    {

        Scanner nhapST = new Scanner(System.in);
        System.out.println("Nhap Vao Danh Sach Cac So Thuc: ");
        double soThuc;

        for(int i = 0; i < 5; i++)
        {   

            System.out.println("Nhap Vao So Thuc Thu: "+ (i+1));
            soThuc = nhapST.nextDouble();
            nhapSoThuc.add(soThuc);

        }   

    }

    static void inTTSoThuc(List<Double> nhapSoThuc)
    {

        System.out.println(nhapSoThuc);

    }


       
        



    } 

   

  
      
     


