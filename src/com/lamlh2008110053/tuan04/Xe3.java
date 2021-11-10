package com.lamlh2008110053.tuan04;

public class Xe3
{
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    double dungTich;

    Xe3()
    {

    }

    Xe3(String tcx, String hsx, String dx, String gp, double dt)
    {
        tenChuXe = tcx;
        hangSanXuat = hsx;
        dongXe = dx;
        giayPhep = gp;
        dungTich = dt;

    }
    
    void inthongtinXe()
    {
        System.out.println("Ho Va Ten Chu Xe: "+ tenChuXe);
        System.out.println("Hang San Xuat: "+ hangSanXuat);
        System.out.println("Dong Xe: "+ dongXe);
        System.out.println("Giay Phep: "+ giayPhep);
        System.out.println("Dung Tich: "+ dungTich);    
}

}
