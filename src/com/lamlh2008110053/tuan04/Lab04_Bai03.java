package com.lamlh2008110053.tuan04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab04_Bai03 
{
    public static void main(String[] args) 
    {
        List<SanPham> dsSanPham = new ArrayList<>();
        
        nhapSP(dsSanPham);
        inSSSP(dsSanPham);
        System.out.println("--------------------------------------");
        sapXepSP(dsSanPham);
        inSSSP(dsSanPham);   
     
    }

    static void nhapSP(List<SanPham> dsSanPham)
    {

        Scanner nhapSP = new Scanner(System.in);
        String nn;
        double dgg;
        double ggd;
        double tva;
        for(int i = 0; i < 5; i++)
        {

            System.out.println("Nhap Vao ten San Pham Thu "+ (i+1));
            nn = nhapSP.nextLine();
            System.out.println("Nhap Don Gia San Pham Thu "+ (i+1));
            dgg = nhapSP.nextDouble();
            System.out.println("Nhap Giam Gia San Pham Thu "+ (i+1));
            ggd = nhapSP.nextDouble();
            System.out.println("Nhap Vao Thue VAT San Pham Thu "+ (i+1));
            tva = nhapSP.nextDouble();
            nhapSP.nextLine();
            dsSanPham.add(new SanPham(nn, dgg, ggd, tva));
         
        }
       
    }

    static void inSSSP(List<SanPham> dsSanPham)
    {

        for(SanPham sanPham : dsSanPham)
        {

            sanPham.inThongTinSP();

        }

    }

    static void sapXepSP(List<SanPham> dsSanPham)
    {

        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>() 
        {

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
                
            }           
               
        };

        Collections.sort(dsSanPham, comp);
        
    }

    
}
