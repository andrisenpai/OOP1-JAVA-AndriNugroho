/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procedure.dan.function.dengan.parameter;

/**
 *
 * @author Andri Nugroho
 */
public class ProcedureDanFunctionDenganParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcedureDanFunctionDenganParameter value = new ProcedureDanFunctionDenganParameter();
        value.bagi(3, 4);
        value.tambah(5, 6);
        value.kali(5, 6);
        value.bagi(3, 4);
    }
    
    private void bagi(float x, float y){
    float hasil;
    hasil = x / y;
    System.out.println(hasil);
    }
    private void tambah(float x, float y){
    float hasil;
    hasil = x + y;
    System.out.println(hasil);
    }
    private void kurang(float x, float y){
    float hasil;
    hasil = x - y;
    System.out.println(hasil);
    }
    private void kali(float x, float y){
    float hasil;
    hasil = x * y;
    System.out.println(hasil);
    }
}
