package com.lamlh2008110053.tuan07;

public class Node 
{
    // Noi Dung
    int data;// du lieu so Nguyen

    // Lien ket den nut tiep theo
    // Tham Chieu
    Node next;// Bien Tham Chieu Kieu Node

    public Node()
    {

    }

    public Node(int d)
    {
        data = d;
    }

    public Node(int d, Node n)
    {
        data = d;
        next = n;
    }
    
}
