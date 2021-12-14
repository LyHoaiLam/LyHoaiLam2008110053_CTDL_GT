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


    public Apple2Node findAppleById(int id)
    {
        Apple2Node apple2Node = null;
        if(isEmpty())
            {
                System.out.println("List is Empty");
            }
        else
            {
                Apple2Node current;
                current = head;
                while(current != null)
                    {
                        if(current.data.id == id)
                            {
                                apple2Node = current;
                            }
                        current = current.next;                           
                    }
            }
            return apple2Node;
    }
    

    public void addPreApple2Node(int id, Apple2 apple2)
    {
        Apple2Node node = null;
        Apple2Node preApple2Node;
        if(isEmpty())
            {
                System.out.println("List is empty");
            }
        else
            {
                Apple2Node current;
                current = head;
                if(head.data.id == id)
                {
                    addFirst(apple2);
                }
                while(current.next != null)
                {
                    preApple2Node = current;
                    if(current.data.id == id)
                    {
                        Apple2Node newApple2Node = new Apple2Node(apple2);
                        preApple2Node.next = newApple2Node;
                        newApple2Node.next = current;
                    }
                    current = current.next;
                }
            }      
    }


    void deteleLast()
    {
        if(isEmpty())
        {

        }

        Apple2Node temp;
        temp = head;
        while(temp != null)
        {
            if(temp.next == tail)
            {
                tail = temp;
                tail.next = null;
            }

            temp = temp.next;

        }

    }

    


}
