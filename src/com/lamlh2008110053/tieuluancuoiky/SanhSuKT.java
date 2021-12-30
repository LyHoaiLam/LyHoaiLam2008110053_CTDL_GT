package com.lamlh2008110053.tieuluancuoiky;

public class SanhSuKT 
{
    String ten_SanhSuKT;
    int maID_SanhSuKT = 222444;
    double giaTien_SanhSuKT;
    int soLuongTonKho_SanhSuKT;


    public SanhSuKT()
    {

    }

    public SanhSuKT(String n, double g, int sl)
    {
        ten_SanhSuKT = n;
        giaTien_SanhSuKT = g;
        soLuongTonKho_SanhSuKT = sl;
    }


    void inThongTinSanhSuKT()
    {
        System.out.println("Ten SanhSu: " + ten_SanhSuKT + ", " + "Ma ID SanhSu: " + maID_SanhSuKT + ", "
         + "Gia Tien SanhSu: " + giaTien_SanhSuKT + ", " + "So Luong Ton Kho SanhSu: " + soLuongTonKho_SanhSuKT);
    }   
}
