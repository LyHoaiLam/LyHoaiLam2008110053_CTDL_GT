package com.lamlh2008110053.tuan09;

import java.util.Arrays;

public class SapXepChen 
{
    public static void main(String[] args) 
    {
        int mang7SoNguyen[] = {1,8,4,5,3,66,67};  
        sort(mang7SoNguyen);  
        System.out.println(Arrays.toString(mang7SoNguyen));
    } 
    
    static void sort(int arr[])
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;
        }
    }
}
