package com.lamlh2008110053.tuan03;

public class NhanVien2
{
    String tenNv;
    double luongNV;
    String diaChiNV;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien2()
    {

    }

    NhanVien2(String tnv, double lnv, String dcnv, String bplv, String ns)
    {
     tenNv = tnv;
     luongNV = lnv;
     diaChiNV = dcnv;
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
