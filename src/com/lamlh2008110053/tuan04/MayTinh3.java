package com.lamlh2008110053.tuan04;

public class MayTinh3 
{
    
    String nhasanXuat;
    int namSanxuat;
    String heDH;
    double ram;
    String cpu;
    double giaTienmayTinh;
    int namBaoHanh;  

    MayTinh3()
    {

    }

    MayTinh3(String nsx, int nsx2, String hdh, double r, String cup, double gt, int nbh)
    {   

         
    nhasanXuat = nsx;
    namSanxuat = nsx2;
    heDH = hdh;
    ram = r;
    cpu = cup;
    giaTienmayTinh = gt;
    namBaoHanh = nbh;  
    }
    
    void inThongTinMayTinh()
    {
        System.out.println("Nha May San Xuat: "+ nhasanXuat);
        System.out.println("Nam San Xuat: "+ namSanxuat);
        System.out.println("He Dieu Hanh: "+ heDH);
        System.out.println("RAM Cua May Tinh: "+ ram);
        System.out.println("Ten CPU Cua May: "+ cpu);
        System.out.println("Gia Tien: "+ giaTienmayTinh);
        System.out.println("Nam Bao Hanh: "+ namBaoHanh);
    }
}
