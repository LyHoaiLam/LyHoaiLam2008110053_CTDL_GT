package com.lamlh2008110053.tuan04;

public class Student 
{
    String name;
    int tuoi;
    String que;
    
    Student()
    {

    }

    Student(String n, int t, String q)
    {
        name = n;
        tuoi = t;
        que = q;
    }

    void inthongtin()
    {
        System.out.println("Ten Sinh Vien: "+ name + "Tuoi Sinh Vien: "+ tuoi + "Que Sinh Vien: "+ que);
       
    }
    
}
