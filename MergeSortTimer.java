import javax.swing.JOptionPane;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the merge
   sort algorithm.
*/
public class MergeSortTimer
{  
   public static void main(String[] args)
   {  
      String input = JOptionPane.showInputDialog(
         "Enter array size:");
      int n = Integer.parseInt(input);

      // construct random array
   
      int[] a = ArrayUtil.randomIntArray(n, 100);
      MergeSorter sorter = new MergeSorter(a);
      
      // use stopwatch to time merge sort

      StopWatch timer = new StopWatch();

      timer.start();
      sorter.sort();
      timer.stop();

      System.out.println("Elapsed time: " 
         + timer.getElapsedTime() + " milliseconds");
      System.exit(0);
   }
}

   
