package com.lamlh2008110053.tuan04;

public class Sach3 
{
    
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;

    Sach3()
    {

    }

    Sach3(String nxb, int nsb, double gb, int sl, String l)
    {
         
    nhaXuatBan = nxb;
    namXuatBan = nsb;
    giaBan = gb;
    soLuong = sl;
    loai = l;
    }

    void inthongtinsach()
    {
        
        System.out.println("Nha Xuat Ban: "+ nhaXuatBan);
        System.out.println("Nam Xuat Ban: "+ namXuatBan);
        System.out.println("Gia Ban: "+ giaBan);
        System.out.println("So Luong: "+ soLuong);
        System.out.println("Loai Sach: "+ loai);
    }


}
