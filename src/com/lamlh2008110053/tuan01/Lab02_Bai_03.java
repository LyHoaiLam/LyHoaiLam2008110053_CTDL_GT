package com.lamlh2008110053.tuan01;
import java.util.Scanner;
public class Lab02_Bai_03 
{
    public static void main(String[] args) 
    {
        Scanner nhapSoDienSD = new Scanner(System.in);
        System.out.println("Nhap Vao So Dien Su Dung: ");
        double nhapVao = nhapSoDienSD.nextDouble();
        if(nhapVao < 50 )
            System.out.println("So Tien La: "+ nhapVao * 1000);
        if(nhapVao >= 50 )
            System.out.println("So Tien La: "+ nhapVao * 1200);     
    }    
}
