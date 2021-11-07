package com.lamlh2008110053.tuan01;
import java.util.Scanner;
public class Lab02_Bai_01
{
    public static void main(String[] args) 
    {
        System.out.println("GIAI PT BAC NHAT");
        double nhapa, nhapb;
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhap Vao A: ");
        nhapa = nhap.nextDouble();
        System.out.println("Nhap Vao B: ");
        nhapb = nhap.nextDouble();

        if(nhapa ==0)
            if(nhapb ==0)
                System.out.println("Vo So Nghiem");
            else
                System.out.println("Vo Nghiem");
        else
        {
            double x = - nhapb / nhapa;
            System.out.println("x = "+ x);
        }               
    }   
}
