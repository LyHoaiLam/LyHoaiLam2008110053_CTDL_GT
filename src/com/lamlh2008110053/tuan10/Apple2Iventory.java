package com.lamlh2008110053.tuan10;

import java.util.ArrayList;

public class Apple2Iventory 
{

    
        ArrayList<Apple2> iventory = new ArrayList<>();

        public Apple2Iventory()
        {

        }


        public void them(Apple2 apple2)
        {
            iventory.add(apple2);
        }


        public void inApple2list()
        {
            for(Apple2 apple2: iventory)
            {
                apple2.printfApple2();
            }
        }


        public ArrayList<Apple2> findAppleByColor(String color)
        {
            ArrayList<Apple2> results = new ArrayList<>();
            for(Apple2 apple2 : results)
            {
                if(apple2.color.equalsIgnoreCase(color))//equalsIgnoreCase De khong Phan Biet Chu Hoa vs Chu Thuong
                {   
                    results.add(apple2);
                }
            }
            return results;
        }

        
    
}
