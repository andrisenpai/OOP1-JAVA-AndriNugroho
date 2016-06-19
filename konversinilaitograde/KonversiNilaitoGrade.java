/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konversinilaitograde;

import java.util.Scanner;

/**
 *
 * @author Andri Nugroho
 */
public class KonversiNilaitoGrade {

    public static void main(String[] args) {
        int nilai;
        String Grade;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        if (nilai >= 90) {
            Grade = "A";
        } else if (nilai >= 85) {
            Grade = "AB";
        } else if (nilai >= 75) {
            Grade = "B";
        } else if (nilai >= 65) {
            Grade = "BC";
        } else if (nilai >= 60) {
            Grade = "C";
        } else if (nilai >= 50) {
            Grade = "D";
        } else {
            Grade = "E";
        }
        System.out.println("");
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("Grade : " + Grade);
    }
    
}
