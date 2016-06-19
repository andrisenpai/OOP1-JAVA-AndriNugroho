/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Try;

import java.util.Scanner;

public class scontrolp2 {
        public static void main(String[] args){
            int km; 
            try (Scanner rm = new Scanner (System.in)) {
                System.out.println("Masukkan Kode Motor : ");
                km = rm.nextInt();
            }
            String hm = null;
            String nm;
            if (km == 001){
                hm = "40000000";
                nm = "Ninja RR 250 CC";
            }else if (km == 002){
                hm = "20000000";
                nm = "CBR 150R New MT Edition";
            }else if (km == 003){
                hm = "15000000";
                nm = ("Mio GT Auto Sporty");
            }else if (km == 004){
                hm = "30000000";
                nm = ("Yamaha R15 GP Edition");
            }else{
                nm = "Tidak Ada";
            }
            if (nm == "Tidak Ada"){
                System.out.println("Tidak Ada Motor");
            }
            System.out.println("Nama Motor : " + nm);
            System.out.println("Harga Motor: " + hm);
            }
        
}