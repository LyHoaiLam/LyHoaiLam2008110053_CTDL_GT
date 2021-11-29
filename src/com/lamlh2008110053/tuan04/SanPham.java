package com.lamlh2008110053.tuan04;

public class SanPham 
{
    String tenSP;
    double donGia;
    double giamGia;
    double thueVAT;

    SanPham()
    {

    }

    SanPham(String n, double d)
    {
        tenSP = n;
        donGia = d;
       
    }
    void inThongTinSP()
    {
        System.out.println("Ten San Pham: "+ tenSP);
        System.out.println("Gia Thanh San Pham: "+ donGia);
       
    }

}
