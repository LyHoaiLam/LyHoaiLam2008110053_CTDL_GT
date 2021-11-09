package com.lamlh2008110053.tuan03;

public class Xe2 
{
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    double dungTich;
    
    Xe2()
    {

    }

    Xe2(String tcx, String hsx, String dx, String gplx, double dt)
    {
        tenChuXe = tcx;
        hangSanXuat = hsx;
        dongXe = dx;
        giayPhep = gplx;
        dungTich = dt;
    }

    void inthongtin()
    {
        System.out.println("Ten Chu Xe: "+ tenChuXe);
        System.out.println("Hnag San Xuat Xe: "+ hangSanXuat);
        System.out.println("Dong Xe: "+ dongXe);
        System.out.println("Giay Phep Lai Xe: "+ giayPhep);
        System.out.println("Dung Tich Xe: "+ dungTich);
    }
}
