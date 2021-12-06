package com.lamlh2008110053.tuan09;

public class TimKiemTrongMang 
{
   public static boolean search(int arr[], int x)
   {
       int n = arr.length;
       for(int i = 0; i < n; i++)
       {
           if(arr[i] == x)
                return i;

       }
       return -1;
   }
    
}
