/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nilaiminmax;

import java.util.Scanner;

/**
 *
 * @author Andri Nugroho
 */
public class Nilaiminmax {
    public static void main(String[] args) {
      Scanner input =new Scanner (System.in);
    int jumlah,bil,bil2,nilaimin=1000, nilaimax = 0, jml = 1;
    char pil;
   
    
    jumlah = input.nextInt();
    pil = input.next().charAt(0);
        
    if (pil == 'A'){
    for (int i = 0; i < jumlah; i++) {
            bil = input.nextInt();
           if (bil <= nilaimin) {
               if (bil == nilaimin){
                   jml++; 
               }
              nilaimin = bil;
           }
           
        }
    System.out.println(nilaimin);
    System.out.println(jml);
    
    }else if (pil == 'B'){
       for (int i = 0; i < jumlah; i++) {
            bil2 = input.nextInt();
           if (bil2 >= nilaimax) {
               if (bil2 == nilaimax){
                   jml++;
               }
               nilaimax = bil2;
           }
            
            
         }
    
            System.out.println(nilaimax);
            System.out.println(jml);
    }
    
    
}
}