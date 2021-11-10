package com.lamlh2008110053.tuan03;

import java.util.Scanner;

public class Lab03_Bai04 
{
    public static void main(String[] args) 
    {
        Scanner nhapvao = new Scanner(System.in);

        String[] hoVaTen = new String[5];
        double diem[] = new double[5];

        
        for(int i = 1; i < hoVaTen.length; i++)
        {
            System.out.println("Nhap Vao Ten Sinh Vien Thu: "+" "+ i);
            hoVaTen[i] = nhapvao.nextLine();

            System.out.println("Nhap Vao Diem Sinh Vien Thu: "+" "+ i);
            diem[i] = nhapvao.nextDouble();
            nhapvao.nextLine();
        }

        for(int x = 1; x < hoVaTen.length; x++)
        {
           
            System.out.println("Ho Va Ten Cua Sinh Vien Thu "+ x + " La: "+ hoVaTen[x]);
            System.out.println("Diem Cua Sinh Vien Thu "+ x + " La: "+ diem[x]);
            System.out.println("---------------------------------------");
            

        }
        

    }    
}

