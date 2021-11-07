package com.lamlh2008110053.tuan01;

import java.util.Scanner;

public class Lab01_Bai_02 
{
    public static void main(String[] args) 
    {
    Scanner nhap = new Scanner(System.in);

    float chuVi, dienTich;  
    
    System.out.println("Nhap Chieu Dai: ");
    float chieuDai = nhap.nextFloat();

    System.out.println("Nhap Chieu Rong: ");
    float chieuRong = nhap.nextFloat();

    chuVi = chieuDai + chieuRong * 2;
    dienTich = chieuDai * chieuRong;

    System.out.println("Chu Vi La: "+ chuVi);
    System.out.println("Dien Tich La: " + dienTich);

    System.out.println("Canh Nho Nhat La: " + Math.min(chieuDai, chieuRong));
    }


}
