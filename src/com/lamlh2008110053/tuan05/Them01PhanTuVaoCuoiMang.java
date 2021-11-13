package com.lamlh2008110053.tuan05;

public class Them01PhanTuVaoCuoiMang 
{
    public static void main(String[] args) 
    {
        int[] arr = {3, 5, 9, 7};
        
        int n = arr.length;
        System.out.println("Arr: "+ arr.length);
        

        int newlement = 8;// Phan Tu Can Them Vao

        int newArr[] = new int[n+1];// Tao Mang Moi

        System.out.println("Arr: "+ arr.length);
        System.out.println("newArr: "+ newArr.length);

        for(int i = 0; i < n; i++)// Do Du Lieu Mang Cu Vao Mang Moi
        {
            newArr[i] = arr[i];
        }

        System.out.println("Arr: "+ arr.length);
        System.out.println("newArr: "+ newArr.length);

        System.out.println("In Ra Mang Cu: ");
        for(int x : arr)
        {
            System.out.println("Mang Arr: "+ x);
        }

        System.out.println("Arr: "+ arr.length);
        System.out.println("newArr: "+ newArr.length);

        newArr[n] = newlement;
        System.out.println("Arr: "+ arr.length);
        System.out.println("newArr: "+ newArr.length);

        System.out.println("In Ra Mang Moi: ");
        for(int x : newArr)
        {
            System.out.println("Mang newArr: "+ x);
        }

        System.out.println("Arr: "+ arr.length);
        System.out.println("newArr: "+ newArr.length);
    
    }    
}
