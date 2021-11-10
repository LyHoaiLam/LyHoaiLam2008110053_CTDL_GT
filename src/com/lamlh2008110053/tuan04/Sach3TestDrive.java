package com.lamlh2008110053.tuan04;

import java.util.Scanner;

public class Sach3TestDrive 
{
    public static void main(String[] args)
    {
        Sach3 sach3List[] = new Sach3[4];
        Scanner nhapsach = new Scanner(System.in);
        
        for(int i = 0; i < sach3List.length; i++)
        {
            System.out.println("Nhap Vao Nha Xuat Ban: "+ (i+1));
            String tensach = nhapsach.nextLine();

            System.out.println("Nhap Vao Nam Xuat Ban: "+ (i+1));
            int namsx = nhapsach.nextInt();

            System.out.println("Nhap Vao Gia Ban: "+ (i+1));
            double giabansach = nhapsach.nextDouble();

            System.out.println("Nhap Vao So Luong: "+ (i+1));
            int soluongsach = nhapsach.nextInt();

            System.out.println("Nhap Vao Loai Sach: "+ (i+1));
            String loaisach = nhapsach.nextLine();
            nhapsach.nextLine();
             sach3List[i] =new Sach3(tensach, namsx, giabansach, soluongsach, loaisach);
        }

        for(Sach3 sach33 : sach3List)
        {   
            System.out.println("--------------------------------");
            sach33.inthongtinsach();
        }
    }   
    
    
}
