package com.lamlh2008110053.tuan05;

import java.util.Scanner;

public class SinhVien 
{

    String nameSinhVien;
    int maSoSinhVien;
    int tuoiSinhVien;
    String queQuanSinhVien;

    SinhVien()
    {

    }

    SinhVien(String n, int m, int t, String q)
    {
        nameSinhVien = n;
        maSoSinhVien = m;
        tuoiSinhVien = t;
        queQuanSinhVien = q;
    }

    public void nhapSinhVien()
    {
        Scanner nhap = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {   
            String n;
            int id;
            int tuoii;
            String que;
            System.out.println("Nhap TEN SV: ");
            n = nhap.nextLine();
            System.out.println("Nhap MA ID SV: ");
            id = nhap.nextInt();
            System.out.println("Nhap TUOI SV: ");
            tuoii = nhap.nextInt();
            System.out.println("Nhap QUE SV: ");
            que = nhap.nextLine();


        }
    }

    public SinhVien(String name, int id, double old, String address) {
    }

    void inThongTinSV()
    {
        System.out.println("Ho Ten SV: "+ nameSinhVien);
        System.out.println("Ma IDSV: "+ maSoSinhVien);
        System.out.println("Tuoi SV: "+ tuoiSinhVien);
        System.out.println("Que Quan SV: "+ queQuanSinhVien);
    }


}
