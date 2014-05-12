/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author USER
 */
public class Insertionsort {							
 public static void tampilkanData(String nama[], int indeksTerakhir)	
 {
  for (int i = 0; i <= indeksTerakhir; i++)					
  { System.out.println((i+1) +"."+nama[i]);				
  }									
 }									
 public static void Insertionsort(String nama[], int indeksTerakhir)	
 {
     for (int i = 1; i < nama.length; i++)					
     {									
   	String temp = nama[i];						
  	 int j = i;							
  	 while (( j > 0) && (temp.compareTo(nama[j - 1]) < 0))		
  	 {								
   		 nama[j] = nama[j - 1];					
  	 	 j--;							
 	 }
 	  nama[j] = temp;						
      }
 }
}

