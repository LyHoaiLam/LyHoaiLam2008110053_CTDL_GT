package com.lamlh2008110053.tieuluancuoiky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
public class KhoSieuThi 
{
    static Scanner nhapKhoSieuThi = new Scanner(System.in);
    
    static List khoSieuThi = new ArrayList<>();
    static List khoSieuThi2 = new ArrayList<>();
    public static void main(String[] args) 
    {
        danhSachThucPhamKT(khoSieuThi);
        danhSachDienMayKT(khoSieuThi2);
        int chonChucNang;
        do
        {
            System.out.println("******************* MENU SIEU THI *******************");
            System.out.println("[1] QUAN LY CAC SAN PHAM VE THUC PHAM");
            System.out.println("[2] QUAN LY CAC SAN PHAM VE DIEN MAY");
            System.out.println("[3] QUAN LY CAC SAN PHAM VE SANH SU");
            System.out.println("[4] THOAT KHOI CHUONG TRINH ");
            System.out.println("Chon San Pham Can Thao Tac");
            chonChucNang = nhapKhoSieuThi.nextInt();
            System.out.println("Ban Da Chon Chuc Nang ["+chonChucNang+"]");
            switch(chonChucNang)
            {
                case 1:
                {
                    int xuLyThucPham;
                    do
                    {
                        System.out.println("**************** THUC PHAM ****************");
                        System.out.println("[1] Nhap Them Thong Tin Thuc Pham Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Thuc Pham Theo Ten Va In Ra Thong Tin Thuc Pham Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Thuc Pham Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Thuc Pham Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sach Thuc Pham Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Thuc Pham");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Thuc Pham");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Thuc Pham Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Thuc Pham");
                        System.out.println("Nhap Chuc Nang Su Dung:");
                        xuLyThucPham = nhapKhoSieuThi.nextInt();
                        System.out.println("Ban Da Chon Chuc Nang ["+xuLyThucPham+"]");
                        nhapKhoSieuThi.nextLine();

                        if(xuLyThucPham == 1)//1 Nhap Them Thong Tin Thuc Pham Vao Danh Sach
                        {
                            nhapThucPhamKT(khoSieuThi);
                        }

                        if(xuLyThucPham == 2)//2 Tim Kiem Thong Tin Thuc Pham Theo Ten Va In Ra Thong Tin Thuc Pham Da Tim
                        {
                            System.out.println("Nhap Ten SanPham66 Can Tim: ");
                            String ten;
                            ten = nhapKhoSieuThi.nextLine();
                            ThucPhamTK thucPhamTK = timThucPhamKTTheoTen(ten, khoSieuThi);
                            if(thucPhamTK != null)
                            {
                                thucPhamTK.inThongTinThucPhamKT();
                            }
                            else
                            {
                                System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            }
                        }

                        if(xuLyThucPham == 4)
                        {
                            System.out.println("Nhap Ten Thuc Pham Can Xoa: ");
                            String ten_ThucPhamTK;
                            ten_ThucPhamTK = nhapKhoSieuThi.nextLine();
                            xoaThucPhamKT(ten_ThucPhamTK, khoSieuThi);
                        }

                        if(xuLyThucPham == 5)//5 In Ra Thong Tin Danh Sach Thuc Pham Cap Nhat Moi Nhat
                        {
                            inThongTinThucPhamKT(khoSieuThi);
                            System.out.println(khoSieuThi);
                        }

                        if(xuLyThucPham == 6)//6  In Ra Danh Sach Tang Dan Theo Don Gia Cua Thuc Pham
                        {
                            sapXepThucPhamKTTheoDonGiaGiamDan(khoSieuThi);
                            inThongTinThucPhamKT(khoSieuThi);
                        }

                        if(xuLyThucPham == 7)//6  In Ra Danh Sach Giam Dan Theo Don Gia Cua Thuc Pham
                        {
                            sapXepThucPhamKTTheoDonGiaGiamDan(khoSieuThi);
                            Collections.reverse(khoSieuThi);
                            inThongTinThucPhamKT(khoSieuThi);
                        }
                        if(xuLyThucPham == 8)//8 In Ra Danh Sach Thong Tin Thuc Pham Ngau Nhien
                        {
                            xuatNgauNhienThongTinThucPhamKT(khoSieuThi);
                            inThongTinThucPhamKT(khoSieuThi);
                        }
                    }while(xuLyThucPham >= 1 && xuLyThucPham <=8);
                       
                }break;
                case 2:
                {
                    int xuLyDienMay;
                    do
                    {
                        System.out.println("**************** DIEN MAY ****************");
                        System.out.println("[1] Nhap Them Thong Tin Dien May Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Dien May Theo Ten Va In Ra Thong Tin Dien May Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Dien May Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Dien May Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sach Dien May Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Dien May");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Dien May");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Dien May Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Dien May");
                        System.out.println("Nhap Chuc Nang Su Dung:");
                        xuLyDienMay = nhapKhoSieuThi.nextInt();
                        System.out.println("Ban Da Chon Chuc Nang ["+xuLyDienMay+"]");
                        nhapKhoSieuThi.nextLine();

                        if(xuLyDienMay == 1)
                        {
                            nhapDienMayKT(khoSieuThi2);
                        }

                        if(xuLyDienMay == 2)
                        {
                            System.out.println("Nhap Ten DienMayKT Can Tim: ");
                            String ten;
                            ten = nhapKhoSieuThi.nextLine();
                            DienMayKT dienMayKT = timDienMayKTTheoTen(ten, khoSieuThi2);
                            if(dienMayKT != null)
                            {
                                dienMayKT.inThongTinDienMayKT();
                            }
                            else
                            {
                                System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            }
                        }
                        if(xuLyDienMay == 3)
                        {

                        }
                        if(xuLyDienMay == 4)
                        {
                            System.out.println("Nhap Ten Dien May Can Xoa: ");
                            String ten_DienMayTK;
                            ten_DienMayTK = nhapKhoSieuThi.nextLine();
                            xoaDienMayKT(ten_DienMayTK, khoSieuThi2);
                        }
                        if(xuLyDienMay == 5)
                        {
                            inThongTinDienMayKT(khoSieuThi2);
                            System.out.println(khoSieuThi2);
                        }
                        if(xuLyDienMay == 6)
                        {
                            sapXepDienMayKTTheoDonGiaGiamDan(khoSieuThi2);
                            inThongTinDienMayKT(khoSieuThi2);
                        }
                        if(xuLyDienMay == 7)
                        {
                            sapXepDienMayKTTheoDonGiaGiamDan(khoSieuThi2);
                            Collections.reverse(khoSieuThi2);
                            inThongTinDienMayKT(khoSieuThi2);
                        }
                        if(xuLyDienMay == 8)
                        {
                            xuatNgauNhienThongTinDienMayKT(khoSieuThi2);
                            inThongTinDienMayKT(khoSieuThi2);
                        }                       
                    }while(xuLyDienMay >= 1 && xuLyDienMay <= 8);    
                }break;
                case 3:
                {
                    int xuLySanhSu;
                    do
                    {
                        System.out.println("**************** SANH SU ****************");
                        System.out.println("[1] Nhap Them Thong Tin Sanh Su Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Sanh Su Theo Ten Va In Ra Thong Tin Sanh Su Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Sanh Su Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Sanh Su Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sanh Su May Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Sanh Su");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Sanh Su");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Sanh Su Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Sanh Su");
                        System.out.println("Nhap Chuc Nang Su Dung:");
                        xuLySanhSu = nhapKhoSieuThi.nextInt();
                    }while(xuLySanhSu >= 1 && xuLySanhSu <= 8);   
                }break;                
            }
        }while(chonChucNang >=1 && chonChucNang <=3);

    }






// THUC PHAM
    public static void danhSachThucPhamKT(List<ThucPhamTK> khoSieuThi)
    {
        khoSieuThi.add(new ThucPhamTK("Hanh Tay", 13000, 2));
        khoSieuThi.add(new ThucPhamTK("Hanh Tim", 11000, 6));
        khoSieuThi.add(new ThucPhamTK("Ca Chua", 9000, 12));
    }
    public static void nhapThucPhamKT(List<ThucPhamTK> khoSieuThi)
    {
        String name;
        double giaThanh;
        int soLuong;      
        for(int i = 0; i <3; i++)
        {
            System.out.println("NHAP TEN THUCPHAMKT: ");
            name = nhapKhoSieuThi.nextLine();
            System.out.println("NHAP GIA THANH THUCPHAMKT: ");
            giaThanh = nhapKhoSieuThi.nextDouble();
            System.out.println("NHAP SO LUONG THUCPHAMKT: ");
            soLuong = nhapKhoSieuThi.nextInt();
            nhapKhoSieuThi.nextLine();           
            khoSieuThi.add(new ThucPhamTK(name, giaThanh, soLuong));
        }      
    }
    public static ThucPhamTK timThucPhamKTTheoTen(String tenThucPhamKT, List<ThucPhamTK> khoSieuThi)
    {
        ThucPhamTK result = null;
        for(ThucPhamTK thucPhamTK : khoSieuThi)
        {
            if(thucPhamTK.ten_ThucPhamTK.equals(tenThucPhamKT))
            {
                result = thucPhamTK;
            }
        }
        return result;
    }
    public static void xoaThucPhamKT(String ten_ThucPhamTK ,List<ThucPhamTK> khoSieuThi)
    {
        ThucPhamTK thucPhamTK= timThucPhamKTTheoTen(ten_ThucPhamTK, khoSieuThi);
            khoSieuThi.remove(thucPhamTK);
            System.out.println("Da Xoa Thanh Cong");               
    }
    public static void inThongTinThucPhamKT(List<ThucPhamTK> khoSieuThi)
    {
        for (ThucPhamTK thucPhamTK : khoSieuThi) 
        {
            thucPhamTK.inThongTinThucPhamKT();  
            thucPhamTK.tongGiaTriHangHoaThucPhamKT();  
        }
    }
    public static void sapXepThucPhamKTTheoDonGiaGiamDan(List<ThucPhamTK> khoSieuThi)
    {
        Comparator<ThucPhamTK> comp;
        comp = new Comparator<ThucPhamTK>() {
            @Override
            public int compare(ThucPhamTK o1, ThucPhamTK o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaTien_ThucPhamKT, o2.giaTien_ThucPhamKT);
            }            
        };
        Collections.sort(khoSieuThi, comp);
    }
    public static void xuatNgauNhienThongTinThucPhamKT(List<ThucPhamTK> khoSieuThi)
    {
        Collections.shuffle(khoSieuThi);
    }






    
// DIEN MAY
    public static void danhSachDienMayKT(List<DienMayKT> khoSieuThi2)
    {
        khoSieuThi2.add(new DienMayKT("TIVI SONY", 92000, 7));
        khoSieuThi2.add(new DienMayKT("TU LANH TOSHIBA", 17000, 2));
        khoSieuThi2.add(new DienMayKT("NOI CHIEN KHONG DAU LG", 13500, 4));
    }
    public static void nhapDienMayKT(List<DienMayKT> khoSieuThi2)
    {
        String name;
        double giaThanh;
        int soLuong;      
        for(int i = 0; i <3; i++)
        {
            System.out.println("NHAP TEN DIENMAYKT: ");
            name = nhapKhoSieuThi.nextLine();
            System.out.println("NHAP GIA THANH DIENMAYKT: ");
            giaThanh = nhapKhoSieuThi.nextDouble();
            System.out.println("NHAP SO LUONG DIENMAYKT: ");
            soLuong = nhapKhoSieuThi.nextInt();
            nhapKhoSieuThi.nextLine();           
            khoSieuThi2.add(new DienMayKT(name, giaThanh, soLuong));
        }      
    }
    public static DienMayKT timDienMayKTTheoTen(String tenDienMayKT, List<DienMayKT> khoSieuThi2)
    {
        DienMayKT result = null;
        for(DienMayKT dienMayKT : khoSieuThi2)
        {
            if(dienMayKT.ten_DienMayKT.equals(tenDienMayKT))
            {
                result = dienMayKT;
            }
        }
        return result;
    }
    public static void xoaDienMayKT(String ten_DienMayTK ,List<DienMayKT> khoSieuThi2)
    {
        DienMayKT dienMayKT= timDienMayKTTheoTen( ten_DienMayTK, khoSieuThi2);
            khoSieuThi2.remove(dienMayKT);
            System.out.println("Da Xoa Thanh Cong");  
    }
    public static void inThongTinDienMayKT(List<DienMayKT> khoSieuThi2)
    {
        for (DienMayKT dienMayKT : khoSieuThi2) 
        {
            dienMayKT.inThongTinDienMayKT();
        }
    }
    public static void sapXepDienMayKTTheoDonGiaGiamDan(List<DienMayKT> khoSieuThi2)
    {
        Comparator<DienMayKT> comp;
        comp = new Comparator<DienMayKT>() {
            @Override
            public int compare(DienMayKT o1, DienMayKT o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaTien_DienMayKT, o2.giaTien_DienMayKT);
            }            
        };
        Collections.sort(khoSieuThi2, comp);
    }
    public static void xuatNgauNhienThongTinDienMayKT(List<DienMayKT> khoSieuThi2)
    {
        Collections.shuffle(khoSieuThi2);
    }

    
    
    



}
