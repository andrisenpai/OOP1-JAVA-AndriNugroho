/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan2;
public class Segitiga extends BangunDatar {
            int luasSegitiga(int alas, int tinggi){
            double luas;
            luas = alas * tinggi * 0.5;
            return (int) luas;
            }
            int kelilingSegitiga(int alas, int tinggi){
            double keliling;
            keliling = (alas *alas) + (tinggi * tinggi);
            return (int) keliling;
        }    
}
