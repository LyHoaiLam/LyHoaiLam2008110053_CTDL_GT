package com.lamlh2008110053.tuan07;

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

    void remove()
    {
        // List<ThucPham> danhSachThucPham
    }

    void printtt()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("DS Rong");
            return;
        }

        System.out.println("Cac Nut Trong Danh Sach");
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
