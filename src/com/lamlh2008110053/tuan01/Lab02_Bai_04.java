package com.lamlh2008110053.tuan01;
import java.util.Scanner;
public class Lab02_Bai_04
{
    public static void main(String[] args) 
    {
        System.out.println("--------- MEUNU ---------");
        System.out.println("1/ GIAI PHUONG TRINH BAC NHAT ");
        System.out.println("2/ GIAI PHUONG TRINH BAC HAI ");
        System.out.println("3/ TINH TIEN DIEN ");
        System.out.println("-----------------------------------------");
        Scanner nhapChucNang = new Scanner(System.in);
        System.out.println("Nhap Vao Chuc Nang Can Thuc Hien");
        int chucNang = nhapChucNang.nextInt();
        switch(chucNang)
        {
            case 1:
            {                   
                double nhapvaoa, nhapvaob;
                System.out.println("Nhap Vao a: ");
                nhapvaoa = nhapChucNang.nextDouble();
                System.out.println("Nhap Vao b: ");
                nhapvaob = nhapChucNang.nextDouble();
                giaiPT1(nhapvaoa, nhapvaob);
            }; break;

            case 2:
            {
                double soA, soB, soC;
                System.out.println("Nhap Vao a: ");
                soA = nhapChucNang.nextDouble();
                System.out.println("Nhap Vao b: ");
                soB = nhapChucNang.nextDouble();
                System.out.println("Nhap Vao c: ");
                soC = nhapChucNang.nextDouble();
                giaiPT2(soA, soB, soC);             
            }; break;

            case 3:
            {
                double nhapsuDungDien;
                System.out.println("Nhap Vao So Dien Ma Ban Da Su Dung: ");
                nhapsuDungDien = nhapChucNang.nextDouble();
                tinhTiendien(nhapsuDungDien);               
            }; break;

            default: System.out.println("Nhap Sai ");
        }

    }

    static void giaiPT1(double nhapVaoSoA, double nhapVaoSoB)
    {
        if(nhapVaoSoA ==0)
            if(nhapVaoSoB ==0)
                System.out.println("Vo So Nghiem");
            else
                System.out.println("Vo Nghiem");
        else
        {
            double xc = - nhapVaoSoB / nhapVaoSoA;
            System.out.println("x = "+ xc);
        }      
    } 

    static void giaiPT2(double nhapVaoSoa, double nhapVaoSob, double nhapVaoSoc)
    {
        if(nhapVaoSoa ==0)
            if(nhapVaoSob ==0)
                if(nhapVaoSoc ==0)
                    System.out.println("Vo So Nghiem");
                else
                    System.out.println("Phuong Trinh Vo Nghiem");
            else
            {
                double x = -nhapVaoSoc / nhapVaoSob;
                System.out.println("X = "+ x);
            }
        else   
            {
                double delta, x1, x2;
                delta = nhapVaoSob * nhapVaoSob - 4 * nhapVaoSoa * nhapVaoSoc;

                if(delta ==0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.printf("x1 = x2 = %f \n", - nhapVaoSob / 2 *nhapVaoSoa);
                }

                if(delta <0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.println("Phuong Trinh Vo Nghiem");
                }

                if(delta >0)
                {
                    x1 = -nhapVaoSob + Math.sqrt(delta) / 2 * nhapVaoSoa;
                    x2 = -nhapVaoSob - Math.sqrt(delta) / 2 * nhapVaoSoa;
                    System.out.println("Delta = "+ delta);
                    System.out.println("x1 = "+ x1);
                    System.out.println("x2 = "+ x2);
                }                   
            }

    }

    static void tinhTiendien(double nhapsodienSuDung)
    {
        if(nhapsodienSuDung < 50 )
            System.out.println("So Tien La: "+ nhapsodienSuDung * 1000);
        if(nhapsodienSuDung >= 50 )
            System.out.println("So Tien La: "+ nhapsodienSuDung * 1200);
    }

}

