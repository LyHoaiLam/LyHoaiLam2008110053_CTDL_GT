package com.lamlh2008110053.tuan01;
import java.util.Scanner;
public class Lab02_Bai_02 
{
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        double nhapa, nhapb, nhapc;

        System.out.println("Nhap Vao So A: ");
        nhapa = nhap.nextDouble();
        System.out.println("Nhap Vao So B: ");
        nhapb = nhap.nextDouble();
        System.out.println("Nhap Vao So C: ");
        nhapc = nhap.nextDouble();
        
        if(nhapa ==0)
            if(nhapb ==0)
                if(nhapc ==0)
                    System.out.println("Vo So Nghiem");
                else
                    System.out.println("Phuong Trinh Vo Nghiem");
            else
            {
                double x = -nhapc / nhapb;
                System.out.println("X = "+ x);
            }
        else   
            {
                double delta, x1, x2;
                delta = nhapb * nhapb - 4 * nhapa * nhapc;
                if(delta ==0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.printf("x1 = x2 = %f \n", - nhapb / 2 *nhapa);
                }
                if(delta <0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.println("Phuong Trinh Vo Nghiem");
                }
                if(delta >0)
                {
                    x1 = -nhapb + Math.sqrt(delta) / 2 * nhapa;
                    x2 = -nhapb - Math.sqrt(delta) / 2 * nhapa;
                    System.out.println("Delta = "+ delta);
                    System.out.println("x1 = "+ x1);
                    System.out.println("x2 = "+ x2);
                }
                    
            }  
                
    }

}
