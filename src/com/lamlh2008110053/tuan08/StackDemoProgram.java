package com.lamlh2008110053.tuan08;



import java.util.Stack;

import com.lamlh2008110053.tuan04.Student;

public class StackDemoProgram 
{
    public static void main(String[] args) 
    {
        Stack<String> stack;
        stack = new Stack<>();
        stack.push("Ly Hoai Lam");
        stack.push("Welcom");
        System.out.println(stack);
        //System.out.println(stack.pop());

        String poped = stack.pop();// Mat noi dung troc stack
        
        System.out.println("Phan Tu Lay Ra Tu Dinh Cua stack: "+poped);
        System.out.println("Phan Tu Con Lai Cua stack Sau Khi Lay Dinh Ra: "+ stack);
        stack.push("Yasuo");
        stack.push("Du Lieu");
        System.out.println("stack Sau Khi Them 2 Phan Tu Moi: "+ stack);

        String phanTuDuocTham = stack.peek();// Khong mat noi dung trong stack
        System.out.println("Phan Tu Tham: "+ phanTuDuocTham);
        System.out.println("Phan Tu Co Trong stack "+stack);// Chi Tham Khong Mat Phan Tu Dinh Trong stack





        Stack<Student> stack2;    
    }
   


   
   
}
