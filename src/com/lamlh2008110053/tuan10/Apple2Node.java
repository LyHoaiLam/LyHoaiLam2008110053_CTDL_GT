package com.lamlh2008110053.tuan10;

public class Apple2Node 
{
    Apple2 data;
    Apple2Node next;

    public Apple2Node()
    {
        data = null;
        next = null;
    }


    public Apple2Node(Apple2 apple2)
    {
        data = apple2;
        next = next;
    }
    

    public Apple2Node(Apple2 apple2, Apple2Node node)
    {
        data = apple2;
        next = node;
    }
    
}
