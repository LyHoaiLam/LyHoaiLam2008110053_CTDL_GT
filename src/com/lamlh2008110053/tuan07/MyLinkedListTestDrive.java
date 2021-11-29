package com.lamlh2008110053.tuan07;

import java.util.List;
import java.util.Scanner;

public class MyLinkedListTestDrive 
{
    public static void main(String[] args) 
    {
        MyLinkedList myLinkedList = new MyLinkedList();
            
        Scanner nhapp = new Scanner(System.in);
        int chucNang;

        do
        {
            System.out.println("==========================MeNu========================");
            System.out.println("1. Nhap Vao Cac So");
            System.out.println("2. Them Vao Dau Danh Sach");
            System.out.println("3. Them Cuoi Danh Sach");
            System.out.println("4. Them Vao Vi Tri Theo Y Ban");
            System.out.println("5. Xoa Dau Danh Sach");
            System.out.println("6. Xoa Cuoi Danh Sach");
            System.out.println("7. Xoa Vi Tri Theo Y Ban");
            System.out.println("8. In Ra Danh Sach");
            chucNang = nhapp.nextInt();
            System.out.println("Ban Da Chon Chuc Nang So: "+ chucNang);
            System.out.println("---------------------------------------------------------------------------");

            switch(chucNang)
            {
                case 1:// Nhap Vao Cac So
                {
                    int a;
                    for(int t = 0; t < 5; t++)
                    {
                        System.out.println("Nhap Vao: " + (t+1));
                        a = nhapp.nextInt();
                        myLinkedList.addd(a);
                    }
                    break;
                }

                case 2:
                {
                    // Them Dau DS
                    break;
                }

                case 3:
                {
                    // Them Cuoi DS
                    break;
                }

                case 4:
                {
                    // Them Theo Y Ca Nhan   
                    break;
                }

                case 5:
                {
                    myLinkedList.removehead();
                    break;
                }

                case 6:
                {
                    myLinkedList.removetail();
                    break;
                }

                case 7:
                {
                    // Xoa Theo Y Ca Nhan
                    int nhapn;
                    nhapn = nhapp.nextInt();
                    myLinkedList.removeXoaTuyY(nhapn);
                   
                    break;
                }

                case 8:
                {
                    myLinkedList.printtt();
                    break;
                }

            }
        }while( chucNang >= 1 && chucNang <=9);

    
    }

}


       
    
    

