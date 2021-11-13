package com.lamlh2008110053.tuan05;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lamlh2008110053.tuan03.Cow;
import com.lamlh2008110053.tuan03.CowTestDrive;

public class CTMinhHoaArraysList 
{
    public static void main(String[] args) 
    {
            ArrayList a = new ArrayList();
            a.add("Cuong");
            a.add(true);
            a.add(1);
            a.add(2.9);
            a.add(new Student007("Hoai Lam", 5));
            a.add(new Student007("Hoai Linh", 9));
            

            Scanner nhapVao = new Scanner(System.in);

            System.out.println("Xuat ra mang a ban dau: "+ a);

            System.out.println("Nhap Vao Mot Phan Tu Moi: ");
            int b;
            b = nhapVao.nextInt();
            a.add(b);

            int c[] = new int[3];
            for(int x = 0; x < 3; x++)
            {
                    System.out.println("Nhap Vao So: "+ (x+1));
                    c[x] = nhapVao.nextInt();
                    a.add(c[x]);
            }

            System.out.println("Xuat ra a sau khi them 3 phan tu: "+ a);
            System.out.println(a.get(3));//In Ra Gia Tri Cua Phan Tu Thu 3
            System.out.println(a.get(0));//In Ra Gia Tri Cua Phan Tu Thu 0
            System.out.println(a.get(1));//In Ra Gia Tri Cua Phan Tu Thu 1
            System.out.println(a.get(8));//In Ra Gia Tri Cua Phan Tu Thu 8
            System.out.println(a.get(9));//In Ra Gia Tri Cua Phan Tu Thu 9
            
            Student007 st = (Student007)a.get(4);
            System.out.println((Student007)a.get(4));
            System.out.println("Student name: "+ st.name );
            System.out.println("Student Tuoi: "+ st.tuoi );

            st = (Student007)a.get(5);
            System.out.println((Student007)a.get(5));
            System.out.println("Student name: "+ st.name );
            System.out.println("Student Tuoi: "+ st.tuoi );


            

            List bienTCArayyList = new ArrayList();
            bienTCArayyList.add(new Student007("Viet Nam", 07));
            System.out.println("Xuat Ra Gia Tri Phan Tu Cua bienTCArrayList: "+ bienTCArayyList);

            Student007 sts = (Student007)bienTCArayyList.get(0);
            System.out.println("Xuat Ra Gia Tri Phan Tu Cua bienTCArrayList: "+ sts.name + " " + sts.tuoi);

            ArrayList<Student007> sStudent = new ArrayList<>();
            //Student007 student2 = new Student007();//nhu cai ben duoi
            //sStudent.add(student2);
            sStudent.add(new Student007());

            List<String> list0 = new ArrayList<>();// List Kieu String
            list0.add("Hoai lam");//Chi Luu Duoc Kieu String
            //list0.add(1); Khong Luu Duoc Kieu Khac Tru Kieu String


    }  

}
