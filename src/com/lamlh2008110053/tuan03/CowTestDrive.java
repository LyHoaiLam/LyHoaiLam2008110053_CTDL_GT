package com.lamlh2008110053.tuan03;

public class CowTestDrive 
{
    public static void main(String[] args) 
    {
        Cow cow;

        cow = new Cow(15.2f); 
        cow.inthongtin1();
        
        cow = new Cow(99, " Viet Nam ", " Den Trang ");
        cow.inthongtin1();
        cow.inthongtin2();

    }  
}
