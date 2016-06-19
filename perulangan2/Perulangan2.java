package perulangan2;
import java.util.Scanner;
/**
 *
 * @author Andri Nugroho
 */
public class Perulangan2 {
   
    public static void main(String[] args) {
        //input data yang diinginkan
        //masukkan nilai maximal data
        //Masukkan Nilai data
        //print out data dengan tanda koma
        
        Scanner input = new Scanner (System.in);
        
        //P1
        String data;
        System.out.println("Data apa yang anda Ingin Inputkan?");
        data = input.next();
        
        
        //P2
        System.out.print("Masukkan Jumlah maximal " + data + " yang ingin Anda Inputkan :");
        int jdata = input.nextInt();
        String hdata[] = new String[jdata];
        
        
        //P3
        for (int i = 0; i < jdata; i++) {
            System.out.print(data +" "+ (i+1) + " Adalah :");
            hdata[i] = input.next();
        }
        
        //P4
        System.out.println("Anda Menginputkan data "+ data +" sebagai Berikut : ");
        for (int a = 0; a < jdata; a++) {
            System.out.print(hdata[a] + " , ");
        }
    }
        
        
        }