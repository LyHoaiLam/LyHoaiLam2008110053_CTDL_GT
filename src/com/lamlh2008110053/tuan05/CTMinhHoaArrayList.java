package com.lamlh2008110053.tuan05;

import java.util.ArrayList;
import java.util.List;

public class CTMinhHoaArrayList 
{
    public static void main(String[] args) 
    {
        // ArrayList Khong Co Dinh Kieu
        ArrayList a_ArrayList = new ArrayList();//ArrayList<>() Xoa <> Di Roi

        List b_List = new ArrayList();//ArrayList<>() Xoa <> Di Roi

        b_List.add("Hoai Lam");//Phan Tu 0
        b_List.add(2.9);//Phan Tu 1
        b_List.add(56);//Phan Tu 2
        b_List.add(true);//Phan Tu 3

        System.out.println(b_List);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println(b_List.toString());
        System.out.println("-------------------------------------------------------------------------------------");

        Integer x = (Integer)b_List.get(2);// Ham get(int index) Lay Ra Tung Phan Tu 2
        Boolean y = (Boolean)b_List.get(3);// Ham get(int index) Lay Ra Tung Phan Tu 3
        String f = (String)b_List.get(0);// Ham get(int index) Lay Ra Tung Phan Tu 0

        System.out.println(b_List.get(0));// Ham get(int index) Lay Ra Tung Phan Tu 0, In Ra Phan Tu 0  
        System.out.println(x);// In Ra Phan Tu Thu 2
        System.out.println(y);// In Ra Phan Tu Thu 3
        System.out.println(f);// In Ra Phan Tu Thu 0
        System.out.println("-------------------------------------------------------------------------------------");

        b_List.add(new ThucPham("Nem Chua", 52.0666));//Phan Tu 4

        System.out.println(b_List);
        System.out.println("-------------------------------------------------------------------------------------");
       
        ThucPham thucPham = (ThucPham)b_List.get(4);// Ep Kieu
        System.out.println("Ten ThucPham: "+ thucPham.tenThucPham + " --- "/*Them Chu public vao truoc String tenThucPham ben class ThucPham */ 
        +"Gia Tien ThucPham: "+ thucPham.giaTienThucPham/*Them Chu public vao truoc String giaTienThucPham ben class ThucPham */);
        System.out.println("-------------------------------------------------------------------------------------");
        
        // ArrayList Co Dinh Kieu La ThucPham
        ArrayList<ThucPham> arrayListThucPham = new ArrayList<ThucPham>();
        arrayListThucPham.add(new ThucPham("Ca Chua", 520000));
        arrayListThucPham.add(new ThucPham("Tao", 1200000));
        arrayListThucPham.add(new ThucPham("Ca Rot", 1600000));
        
        ThucPham thucPham222 = arrayListThucPham.get(0);
        System.out.println("Ten Thuc Pham: " + thucPham222.tenThucPham + "---" + "Gia Tien Thuc Pham: " + thucPham222.giaTienThucPham);
        thucPham222 = arrayListThucPham.get(1);
        System.out.println("Ten Thuc Pham: " + thucPham222.tenThucPham + "---" + "Gia Tien Thuc Pham: " + thucPham222.giaTienThucPham);
        thucPham222 = arrayListThucPham.get(2);
        System.out.println("Ten Thuc Pham: " + thucPham222.tenThucPham + "---" + "Gia Tien Thuc Pham: " + thucPham222.giaTienThucPham);
        System.out.println("-------------------------------------------------------------------------------------");
        for (ThucPham thucPham2 : arrayListThucPham) 
        {
            thucPham2.inThongTinthucPham();    
        }

        
    }   



}
