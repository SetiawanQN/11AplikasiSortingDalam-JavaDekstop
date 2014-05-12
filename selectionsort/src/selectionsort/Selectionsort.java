/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author USER
 */
public final class Selectionsort {			
    int[] angka={35, 11, 12, 5, 16, 7, 4, 25};	
    
    public Selectionsort()				
    {
        tampilkanAngka();				
        urutkanAngka();				
        tampilkanAngka();				
    }
    void tampilkanAngka()			
    {
        System.out.println("\n---------------");	
        for (int i=0;i<angka.length;i++)		
        {						
            System.out.print(angka[i]+" ");		
        }						
    }
    void urutkanAngka()				
    {
        int tampung;				
        for (int i=0;i<angka.length-1;i++)		
        {						
            int minindek=i;				
            for(int j=i+1;j<angka.length;j++)		
{					
                if(angka[j]<angka[minindek])		
                    minindek=j;			
                if(minindek!=i)			
  {					
                    tampung=angka[i];			
                    angka[i]=angka[minindek];		
                    angka[minindek]=tampung;		
                }            
            }  
         tampilkanAngka();			
        }
    }
    public static void main(String[] aksi)		
    {
        Selectionsort urut = new Selectionsort();	
    }
}

