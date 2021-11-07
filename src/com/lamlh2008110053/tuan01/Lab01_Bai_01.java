package com.lamlh2008110053.tuan01;

import java.util.Scanner;

public class Lab01_Bai_01 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap Vao Ten Cua Sinh Vien: ");
        String name = scanner.nextLine();

        System.out.println("Nhap Vao Diem Cua Sinh Vien: ");
        float diemSoSV = scanner.nextFloat();

        System.out.println("Ten Cua Sinh Vien: " + name + " " + "Diem Cua Sinh Vien: " + diemSoSV );
    }    
}
