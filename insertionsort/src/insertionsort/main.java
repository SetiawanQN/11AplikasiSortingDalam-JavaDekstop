/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String args[])					
 {
     
 Insertionsort a=new Insertionsort();
  String nama[] = {"gina", "cici", "beni","iwan"};			
  int indeksTerakhir = nama.length - 1;					
  System.out.println("Data sebelum diurutkan : ");			
  a.tampilkanData(nama, indeksTerakhir);					
  System.out.println("");							
  a.Insertionsort(nama, indeksTerakhir);					
  System.out.println("Data setelah diurutkan : ");				
  a.tampilkanData(nama, indeksTerakhir);					
 }
    
}
