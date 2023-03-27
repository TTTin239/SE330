

import java.util.Arrays;
/**
 * Fruits demo
 */
public class FruitsApp {
    public static void main(String[] args) {
      // given an array of fruits
      String[] fruits = {
          "yellow passion fruit", "grape", "bluberry", 
          "longan", "blackberry", "kiwi",
          "orange", "cherry", "coconut"};
      
       //... = ...(fruits));  // TO DO: sort fruits
       String temp;
      for (int i = 0; i < fruits.length; i++)
        {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].compareTo(fruits[j])>0)
                {
                    temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
      System.out.print("Các chuỗi sau khi sắp xếp là:");
        for (int i = 0; i <= fruits.length - 1; i++)
        {
            System.out.print(fruits[i] + ", ");
        }
      // Print SortedSet tree
      /* TO DO: add your code here to print out sorted fruits*/

      // Method 1: 
      
      // Method 2: 
      
      // Method ...
      
     
   }
}
