package com.lamlh2008110053.tuan03;

public class MayTinh2TestDrive 
{
    public static void main(String[] args)
    {
        MayTinh2 mayTinh2;
        
        mayTinh2 = new MayTinh2("Acer", 2022, "Windows", 32, "intel core i3 5050", 2500000, 2);
        System.out.println("Nha San Xuat May Tinh: "+ mayTinh2.nhasanXuat);
        System.out.println("Nma San Xuat may Tinh: "+ mayTinh2.namSanxuat);
        System.out.println("He Dieu Hanh May Tinh: "+ mayTinh2.heDH);
        System.out.println("Ram May Tinh: "+ mayTinh2.ram);
        System.out.println("Ten CPU May Tinh: "+ mayTinh2.cpu);
        System.out.println("Gia Tien May Tinh: "+ mayTinh2.giaTienmayTinh);
        System.out.println("Nma Bao Hanh May Tinh: "+ mayTinh2.namBaoHanh);
    }    
}
