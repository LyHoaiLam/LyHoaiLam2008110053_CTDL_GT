package com.lamlh2008110053.tuan04;

public class NhanVien3 
{
    String tenNv;
    double luongNV;
    String diaChiNV;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien3()
    {

    }

    NhanVien3(String n, double l, String dc, String bplv, String ns)
    {
         tenNv = n;
         luongNV = l;
         diaChiNV = dc;
         boPhanLamViec = bplv;
         ngaySinh = ns;
    }
    
    void inthongtinnhanvien()
    {
        System.out.println("Ho Va Ten Nhan Vien: "+ tenNv);
        System.out.println("Luong Cua Nhan Vien: "+ luongNV);
        System.out.println("Dia Chi Nhan Vien: "+ diaChiNV);
        System.out.println("Bo Phan Lam Viec: "+ boPhanLamViec);
        System.out.println("Ngay Sinh: "+ ngaySinh);
    }        
}
