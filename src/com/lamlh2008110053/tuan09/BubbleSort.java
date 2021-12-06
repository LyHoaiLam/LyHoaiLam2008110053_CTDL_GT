package com.lamlh2008110053.tuan09;

import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] mang7SoNguyen = {5, 12, 6, 1, 6, 3, 9}; 
        double mang7SoThuc[] = {2.3, 5.6, 2.2, 1.9, 8.6, 3.9, 99.23};
        int mang5SoNguyen2[] = new int[]{5,6,7,8,9};   
        System.out.println("Phan Tu Thu 1 Cua mang7SoNguyen: "+ mang7SoNguyen[1]);
        System.out.println("Phan Tu Thu 3 Cua mang7SoNguyen: "+ mang7SoNguyen[3]);
        System.out.println("Phan Tu Thu 1 Cua mang5SoNguyen: "+mang5SoNguyen2[1]);
        System.out.println("Phan Tu Thu 4 Cua mang7SoNguyen: "+ mang5SoNguyen2[4]);
        System.out.println("Mang7SoNguyen Sau Khi Xap Sep:");
        BubbleSort(mang7SoNguyen);
        BubbleSort(mang5SoNguyen2);
        System.out.println(Arrays.toString(mang7SoNguyen));
        System.out.println(Arrays.toString(mang5SoNguyen2));
       
       
        
    }

    static void BubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n - i); j++ )
            {
                if(arr[j - 1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
      
    }
}
    
    

