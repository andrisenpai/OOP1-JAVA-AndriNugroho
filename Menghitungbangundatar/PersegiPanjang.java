/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan2;

/**
 *
 * @author Andri Nugroho
 */
public class PersegiPanjang extends BangunDatar {
            int luasPersegiPanjang (int panjang, int lebar){
            int luas;
            luas = panjang * lebar;
            return luas;
        }
            int kelilingPersegiPanjang (int panjang,int lebar){
            int keliling;
            keliling = 2 * (panjang + lebar);
            return keliling;
            }
}
