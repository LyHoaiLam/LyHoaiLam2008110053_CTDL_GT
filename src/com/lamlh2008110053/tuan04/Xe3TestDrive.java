package com.lamlh2008110053.tuan04;

import java.util.Scanner;

public class Xe3TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner nhapXe = new Scanner(System.in);
        Xe3 xe3List[] = new Xe3[3];
        for(int i = 0; i < xe3List.length; i++)
        {
        System.out.println("Nhap Ho Va Ten Chu Xe: "+ (i+1));
        String name = nhapXe.nextLine();

        System.out.println("Nhap Hang San Xuat: "+ (i+1));
        String hangsanxuat = nhapXe.nextLine();

        System.out.println("Nhap Dong Xe: "+ (i+1));
        String dongxe = nhapXe.nextLine();

        System.out.println("Nhap Giay Phep: "+ (i+1));
        String giayphep = nhapXe.nextLine();

        System.out.println("Nhap Dung Tich: "+ (i+1)); 
        double dungtich = nhapXe.nextDouble();
        nhapXe.nextLine();
        
        xe3List[i] = new Xe3(name, hangsanxuat, dongxe, giayphep, dungtich);
        }    

        for( Xe3 xe33 : xe3List)
        {
            xe33.inthongtinXe();
        }

    } 

}
