package com.lamlh2008110053.tuan05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive 
{
    public static void main(String[] args) 
    {
        List quanLySinhVien = new ArrayList();  
      
        int nhapChucNangSinhVien;
        Scanner nhapCNSinhVien = new Scanner(System.in);
        do
        {
            System.out.println("------------------MENU--------------------");
            System.out.println("1. Danh Sach Sinh Vien Co San");
            System.out.println("2. Nhap Them Sinh Vien");
            System.out.println("3. Xoa Sinh Vien ");
            System.out.println("4. Sua Thong Tin Sinh Vien");
            System.out.println("5. In Ra Danh Sach Sinh Vien Moi Nhat");
            System.out.println("----------------------------------------------------------------------------");
            nhapChucNangSinhVien = nhapCNSinhVien.nextInt();

            switch(nhapChucNangSinhVien)
            {
                case 1:
                {
                    danhSachSinhVienCoSan(quanLySinhVien);
                    inThongTinSinhVien(quanLySinhVien);
                    System.out.println("----------------------------------------------------------------------------");
                }break;

                case 2:
                {
                    nhapThemSinhVien(quanLySinhVien);
                    inThongTinSinhVien(quanLySinhVien);

                }break;

                case 4:
                {
                    suaThongTinSinhVien(quanLySinhVien);
                }break;

                case 5:
                {
                    inThongTinSinhVien(quanLySinhVien);
                }break;
            }

            System.out.println("----------------------------------------------------------------------------");
        }while(nhapChucNangSinhVien >= 1 && nhapChucNangSinhVien <= 5);

    }


    static void danhSachSinhVienCoSan(List<SinhVien> quanLySinhVien)
    {   
        quanLySinhVien.add(new SinhVien("Hoai Lam", 03, 12, "Kien Giang")); 
        quanLySinhVien.add(new SinhVien("Hoai Linh", 223, 22, "Vinh Long"));   
    }


    static void inThongTinSinhVien(List<SinhVien> quanLySinhVien)
    {
        for (SinhVien sinhVien : quanLySinhVien) 
        {
            System.out.println("Ten: " + sinhVien.nameSinhVien + "/" + "Ma: " + sinhVien.maSoSinhVien + "/" +
             "Tuoi: " + sinhVien.tuoiSinhVien + "/" + "Que quan: " + sinhVien.queQuanSinhVien);    
        }
    }


    static void nhapThemSinhVien(List<SinhVien> quanLySinhVien)
    {
        Scanner nhapThemSV = new Scanner(System.in);
        String name;
        int id;
        int tuoi;
        String que;
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Nhap TEN Sinh Vien: ");
            name = nhapThemSV.nextLine();
            System.out.println("Nhap MSSV Sinh Vien: ");
            id = nhapThemSV.nextInt();
            System.out.println("Nhap TUOI Sinh Vien: ");
            tuoi = nhapThemSV.nextInt();
            System.out.println("Nhap QUE QUAN Sinh Vien: ");
            nhapThemSV.nextLine();
            que = nhapThemSV.nextLine();
            quanLySinhVien.add(new SinhVien(name, id, tuoi, que));
        }       
    }


    static void suaThongTinSinhVien(List<SinhVien> quanLySinhVien)
    {
        Scanner nhapsua = new Scanner(System.in);
        int viTriCanSua;
        System.out.println("Nhap Vi Tri Can Sua: ");
        viTriCanSua = nhapsua.nextInt();      
        quanLySinhVien.set(viTriCanSua, new SinhVien("Ho Chi Minh City", 9922, 1975, "Mien Nam"));
    }

    
    

    


}
