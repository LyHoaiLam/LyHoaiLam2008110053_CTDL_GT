package com.lamlh2008110053.tuan05;

import java.util.ArrayList;
import java.util.List;

public class ThucPhamTestDrive 
{
    public static void main(String[] args) 
    {
        List<ThucPham> danhSachThucPham = new ArrayList<>();
        
        dsThucPham(danhSachThucPham);
        inThongTinThucPham(danhSachThucPham);
        System.out.println();

        danhSachThucPham.add(1,new ThucPham("My Tuong Den", 32000) );// Chen Vao Vi Tri Thu 1 Trong Mang
        inThongTinThucPham(danhSachThucPham);
        System.out.println();

        danhSachThucPham.remove(3);// Xoa Phan Tu Vi Tri Thu 3 Trong Mang
        inThongTinThucPham(danhSachThucPham);
        System.out.println("Tim Ten Hoai Phong");
      


    }
    
    static void dsThucPham(List<ThucPham> danhSachThucPham)
    {

        danhSachThucPham.add(new ThucPham("Mi Cay Han Quoc", 59000));
        danhSachThucPham.add(new ThucPham("Tra Sua", 27000));
        danhSachThucPham.add(new ThucPham("Lau Cay", 120000));
        danhSachThucPham.add(new ThucPham("7UP", 12000));

    }

    static void inThongTinThucPham(List<ThucPham> danhSachThucPham)
    {
        for( ThucPham thucPhams : danhSachThucPham)
        {

            thucPhams.inThongTinthucPham();

        }
    }
}
