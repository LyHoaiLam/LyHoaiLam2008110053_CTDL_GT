package com.lamlh2008110053.tuan07;

public class DanhSachXeHoi 
{
    String nameXe;
    double giaXe;

    DanhSachXeHoi()
    {

    }

    void inDanhSachXeHoi()
    {
        System.out.println(nameXe);
        System.out.println(giaXe);
    }

    boolean equals (DanhSachXeHoi other)
    {
        boolean match = true;
        if(nameXe.equals(other.nameXe))
        {
            match = true;
        }
        else
        {
            match = false;
        }
        return match;
    }
    
}
