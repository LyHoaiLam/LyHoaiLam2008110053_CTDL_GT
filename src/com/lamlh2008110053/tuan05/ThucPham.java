package com.lamlh2008110053.tuan05;

public class ThucPham 
{
    public String tenThucPham;// Them public
    public double giaTienThucPham;// Them public

    ThucPham()
    {

    }

    public ThucPham(String tThucPham, double gTienThucPham)// Them public
    {
        tenThucPham = tThucPham;
        giaTienThucPham = gTienThucPham;
    }
    
    public void inThongTinthucPham()
    {
        System.out.println("Ten Thuc Pham: "+ tenThucPham + "--" + " Gia Tien Thuc Pham: "+ giaTienThucPham);
      
    }
}
