package com.lamlh2008110053.tuan03;

public class Sach2 
{
    int gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    int loai;

    Sach2()
    {

    }

    Sach2(int g, String nxb, int nsx, double giia, int sl, int l)
    {
        gia = g;
        nhaXuatBan = nxb;
        namXuatBan = nsx;
        giaBan = giia;
        soLuong = sl;
        loai = l;
    }

    void intthongtin()
    {
        System.out.println("Gia :"+ gia);
        System.out.println("Nha Xuat Ban: "+ nhaXuatBan);
        System.out.println("Nam Xuat Ban: "+ namXuatBan);
        System.out.println("Gia Ban: "+ giaBan);
        System.out.println("So Luong: "+ soLuong);
        System.out.println("Loai Sach: "+ loai);



    }
}
