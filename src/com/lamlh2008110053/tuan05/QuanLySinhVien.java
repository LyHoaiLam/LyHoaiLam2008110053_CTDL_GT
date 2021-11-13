package com.lamlh2008110053.tuan05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien 
{
    public static void main(String[] args)
    {
        Scanner nhapsv = new Scanner(System.in);
        List dsSinhVien = new ArrayList();
        
        dsSinhVien.add(new Student007("Hoai Lam", 6.3));
        dsSinhVien.add(new Student007("Hoai Phuong", 3.3));

        System.out.println("Danh Sach Cac Sinh Vien Hien Co: ");
       
        Student007 dssv = (Student007)dsSinhVien.get(1);     
        System.out.println("Name Student: "+ dssv.name + " " + "Diem So: "+ dssv.diemSo );
      
        System.out.println(" ");
        
        dssv = (Student007)dsSinhVien.get(0);
        System.out.println("Name Student: "+ dssv.name + " " + "Diem So: "+ dssv.diemSo );

        System.out.println("Nhap Vao Danh Sach Cac Sinh Vien Moi: ");
        String nn;
        double dd;

        for(int x = 0; x < 3; x++)
        {
                System.out.println("Nhap Ten Sinh Vien Thu: "+ (x+1));
                nn = nhapsv.nextLine();
                System.out.println("Nhap Diem So Sinh Vien Thu: "+ (x+1));
                dd = nhapsv.nextDouble();
                nhapsv.nextLine();

                dsSinhVien.add(new Student007(nn, dd));             

        }

      for(int t = 0; t < 5; t++ )
      {     
        dssv = (Student007)dsSinhVien.get(t);
        System.out.println("Name Student: "+ dssv.name + " " + "Diem So: "+ dssv.diemSo );

      }
     

       
        



   
    } 
    
   
}


