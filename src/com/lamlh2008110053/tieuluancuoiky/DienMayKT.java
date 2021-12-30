package com.lamlh2008110053.tieuluancuoiky;

public class DienMayKT 
{
    String ten_DienMayKT;
    int maID_DienMayKT = 444888;
    double giaTien_DienMayKT;
    int soLuongTonKho_DienMayKT;


    public DienMayKT()
    {

    }

    public DienMayKT(String n, double g, int sl)
    {
        ten_DienMayKT = n;
        giaTien_DienMayKT = g;
        soLuongTonKho_DienMayKT = sl;
    }


    void inThongTinDienMayKT()
    {
        System.out.println("Ten DienMay: " + ten_DienMayKT + ", " + "Ma ID DienMay: " + maID_DienMayKT + ", "
         + "Gia Tien DienMay: " + giaTien_DienMayKT + ", " + "So Luong Ton Kho SanhSu: " + soLuongTonKho_DienMayKT);
    }       
}
