package com.lamlh2008110053.tuan01;

import java.util.Scanner;

public class Lab01_Bai_03 
{
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhap Vao Gia Tri Cua Canh: ");
        float canh = nhap.nextFloat();

        float theTich;
        theTich = canh * canh * canh;

        System.out.println("The Tich Khoi Lpa Phuong La: " + theTich);

    }    
}
