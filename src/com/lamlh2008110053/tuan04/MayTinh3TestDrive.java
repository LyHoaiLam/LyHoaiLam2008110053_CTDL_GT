package com.lamlh2008110053.tuan04;

import java.util.Scanner;

public class MayTinh3TestDrive 
{
    public static void main(String[] args)
    {
        Scanner nhapmt = new Scanner(System.in);
        MayTinh3[] mayTinh3sList = new MayTinh3[2]; 
        
        for(int x = 0; x < mayTinh3sList.length; x++)
        {
            System.out.println("Nha May San Xuat: "+ (x+1));
            String name = nhapmt.nextLine();

            System.out.println("Nam San Xuat: "+  (x+1));
            int namsx = nhapmt.nextInt();
            nhapmt.nextLine();

            System.out.println("He Dieu Hanh: "+  (x+1));
            String hdh = nhapmt.nextLine();

            System.out.println("RAM Cua May Tinh: "+  (x+1));
            double ram = nhapmt.nextDouble();

            System.out.println("Ten CPU Cua May: "+ (x+1));
            String tencpu = nhapmt.nextLine();
            nhapmt.nextLine();

            System.out.println("Gia Tien: "+  (x+1));
            double giathanh = nhapmt.nextDouble();

            System.out.println("Nam Bao Hanh: "+  (x+1));
            int nbh = nhapmt.nextInt();
            nhapmt.nextLine();

            mayTinh3sList[x] = new MayTinh3(name, namsx, hdh, ram, tencpu, giathanh, nbh);

        }

        for(int y = 0; y < mayTinh3sList.length; y++)
        {
            mayTinh3sList[y].inThongTinMayTinh();
            System.out.println("--------------------------");
        }


    }
    

}
