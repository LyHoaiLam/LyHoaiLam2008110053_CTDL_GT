package com.lamlh2008110053.tuan05;

import java.util.ArrayList;

public class ArrayList22 
{
    public static void main(String[] args) 
    {
        ArrayList a = new ArrayList();
        a.add("Lam");
        a.add(7);
        a.add(3.3);
        a.add(true);
        
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));

        System.out.println(a);
        a.add(new SinhVien("Tuan Nguyen", 2257, 21, "Ha Tinh"));
        a.add(new SinhVien("Hoai Lam", 2257, 21, "Kien Giang"));
        
        SinhVien sinhVien = (SinhVien)a.get(4);
        sinhVien.nhapSinhVien();
        System.out.println(a.get(4));
        System.out.println(a);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Ten SV: " + sinhVien.nameSinhVien + " / " + "Ma ID SV: " + sinhVien.maSoSinhVien
         + " / " + "Tuoi SV: " + sinhVien.tuoiSinhVien + " / " + "Que SV: " + sinhVien.queQuanSinhVien);
        System.out.println(a.get(4));
        System.out.println("-----------------------------------------------------------------------------------------");
        sinhVien.inThongTinSV();
    
        
       
    }    


}
