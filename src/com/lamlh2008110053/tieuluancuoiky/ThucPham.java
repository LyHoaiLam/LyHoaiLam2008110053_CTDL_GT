package com.lamlh2008110053.tieuluancuoiky;

public class ThucPham 
{
    String tenThucPham;
    int maIDThucPham;
    double giaTienThucPham;
    int soLuongTonKhoThucPham;
    

    ThucPham(String ten, int id, double gia, int sl)
    {
        tenThucPham = ten;
        maIDThucPham = id;
        giaTienThucPham = gia;
        soLuongTonKhoThucPham = sl;
    }



    void inThongTinThucPham()
    {
        System.out.println("Ten ThucPham: " + tenThucPham + ", " + "Ma ID ThucPham: " + ", " + "Gia Tien ThucPham: "
        + ", " + "So Luong Ton Kho Thuc Pham: " + soLuongTonKhoThucPham);
    }
}
