import java.util.Random;

/**
   This class contains utility methods for array
   manipulation.
*/
public class ArrayUtil
{
   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n-1
   */
   public static String[] randomIntArray(int length, int n)
   {  String[] a = new String[length];
      Random generator = new Random();

      for (int i = 0; i < a.length; i++)
         a[i] = generator.nextInt(n) + "";

      return a;
   }

   /**
      Prints all elements in an array.
      @param a the array to print
   */
   public static void print(String[] a)
   {
      for (int i = 0; i < a.length; i++)
         System.out.print(a[i] + " ");
      System.out.println();
   }
}
