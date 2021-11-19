package com.lamlh2008110053.tuan07;

import java.util.List;


import com.lamlh2008110053.tuan04.SanPham;

public class DanhSchXeHoiTestDrive 
{
    public static void main(String[] args) 
    {
        DanhSachXeHoi danhSachXeHoi = new DanhSachXeHoi();

        danhSachXeHoi.inDanhSachXeHoi();

        DanhSachXeHoi xehoi1 = new DanhSachXeHoi(/* 1 */);
        DanhSachXeHoi xehoi2 = new DanhSachXeHoi(/* 2 */);
        xehoi1 = xehoi2;/* Cho xehoi1 = xehoi2 (Bay Gio chuoi bit xe xehoi1 va xehoi2 la giong nhau nen xehoi1 va xehoi2 
        cung chieu den doi tuong trong vung nho healp cua xehoi2 , xehoi1 khong con chieu den doi tuong trong vung nho healp cua xehoi1 ban dau)*/
        
        if(xehoi1 == xehoi2)
        {
            System.out.println("Bang Nhau");
        }
        else
        {
            System.out.println("Khong Bang Nhau");
        }

        String n1 = "La";
        String n2 = "Lam";

        if(n1.equals(n2))
        {
            System.out.println("Bang Nhau ");
        }
        else
        {
            System.out.println("Khong Bang Nhau ");
        }

        if(danhSachXeHoi.equals(n2))
        {

        }
    }    
}
