package com.lamlh2008110053.tuan04;

import java.util.Scanner;

public class NhanVien3TestDrive 
{
    public static void main(String[] args)
    {
        NhanVien3 nhanVien3List[] = new NhanVien3[2];
        
        Scanner nhapvn3 = new Scanner(System.in);

        for(int i = 0; i < nhanVien3List.length; i++)
        {

            System.out.println("Nhap Ho Va Ten Nhan Vien: "+ (i+1));
            String namenv3 = nhapvn3.nextLine();

            System.out.println("Nhap Luong Cua Nhan Vien: "+ (i+1));
            double luongnv3 = nhapvn3.nextDouble();
            nhapvn3.nextLine();

            System.out.println("Nhap Dia Chi Nhan Vien: "+ (i+1));
            String diachinv3 = nhapvn3.nextLine();

            System.out.println("Nhap Bo Phan Lam Viec: "+ (i+1));
            String bplvnv3 = nhapvn3.nextLine();

            System.out.println("Nhap Ngay Sinh: "+ (i+1));
            String ngaysinhnv3 = nhapvn3.nextLine();
            nhanVien3List[i] = new NhanVien3(namenv3, luongnv3, diachinv3, bplvnv3, ngaysinhnv3);

        }

        for(NhanVien3 nhanVien3 : nhanVien3List)
        {
            nhanVien3.inthongtinnhanvien();
            System.out.println("----------------------------------------------------------------");
        }

    }  

}
