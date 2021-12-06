package com.lamlh2008110053.tuan09;

public class SapXep 
{
    public static void main(String[] args) 
    {
        int mang7SoNguyen[] = {7,8,2,4,6,9,12};
        selectionSort(mang7SoNguyen);
        

    } 
    
    static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length -1; i++)
        {
            int index = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        System.out.println("Xap Xep tang dan");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }


    }
}
