package com.lamlh2008110053.tuan03;

public class TaiKhoan2TestDrive
{
    public static void main(String[] args) 
    {
        TaiKhoan2 taiKhoan2;
        
        taiKhoan2 = new TaiKhoan2("Ly Hoai Lam", 2008110053, 264466.3);

        System.out.println("Ten Chu Tia Khoan: "+ taiKhoan2.name);
        System.out.println("So Tai Khoan: "+taiKhoan2.soTK);
        System.out.println("So Du: "+ taiKhoan2.soDu);
    }    
}
