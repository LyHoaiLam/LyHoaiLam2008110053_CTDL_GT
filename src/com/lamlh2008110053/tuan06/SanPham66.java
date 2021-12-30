package com.lamlh2008110053.tuan06;

import java.util.Scanner;

public class SanPham66 
{
        String nameSP66;
        double giaSP66;
        int soLuongSP66;

        Scanner nhapSP = new Scanner(System.in);

        public SanPham66()
        {

        }


        public SanPham66(String n, double g, int s)
        {
            nameSP66 = n;
            giaSP66 = g;
            soLuongSP66 = s;
        }


        public void inThongTinSP()
        {
           
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Ten SP: " + nameSP66 + "//" + "Gia Thanh SP: " + giaSP66 + "So Luong SP: " + soLuongSP66);
                
        }

}
