/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

public class Quicksort{
  public static void main (String args[])
  {
    int nums[]= {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
    for (int index = 0; index < 10; index++)
    {
        System.out.print("  " +nums[index]);
    System.out.println();
    }

    quickSort(nums,0,9);
    for (int index = 0; index < 10; index++)
      System.out.print("  " +nums[index]);
    System.out.println();
  }


  private static void swap(int a[], int lft, int rt)
  {
    int temp;
    temp = a[lft];
    a[lft] = a[rt];
    a[rt] = temp;
  }


  public static int pivot(int firstpl, int lastpl)
  {
    if(firstpl >= lastpl)
      return -1;
    else
      return firstpl;
  }



  private static void quickSort(int a[], int first, int last)
  {
    int left,right;  
    int pivindex = pivot(first,last);
    if(pivindex >= 0)
    {
      left = pivindex +1;
      right = last;
      do
      {
        while ( a[left] < a[pivindex] && left <= right )
          left++;
        while (a[right] > a[pivindex])
          right--;
        if (right > left)
          swap(a,left,right);
      }
      while(left < right);

       swap (a, pivindex, right);
       quickSort( a, first, right-1);
       quickSort(a, right+1, last);

    }
  }      
}
