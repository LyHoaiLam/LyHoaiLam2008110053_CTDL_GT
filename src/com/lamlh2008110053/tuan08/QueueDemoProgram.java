package com.lamlh2008110053.tuan08;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemoProgram 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue;
        queue = new LinkedList<>();
        queue.add(8);
        queue.add(23);
        queue.add(12);
        System.out.println("Phan Tu Ban Dau: "+ queue);
        int phanTuLayRa = queue.remove();
        System.out.println("Phan Tu Lay Ra: "+ phanTuLayRa);
        System.out.println("Phan Tu Con Lai: "+ queue);
        int phanTuTham = queue.peek();//Tham Phan Tu
        System.out.println("Phan Tu Duoc Tham: "+ phanTuTham);
        System.out.println("Phan Tu Con Lai Sau Tham: "+ queue);


        //System.out.println(queue);
        //System.out.println(queue.peek());
            
    }    
}
