package com.lamlh2008110053.tuan07;

import java.util.Scanner;

public class MyLinkedList
{
    Node head = null;
    Node tail = null;

    public MyLinkedList()
    {

    }
    

    void addd(int data)
    {
        //Tao 1 Node moi
        Node newNode = new Node(data);
        if(head == null)// Them 1 Nut Vao Danh Sach Rong
        {
            head = newNode;
            tail = newNode;
        }
        else//Danh Sach Khong Rong // Them Vao Duoi Danh Sach
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void removehead()
    {
        Node tam = head;

        if(head == null)
        {
            return;
        }

        head = tam.next;
    }

    void removetail()
    {
        Node tam2 = head;

        if(head == null)
        {
            return;
        }

        while(tam2 != null)
        {
            if(tam2.next == tail)
            {
                tail = tam2;
                tail.next = null;
                return;
            }
            tam2 = tam2.next;
        }

    }

    void removeXoaTuyY(int nhapn)
    {
        Node tam3 = head;
        Node tam4 = null;

        if(tam3 != null && head.data == nhapn)
        {
            removehead();
            return;
        }

        if(tam3 != null && tam3.data == nhapn)
        {
            removetail();
            return;
        }

        while(tam3 != null)
        {
            tam4 = tam3;
            tam3 = tam3.next;

            if(tam3.data == nhapn)
            {
                tam4.next = tam3.next;
                return;
            }
        }

        

    }

    void printtt()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Danh Sach Rong");
            return;
        }

        System.out.println("Cac Nut Trong Danh Sach La");
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find()
    {

    }


    

}
