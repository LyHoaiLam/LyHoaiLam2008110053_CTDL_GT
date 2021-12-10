package com.lamlh2008110053.tuan10;

public class Apple2LinkedList 
{
    Apple2Node head = null;
    Apple2Node tail = null;    

    public Apple2LinkedList()
    {

    }


    boolean isEmpty()
    {
        boolean emtpy = true;
        if(head == null)
            {
                emtpy = true;
            }
        else
            {
                emtpy = false;
            }
        return emtpy;
        
    }


    public void addFirst(Apple2 apple2)
    {
        Apple2Node newAppleNode = new Apple2Node(apple2);
        if(isEmpty())// Neu Rong Thi Them Vao Dau Danh Sach
            {
                head = newAppleNode;
                tail = newAppleNode;
            }
        else
            {
                newAppleNode.next = head;
                head = newAppleNode;
            }
    }
    

    public void addLast(Apple2 apple2)
    {
        Apple2Node newAppleNode = new Apple2Node(apple2);
        if(isEmpty())
            {
                head = newAppleNode;
                tail = newAppleNode;
            }
        else
            {
                tail.next = newAppleNode;
                tail = newAppleNode;
            }

    }



}
