package com.lamlh2008110053.tuan04;

import java.util.Scanner;

public class StudentTestDrive 
{
    public static void main(String[] args) 
    {
        Student[] studentsList = new Student[7];
        Scanner nhap = new Scanner(System.in);
        
        for(int i = 0; i < studentsList.length; i++)
        {
            System.out.println("Nhap Sinh Vien Thu: "+ (i+1));

            System.out.println("Nhap Ten Sinh Vien: ");
            String name = nhap.nextLine();

            System.out.println("Nhap Va Tuoi SInh Vien: ");
            int tuoi = nhap.nextInt();
            nhap.nextLine();

            System.out.println("Nhap Vao Que Sinh Vien: ");
            String que = nhap.nextLine();

            studentsList[i] = new Student(name, tuoi, que);
            
        }
        System.out.println("Xuat Ra -------------------------------------------------------");

         /*for(int x =0; x <studentsList.length; x++)
         { 
             studentsList[x].inthongtin();
             
             System.out.println("-----------------------------------");
         }*/

         for( Student student : studentsList)
         {
             student.inthongtin();
         }
        
    }

}
