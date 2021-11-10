package com.lamlh2008110053.tuan03;

import java.util.Scanner;

public class Lab03_Bai01 
{
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        int n;
        boolean ok = true;
        System.out.println("Nhap Vao So: ");
        n = nhap.nextInt();

        for(int i = 2; i < n - 1; i++)
        {
            if(n % i == 0)
            {
                ok = false;
            }break;
        }

        if( ok == true)
        {
            System.out.println("n La So Nguyen To: "+ n);
        }
        else
        {
            System.out.println("n Khong La So Nguyen To: "+ n);
        }

    }    
}
