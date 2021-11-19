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

    SanPham(String n, double d/*, double g, double t*/)
    {
        tenSP = n;
        donGia = d;
        /*giamGia = g;
        thueVAT = t;*/
    }
    void inThongTinSP()
    {
        System.out.println("Ten San Pham: "+ tenSP);
        System.out.println("Gia Thanh San Pham: "+ donGia);
        /*System.out.println("Giam Gia San Pham: "+ giamGia);
        System.out.println("Thue VAT: "+ thueVAT);*/
    }

}
