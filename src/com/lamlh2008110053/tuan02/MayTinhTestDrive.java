package com.lamlh2008110053.tuan02;

public class MayTinhTestDrive 
{
    public static void main(String[] args) 
    {
        MayTinh maytinh = new MayTinh();
        maytinh.nhasanXuat = "ACER";
        maytinh.namSanxuat = 2015;
        maytinh.heDH = "WINDOWS";
        maytinh.ram = 8;
        maytinh.cpu = "AMD Ryzen 51515";
        maytinh.giaTienmayTinh = 4661161;
        maytinh.namBaoHanh = 2;

        maytinh.inThongTinMayTinh();
    }    
}
