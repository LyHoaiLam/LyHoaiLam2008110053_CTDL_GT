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
        
        nhapSP(dsSanPham);// Ham Nhap San Pham
        inSSSP(dsSanPham);// Ham In Thong Tin San Pham
        
        System.out.println("--------------------------------------Sau Khi Sap Xep");
        sapXepSP(dsSanPham);// Ham Sap Xep Gia Tien Cua San Pham Tang Dan
        inSSSP(dsSanPham);// In Danh Sach Ra Sau Khi Sap Xep Gia Tien Cac San Pham Tang Dan
        System.out.println("--------------------------------------Tim Theo Ten");
        SanPham sp = timTenSp("Ca Phe Den", dsSanPham);// Tim Ten San Pham "Ca Phe Den"
       
        if(sp != null)
        {
           
             sp.inThongTinSP();// Neu Ten San Pham Co Trong Danh Sach Thi In Thong Tin San Pham Do Ra       
        }
        else
        {
            System.out.println("Khong Co: ");// Ten San Pham Khong Co Trong Danh Sach Thi In Ra "Khong Co"
        }
        
        System.out.println("--------------------------------------Xoa San Pham");
        String tensp = "Ca Phe Sua";// Tim San Pham Co Ten Ca Phe Sua
        xoaSP(tensp, dsSanPham);// Xoa Ca Phe Sua Ra Khoi Danh Sach
        inSSSP(dsSanPham);// In Danh Sach Moi Ra Sau Khi Da Xoa Ca Phe Sua Ra Khoi Danh Sach

        System.out.println("--------------------------------------Dao Loan Vi Tri");
        Collections.shuffle(dsSanPham);// Dao Loan Vi Tri San Pham
        inSSSP(dsSanPham);// In Ra Danh Sach Sau Khi Da Doi Vi Tri San Pham Ngau Nhien 
     
    }

    static void nhapSP(List<SanPham> dsSanPham)
    {

        Scanner nhapSP = new Scanner(System.in);
        String nn;
        double dgg;
        double ggd;
        double tva;
        for(int i = 0; i < 3; i++)
        {

            System.out.println("Nhap Vao ten San Pham Thu "+ (i+1));
            nn = nhapSP.nextLine();
            System.out.println("Nhap Don Gia San Pham Thu "+ (i+1));
            dgg = nhapSP.nextDouble();
           
            nhapSP.nextLine();
            dsSanPham.add(new SanPham(nn, dgg));
         
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

    static SanPham timTenSp(String tenSP, List<SanPham> dsSanPham)
    {
        SanPham result = null;
        for(SanPham sanPhamss : dsSanPham)
        {

            if(sanPhamss.tenSP.equals(tenSP))
            {

                result = sanPhamss;

            }
        }
        return result;

    }

    static void xoaSP(String tenSP, List<SanPham> dsSanPham)
    {
        SanPham sanPhamss = timTenSp(tenSP, dsSanPham);
        dsSanPham.remove(sanPhamss);
    }

    
}
