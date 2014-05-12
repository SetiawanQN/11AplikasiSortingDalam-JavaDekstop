/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangesort;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Exchangesort {
    private static int i;

    /**
     * @param args the command line arguments
     */
  public static void ExchangeSort(int[] num) 			
  {
    int temp;							
    for(int k=0;k<num.length-1;k++)				
       {								
        for(int j=k+1;j<num.length;j++)				 
           {								
            if(num[k]<num[j]){					
                temp = num[k];			 	  	
                num[k] = num[j];
                num[j] = temp;
            }
            }
        }
    System.out.println("Sorted Array: "+Arrays.toString(num));	
  }
  
     public static void main(String[] args) 				
{
    int[] array = {10,7,11,5,13,8};					

    ExchangeSort(array);						
    for(i=0; i<num.length-1; i++)					
    {								
    System.out.println("Sorted Array: c"+Arrays.toString(array)); 
    }
}

}
