package com.lamlh2008110053.tuan05;

import java.util.ArrayList;

public class ArrayList_CoDinhKieu 
{
    public static void main(String[] args) 
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Hoai Lam");    
        a.add("Hoai Phuong");    
        a.add("Hoai Linh");    
        a.add("Hoai Tam");    

        System.out.println("Phan Tu Thu 2: "+ a.get(2));
        System.out.println("Phan Tu Thu 0: "+ a.get(0));
        System.out.println("Phan tu Thu 1: "+ a.get(1));
        System.out.println("Mang Ban Dau: "+ a);
        System.out.println("-------------------------------");

        a.remove(1);
        System.out.println("Mang Sau Khi Xoa Phan Tu Thu 1: "+a);
        System.out.println("-------------------------------");

        a.set(2, "Huynh Nhu");
        System.out.println("Mang Sau Khi Thay The Phan Tu Thu 2: "+a);
        System.out.println("-------------------------------");

        ArrayList<String> b = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        System.out.println("Mang b Ban Dau: "+ b);
       
        System.out.println("-------------------------------");
        b.add(2, "KaKa");
        System.out.println("Mang b Sau Khi Them Kaka Vao Vi Tri Thu 2: "+ b);

    }    

}
