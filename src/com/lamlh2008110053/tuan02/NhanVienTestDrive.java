package com.lamlh2008110053.tuan02;

public class NhanVienTestDrive 
{
    public static void main(String[] args) 
    {
       
        NhanVien nhanvien = new NhanVien();

        
        nhanvien.tenNv = "Ly Hoai Lam";       
        nhanvien.luongNV = 52.333;     
        nhanvien.diaChiNV = "Phu Quoc - Kien Giang";       
        nhanvien.boPhanLamViec = "Ky Thuat Phan Mem";
        nhanvien.ngaySinh = "03/09/2001";
        
        nhanvien.inthongtinnhanvien();     
    }    
}
