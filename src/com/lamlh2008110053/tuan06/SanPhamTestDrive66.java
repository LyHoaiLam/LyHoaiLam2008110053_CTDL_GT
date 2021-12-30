package com.lamlh2008110053.tuan06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SanPhamTestDrive66 
{
    public static Scanner nhapSP66 = new Scanner(System.in);    
    static List dsSanPham66 = new ArrayList<>();
    public static void main(String[] args) 
    {
       
        int chonChucNang;
        dsCoSanSanPham66(dsSanPham66);
        do
        {
            System.out.println("MENU");
            System.out.println("[1] Nhap Vao Danh Sach SanPham66          /");
            System.out.println("[2] Tim SanPham66 Theo Ten Va In Ra       /");
            System.out.println("[3] Tim Va Thay Doi SanPham66 Theo Ten    /");
            System.out.println("[4] Tim Va Xoa SanPham66 Theo Ten         /");
            System.out.println("[5] In Ra Danh Sach SanPham66 Moi Nhat    /");
            System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia /");
            System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia /");
            System.out.println("[8] In Ra Danh Sach Ngau Nhien            /");
            System.out.println("[9] Out Ra Chuong Trinh                   /");
            System.out.println("Nhap Chuc Nang Su Dung:                   /");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            chonChucNang = nhapSP66.nextInt();
            nhapSP66.nextLine();
            System.out.println("Chuc Nang Da Chon: " + "[" + chonChucNang + "]");
            
            switch(chonChucNang)
            {
                
                case 1:
                {
                    // Nhap Them San Pham Vao Danh Sach
                    nhapSanPham66(dsSanPham66);
                   
                    
                    
                    System.out.println("-------------------------------------------------------");
                }break;

                case 2:
                {
                    // Tim Sam Pham Theo Ten Roi In Ra
                    System.out.println("Nhap Ten SanPham66 Can Tim: ");
                    String ten;
                    ten = nhapSP66.nextLine();
                    SanPham66 sanPham66 = timSanPham66TheoTen(ten, dsSanPham66);
                    if(sanPham66 != null)
                    {
                        sanPham66.inThongTinSP();
                    }
                    else
                    {
                        System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
                    }
                }break;

                case 3:
                {

                }break;

                case 4:
                {
                    // Tim Va Xoa San Pham Theo Ten
                    System.out.println("Nhap Tne SanPham66 Can Xoa: ");
                    String nn;
                    nn = nhapSP66.nextLine();
                    xoaSanPham66(nn, dsSanPham66);        
                    System.out.println("Da Xoa Thanh Cong!!!!!!!!!!!!!!!!!!!!!!");            
                }break;

                case 5:
                {
                    // In Ra Danh Sach Moi Nhat
                    indsSanPham66(dsSanPham66);
                    System.out.println("-------------------------------------------------------");
                }break;

                case 6:
                {
                    // Sap Xep Tang Dan Roi In Ra Danh Sach Tang Dan
                    sapXepSanPham66TheoDonGiaGiamDan(dsSanPham66);
                    indsSanPham66(dsSanPham66);
                    System.out.println("-------------------------------------------------------");
                }break;

                case 7:
                {
                    // Sap Xep Giam Dan Roi In Ra Danh Sach Giam Dan
                    sapXepSanPham66TheoDonGiaGiamDan(dsSanPham66);
                    Collections.reverse(dsSanPham66);
                    indsSanPham66(dsSanPham66);
                    System.out.println("-------------------------------------------------------");
                }break;

                case 8:
                {
                    // In Ra Danh Scah Ngau Nhien
                    //Collections.shuffle(dsSanPham66);
                    xuatNgauNhiend(dsSanPham66);
                    indsSanPham66(dsSanPham66);
                }
            }
        }while(chonChucNang >= 1 && chonChucNang <= 8);


    }


    public static void dsCoSanSanPham66(List<SanPham66> dsSanPham66)
    {
        dsSanPham66.add(new SanPham66("Ca Rot", 15000, 2));
        dsSanPham66.add(new SanPham66("Ca Chua", 19000, 6));
        dsSanPham66.add(new SanPham66("Ca Phe Sua", 18000, 4));

    }


    public static void nhapSanPham66(List<SanPham66> dsSanPham66)
    {
        String name;
        double giaThanh;
        int soLuong;
        
        for(int i = 0; i <3; i++)
        {
            System.out.println("NHAP TEN: ");
            name = nhapSP66.nextLine();
            System.out.println("NHAP GIA: ");
            giaThanh = nhapSP66.nextDouble();
            System.out.println("NHAP SO LUONG: ");
            soLuong = nhapSP66.nextInt();
            nhapSP66.nextLine();
            
            dsSanPham66.add(new SanPham66(name, giaThanh, soLuong));
        }
      


    }

    public static SanPham66 timSanPham66TheoTen(String tenSanPham66, List<SanPham66> dsSanPham66)
    {
        SanPham66 result = null;
        for(SanPham66 sanPham66 : dsSanPham66)
        {
            if(sanPham66.nameSP66.equals(tenSanPham66))
            {
                result = sanPham66;
            }
        }
        return result;
    }
    

    public static void indsSanPham66(List<SanPham66> dsSanPham66)
    {
        for (SanPham66 sanPham66 : dsSanPham66) 
        {
            sanPham66.inThongTinSP();    
        }
    }

    
    public static void sapXepSanPham66TheoDonGiaGiamDan(List<SanPham66> dsSanPham66)
    {
        Comparator<SanPham66> comp;
        comp = new Comparator<SanPham66>() {

            @Override
            public int compare(SanPham66 o1, SanPham66 o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaSP66, o2.giaSP66);
            }
            // import java.util.Comparator;
            // import java.util.Collections;
            
        };

        Collections.sort(dsSanPham66, comp);

    }


    public static void xoaSanPham66(String nameSP66 ,List<SanPham66> dSanPham66)
    {
        SanPham66 sanPham66 = timSanPham66TheoTen(nameSP66, dSanPham66);
        dSanPham66.remove(sanPham66);

    }

    public static void xuatNgauNhiend(List<SanPham66> dsSanPham66)
    {
        Collections.shuffle(dsSanPham66);
    }

    

    

    

    

}
