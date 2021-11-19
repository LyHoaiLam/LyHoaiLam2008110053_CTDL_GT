package com.lamlh2008110053.tuan05;

public class ThucPham 
{
    String tenThucPham;
    double giaTienThucPham;

    ThucPham()
    {

    }

    ThucPham(String tThucPham, double gTienThucPham)
    {
        tenThucPham = tThucPham;
        giaTienThucPham = gTienThucPham;
    }
    
    void inThongTinthucPham()
    {
        System.out.println("Ten Thuc Pham: "+ tenThucPham + "--" + " Gia Tien Thuc Pham: "+ giaTienThucPham);
      
    }
}
