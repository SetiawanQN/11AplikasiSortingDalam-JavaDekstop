/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

/**
 *
 * @author doscom
 */
public class Radixsort {
    int x[]={43,64,12,42,35};					
    int y[][]=new int[10][10];					
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;	
    void cetakbefore(){
         System.out.println("Before Sorting : ");
        for (int t=0;t<=4;t++){
            int l=x[t];							
            System.out.println(l);
        }
        System.out.println("\n");
    }
        void input(int angka,int rad){    				
        if(rad==0){						
            y[0][a]=angka;            a++;				
        }else if(rad==1){						
            y[1][b]=angka;            b++;				
        }else if(rad==2){						
            y[2][c]=angka;            c++;				
        }else if(rad==3){						
            y[3][d]=angka;            d++;				
        }else if(rad==4){						
            y[4][e]=angka;            e++;				
        }else if(rad==5){						
            y[5][f]=angka;            f++;				
        }else if(rad==6){						
            y[6][g]=angka;            g++;				
        }else if(rad==7){						
            y[7][h]=angka;            h++;				
        }else if(rad==8){						
            y[8][i]=angka;            i++;				
        }else if(rad==9){						
            y[9][j]=angka;            j++;				
        }}
    void out(){							 
        int m,o=0;							
        for(m=0;m<=9;m++){					
            int n=0;							
            while((y[m][n])!= 0){					
                x[o]=y[m][n];                y[m][n]=0;			
                n++;o++;						
            }}
         a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;j=0;               	
    }
    void cetak(){
        System.out.println("After Sorting : ");
       for(int t=0;t<=4;t++){					
            int r=x[t];							
            System.out.println(r);						
        }}
    void inhit(int t){
        for(int p=0;p<=4;p++){					
            int r=x[p];
            int s=(x[p]/t%10);						
            input(r,s);
        }}
    public static void main(String[] args) {
        Radixsort mu=new Radixsort();
        mu.cetakbefore();
        mu.inhit(1);						
        mu.out();							
        mu.inhit(10);						
        mu.out();							
        mu.cetak();						
}  
}
