/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugassoaldannilai;

import java.util.Scanner;

/**
 *
 * @author Andri Nugroho
 */
public class TugasSoaldanNilai {

    public static void main(String[] args) {
        //Tampilkan Soal
        //Jawab Soal
        //Validasi Benar atau salah
        //Jika Benar point = 2 salah =0
        //Tentukan berapa benar dan berapa salah(Ditampilkan)
        //tampilkan Jumlah Nilai
        // Tampilkan Grade Nilai
        Scanner in = new Scanner(System.in);
        
        String[] soal = new String[50];
        soal[0] = 1+". Apa yang dimaksud Lan";
        soal[1] = 2+". Apa yang dimaksud Wan";
        soal[2] = 3+". Apa yang dimaksud Man?";
        soal[3] = 4+". Berikut ini yang termasuk aplikasi browsher,kecuali?";
        soal[4] = 5+". Berikut ini yang termasuk topologi, kecuali?";  
        
        soal[5] = 6+". Apakah pengertian dari IP?";
        soal[6] = 7+". Berapa range Host IP yang berada pada class C?";
        soal[7] = 8+". Apakah Kepanjangan dari IP?";
        soal[8] = 9+". Berapa class IP yang berada di TCP/IPV4?";
        soal[9] = 10+". Berikut ini yang termasuk class TCP/IPV4, kecuali ...";
        
        soal[10] = 11+". Berapa Subnet Mask Ip Address Class C?";
        soal[11] = 12+". Apa Kepanjangan dari Lan?";
        soal[12] = 13+". Apa Kepanjangan dari Man?";
        soal[13] = 14+". Apa Kepanjangan dari WAn?";
        soal[14] = 15+". Apa pengertian Internet?";
        
        soal[15] = 16+". Berapa banyak Topologi yang ada?";   
        soal[16] = 17+". Berikut ini adalah Tempat yang dapat digunakan untuk mengimplementasikan topologi star";
        soal[17] = 18+". Berapa Subnet Mask Ip Address Class A?";
        soal[18] = 19+". Berapa range IP address?";
        soal[19] = 20+". Apa yang dimaksud dengan Host pada IP?";
        
        soal[20] = 21+". Berapa range IP Address Class B?";
        soal[21] = 22+". Berapa range IP Address Class A?";
        soal[22] = 23+". Berikut ini IP address yang berada di class A berikut ini?";
        soal[23] = 24+". Berikut ini IP address yang berada di class B berikut ini?";
        soal[24] = 25+". Berikut ini IP address yang berada di class C berikut ini?";
        
        soal[25] = 26+". Berapakah Ip Address yang digunakan untuk GATEWAY Default International?";
        soal[26] = 27+". Versi berapa IP Address setelah Versi 4?";   
        soal[27] = 28+". Apa yang digunakan pada komputer untuk menghubungkan Ke caringan LAN?";
        soal[28] = 29+". Apakah Nama Slot yang digunakan untuk menggunakan Modem?";
        soal[29] = 30+". Apa yang dimaksud dengan jaringan 3G";
        
        soal[30] = 31+". Apa kepanjangan dari WWW";
        soal[31] = 32+". BErikut ini adalah penertian dari Domain?";
        soal[32] = 33+". Apa yang dimaksud dengan DNS?";
        soal[33] = 34+". Apa pengertian HTTP?";
        soal[34] = 35+". Apa kepanjangan HTTP?";
        
        soal[35] = 36+". Apa kepanjangan HTTPS?";
        soal[36] = 37+". Apa pengertian HTTPS?";
        soal[37] = 38+". Apa Kepanjangan dari 4G?";
        soal[38] = 39+". Apa kepanjangan dari Wi-Fi?";
        soal[39] = 40+". Apa pengertian Wireless?";
        
        soal[40] = 41+". Apa yang dimaksud dengan ethernet?";
        soal[41] = 42+". Apa yang dimaksud dengan HOTSPOT?";
        soal[42] = 43+". Apa yang dimaksud dengan SLOT?";
        soal[43] = 44+". Apa yang dimaksud dengan Ethernet Card?";
        soal[44] = 45+". Jaringan apa yang terbesar didunia?";
        
        soal[45] = 46+". Berikut ini merupakan alat untuk berkomunikasi, kecuali?";
        soal[46] = 47+". Aplikasi apa yang digunakan untuk mengalihkan IP Address / proxy server?";   
        soal[47] = 48+". Apa pengertian dari Situs?";
        soal[48] = 49+". Apa kepanjangan dari 2G?";
        soal[49] = 50+". Apa pengertian dari jaringan 2G?";
        
        String[] jwb1 = new String[4];
        jwb1[0] = "a. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang sempit";
        jwb1[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang luas";
        jwb1[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang sedang";
        jwb1[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sedang";
        String[] jwb2 = new String[4];
        jwb2[0] = "a. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang Luas";
        jwb2[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang luas";
        jwb2[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang sedang";
        jwb2[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        String[] jwb3 = new String[4];
        jwb3[0] = "a. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang Sempit";
        jwb3[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang luas";
        jwb3[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang sedang";
        jwb3[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        String[] jwb4 = new String[4];
        jwb4[0] = "a. Mozzila Firefox";
        jwb4[1] = "b. Internet Explorer";
        jwb4[2] = "c. Chrome";
        jwb4[3] = "d. Blogger";
        String[] jwb5 = new String[4];
        jwb5[0] = "a. Ring";
        jwb5[1] = "b. Star";
        jwb5[2] = "c. Bus";
        jwb5[3] = "d. Blog";
        String[] jwb6 = new String[4];
        jwb6[0] = "a. IP adalah Alamat yang digunakan pada sebuah device untuk pengiriman surat post";
        jwb6[1] = "b. IP adalah Alamat yang digunakan pada sebuah Komputer yang bersifat logic";
        jwb6[2] = "c. IP adalah Alamat yang digunakan pada sebuah Komputer yang bersifat Fisik";
        jwb6[3] = "d. IP adalah Alamat yang digunakan pada sebuah Komputer yang bersifat Fleksible";
        String[] jwb7 = new String[4];
        jwb7[0] = "a. 192.0.0.0 - 255.255.255.255";
        jwb7[1] = "b. 172.0.0.0 - 255.255.255.255";
        jwb7[2] = "c. 1.0.0.0 - 255.255.255.255";
        jwb7[3] = "d. 127.0.0.0 - 255.255.255.255";
        String[] jwb8 = new String[4];
        jwb8[0] = "a. Internet Pro-Bolt";
        jwb8[1] = "b. Internet Service";
        jwb8[2] = "c. Internet Protokol";
        jwb8[3] = "d. Internasional Protokol";
        String[] jwb9 = new String[4];
        jwb9[0] = "a. 5";
        jwb9[1] = "b. 4";
        jwb9[2] = "c. 3";
        jwb9[3] = "d. 2";
        String[] jwb10 = new String[4];
        jwb10[0] = "a. Class A";
        jwb10[1] = "b. Class F";
        jwb10[2] = "c. Class E";
        jwb10[3] = "d. Class D";
        
        
        String[] jwb11 = new String[4];
        jwb11[0] = "a. 255.000.000.000";
        jwb11[1] = "b. 255.000.000.255";
        jwb11[2] = "c. 255.255.255.000";
        jwb11[3] = "d. 255.255.000.000";
        String[] jwb12 = new String[4];
        jwb12[0] = "a. Local Area Restired";
        jwb12[1] = "b. Local Area Indonesia";
        jwb12[2] = "c. Local Area Novice";
        jwb12[3] = "d. Local Area Network";
        String[] jwb13 = new String[4];
        jwb13[0] = "a. Local Area Protokol";
        jwb13[1] = "b. Local Area Service";
        jwb13[2] = "c. Middle Area Windowed";
        jwb13[3] = "d. Middle Area Network";
        String[] jwb14 = new String[4];
        jwb14[0] = "a. Wide Area Network";
        jwb14[1] = "b. Wide Area Rest";
        jwb14[2] = "c. Local Area Network";
        jwb14[3] = "d. Middle Area Network";
        String[] jwb15 = new String[4];
        jwb15[0] = "a. Internet adalah Komunikasi antar user yang berada pada Area yang luas (WAN)";
        jwb15[1] = "b. Internet adalah Komunikasi antar user yang berada pada Area yang Sempit (LAN)";
        jwb15[2] = "c. Internet adalah Komunikasi antar user yang berada pada Area yang Sedang (MAN)";
        jwb15[3] = "d. Internet adalah Komunikasi antar user yang berada pada Area tertentu (WAN)";
        String[] jwb16 = new String[4];
        jwb16[0] = "a. 5";
        jwb16[1] = "b. 4";
        jwb16[2] = "c. 6";
        jwb16[3] = "d. 7";
        String[] jwb17 = new String[4];
        jwb17[0] = "a. Warnet ";
        jwb17[1] = "b. Rental Mobil";
        jwb17[2] = "c. Rumah Makan";
        jwb17[3] = "d. Bengkel";
        String[] jwb18 = new String[4];
        jwb18[0] = "a. 255.255.255.0";
        jwb18[1] = "b. 255.255.0.0";
        jwb18[2] = "c. 255.0.0.0";
        jwb18[3] = "d. 255.255.255.255";
        String[] jwb19 = new String[4];
        jwb19[0] = "a. 192.0.0.0 - 255.255.255.255";
        jwb19[1] = "b. 172.0.0.0 - 255.255.255.255";
        jwb19[2] = "c. 1.0.0.0 - 255.255.255.255";
        jwb19[3] = "d. 127.0.0.0 - 255.255.255.255";
        String[] jwb20 = new String[4];
        jwb20[0] = "a. ID yang digunakan sebagai angka unik yang membedakan pada saat koneksi LAN dengan PC lain";
        jwb20[1] = "b. ID yang digunakan sebagai angka unik yang membedakan pada saat koneksi USB dengan PC lain";
        jwb20[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke user lain(Peer to peer) dalam range yang sedang";
        jwb20[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        
        String[] jwb21 = new String[4];
        jwb21[0] = "a. 192.0.0.0 - 255.255.255.255";
        jwb21[1] = "b. 126.0.0.0 - 191.255.255.255";
        jwb21[2] = "c. 1.0.0.0 - 126.255.255.255";
        jwb21[3] = "d. 127.0.0.0 - 255.255.255.255";
        String[] jwb22 = new String[4];
        jwb22[0] = "a. 192.0.0.0 - 255.255.255.255";
        jwb22[1] = "b. 126.0.0.0 - 191.255.255.255";
        jwb22[2] = "c. 1.0.0.0 - 126.255.255.255";
        jwb22[3] = "d. 127.0.0.0 - 255.255.255.255";
        String[] jwb23 = new String[4];
        jwb23[0] = "a. 10.10.10.1";
        jwb23[1] = "b. 172.245.1.1";
        jwb23[2] = "c. 196.168.1.1";
        jwb23[3] = "d. 127.0.0.0";
        String[] jwb24 = new String[4];
        jwb24[0] = "a. 10.10.10.1";
        jwb24[1] = "b. 172.245.1.1";
        jwb24[2] = "c. 196.168.1.1";
        jwb24[3] = "d. 127.0.0.0";
        String[] jwb25 = new String[4];
        jwb25[0] = "a. 10.10.10.1";
        jwb25[1] = "b. 172.245.1.1";
        jwb25[2] = "c. 196.168.1.1";
        jwb25[3] = "d. 127.0.0.0";
        String[] jwb26 = new String[4];
        jwb26[0] = "a. 10.10.10.1";
        jwb26[1] = "b. 172.245.1.1";
        jwb26[2] = "c. 196.168.1.1";
        jwb26[3] = "d. 127.0.0.0";
        String[] jwb27 = new String[4];
        jwb27[0] = "a. TCP/IP V5";
        jwb27[1] = "b. TCP/IP V6";
        jwb27[2] = "c. TCP/IP V7";
        jwb27[3] = "d. TCP/IP V8";
        String[] jwb28 = new String[4];
        jwb28[0] = "a. VGA CARD";
        jwb28[1] = "b. Graphic Card";
        jwb28[2] = "c. RAM";
        jwb28[3] = "d. LAN Card";
        String[] jwb29 = new String[4];
        jwb29[0] = "a. PCI";
        jwb29[1] = "b. Mother Board";
        jwb29[2] = "c. USB";
        jwb29[3] = "d. Proxy";
        String[] jwb30 = new String[4];
        jwb30[0] = "a. Jaringan yang berada di generasi ke 3";
        jwb30[1] = "b. Jaringan yang berada di generasi ke 4";
        jwb30[2] = "c. Jaringan Edge";
        jwb30[3] = "d. Jaringan yang berada di generasi ke 2";
        
        String[] jwb31 = new String[4];
        jwb31[0] = "a. Wide World Web";
        jwb31[1] = "b. Web Wide World";
        jwb31[2] = "c. World Wide Web";
        jwb31[3] = "d. Wireless Fideral";
        String[] jwb32 = new String[4];
        jwb32[0] = "a. Nama yang digunakan untuk mempermudah pemanggilan IP";
        jwb32[1] = "b. Nama yang digunakan untuk mempermudah pemanggilan Internet";
        jwb32[2] = "c. Nama yang digunakan untuk mempermudah pemanggilan Protokol";
        jwb32[3] = "d. Semuanya Benar";
        String[] jwb33 = new String[4];
        jwb33[0] = "a. Sebuah Protokol yang digunakan untuk Memberi Nama Pada IP Komputer";
        jwb33[1] = "b. Sebuah Protokol yang digunakan untuk Pemanggilan Internet";
        jwb33[2] = "c. Sebuah Protokol yang digunakan untuk mempermudah pemanggilan Protokol";
        jwb33[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        String[] jwb34 = new String[4];
        jwb34[0] = "a. Sebuah Protokol yang digunakan untuk Memanggil Sebuah Alamat Web";
        jwb34[1] = "b. Sebuah Protokol yang digunakan untuk Memanggil Situs pemerintahan";
        jwb34[2] = "c. Sebuah Protokol yang digunakan untuk Menghapus File Explorer";
        jwb34[3] = "d. Sebuah Protokol yang digunakan untuk Mengcopy Data Komputer";
        String[] jwb35 = new String[4];
        jwb35[0] = "a. Hyper Text Transportation Public";
        jwb35[1] = "b. Hexa Text Transportation Public";
        jwb35[2] = "c. Hyper Text Transper Protokol";
        jwb35[3] = "d. Hyper Text Transper Police";
        String[] jwb36 = new String[4];
        jwb36[0] = "a. Hyper Text Transportation Public";
        jwb36[1] = "b. Hexa Text Transportation Public";
        jwb36[2] = "c. Hyper Text Transper Protokol Security";
        jwb36[3] = "d. Hyper Text Transper Police";
        String[] jwb37 = new String[4];
        jwb37[0] = "a. Sebuah Protokol yang digunakan untuk Memanggil Sebuah Alamat Web dengan System Enkripsi Data";
        jwb37[1] = "b. Sebuah Protokol yang digunakan untuk Memanggil Situs pemerintahan";
        jwb37[2] = "c. Sebuah Protokol yang digunakan untuk Menghapus File Explorer";
        jwb37[3] = "d. Sebuah Protokol yang digunakan untuk Mengcopy Data Komputer";
        String[] jwb38 = new String[4];
        jwb38[0] = "a. 2 Generation";
        jwb38[1] = "b. 3 Generation";
        jwb38[2] = "c. 4 Generation";
        jwb38[3] = "d. 5 Generation";
        String[] jwb39 = new String[4];
        jwb39[0] = "a. Wireless Operator";
        jwb39[1] = "b. Wireless Fideral";
        jwb39[2] = "c. Wireless Service";
        jwb39[3] = "d. Wireless Feripheral";
        String[] jwb40 = new String[4];
        jwb40[0] = "a. Sebuah Protokol yang digunakan untuk menghubungkan koneksi ethernet";
        jwb40[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan koneksi LAN";
        jwb40[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan Satu komputer dengan satu komputer lainnya";
        jwb40[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan Koneksi Modem";
        
        String[] jwb41 = new String[4];
        jwb41[0] = "a. Sebuah Protokol yang digunakan untuk menghubungkan satu komputer dengan satu komputer lainnya";
        jwb41[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan satu komputer dengan banyak komputer lainnya";
        jwb41[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan banyak komputer dengan satu komputer lainnya";
        jwb41[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu komputer dengan dua komputer lainnya";
        String[] jwb42 = new String[4];
         jwb42[0] = "a. Sebuah Protokol yang digunakan untuk mengeshare koneksi internet";
        jwb42[1] = "b. Sebuah Protokol yang digunakan untuk menghubungkan koneksi LAN";
        jwb42[2] = "c. Sebuah Protokol yang digunakan untuk menghubungkan antar komputer dengan WIF";
        jwb42[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan Koneksi Modem";
        String[] jwb43 = new String[4];
        jwb43[0] = "a. Slot Adalah Alat yang digunakan untuk input pada Komputer";
        jwb43[1] = "b. Slot Adalah untuk menyambungkan kabel jenis USB";
        jwb43[2] = "c. Slot Adalah untuk menyambungkan internet";
        jwb43[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        String[] jwb44 = new String[4];
        jwb44[0] = "a. Perangkat keras yang digunakan untuk mengaktifkan Ethernet ";
        jwb44[1] = "b. Perangkat keras yang digunakan untuk mengaktifkan Internet";
        jwb44[2] = "c. Perangkat keras yang digunakan untuk mengaktifkan LAN";
        jwb44[3] = "d. Perangkat keras yang digunakan untuk mengaktifkan Monitor";
        String[] jwb45 = new String[4];
        jwb45[0] = "a. Internet";
        jwb45[1] = "b. Ethernet";
        jwb45[2] = "c. MAN";
        jwb45[3] = "d. Lan";
        String[] jwb46 = new String[4];
        jwb46[0] = "a. Handphone";
        jwb46[1] = "b. Kulkas";
        jwb46[2] = "c. Walkie-Talkie";
        jwb46[3] = "d. Telephone";
        String[] jwb47 = new String[4];
        jwb47[0] = "a. IP HIDE";
        jwb47[1] = "b. NETCUT";
        jwb47[2] = "c. FREE PROXY CHANGE";
        jwb47[3] = "d. MVA";
        String[] jwb48 = new String[4];
        jwb48[0] = "a. Laman antarmuka yang berada dalam Internet yang bisa kita akses";
        jwb48[1] = "b. Laman yang berisi konten di dalam Windows";
        jwb48[2] = "c. Laman Aplikasi yang digunakan untuk melakukan fungsi";
        jwb48[3] = "d. Sebuah Protokol yang digunakan untuk menghubungkan satu user ke server dalam range yang sempit";
        String[] jwb49 = new String[4];
        jwb49[0] = "a. 2 Generation";
        jwb49[1] = "b. 3 Generation";
        jwb49[2] = "c. 4 Generation";
        jwb49[3] = "d. 5 Generation";
        String[] jwb50 = new String[4];
        jwb50[0] = "a. Jaringan yang berada di generasi ke 3";
        jwb50[1] = "b. Jaringan yang berada di generasi ke 4";
        jwb50[2] = "c. Jaringan Edge";
        jwb50[3] = "d. Jaringan yang berada di generasi ke 2";
                  
                  
                  
                          
                  
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
        
            
            System.out.println(soal[0]);
            for (int j = 0; j < 4; j++){
                System.out.println(jwb1[j]);                  
            }
            System.out.print("Jawab : ");
        String jawab1 = in.nextLine();
        if (jawab1.equalsIgnoreCase("a")) {
            a1 = 2;
            System.out.println("Benar");
        } else {
            a1 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[1]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb2[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab2 = in.nextLine();
        if (jawab2.equalsIgnoreCase("a")) {
            a2 = 2;
            System.out.println("Benar");
        } else {
            a2 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
        
            System.out.println(soal[2]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb3[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab3 = in.nextLine();
        if (jawab3.equalsIgnoreCase("c")) {
            a3 = 2;
            System.out.println("Benar");
        } else {
            a3 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
            System.out.println(soal[3]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb4[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab4 = in.nextLine();
        if (jawab4.equalsIgnoreCase("d")) {
            a4 = 2;
            System.out.println("Benar");
        } else {
            a4 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
            System.out.println(soal[4]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb5[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab5 = in.nextLine();
        if (jawab5.equalsIgnoreCase("d")) {
            a5 = 2;
            System.out.println("Benar");
        } else {
            a5 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[5]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb6[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab6 = in.nextLine();
        if (jawab6.equalsIgnoreCase("b")) {
            a6 = 2;
            System.out.println("Benar");
        } else {
            a6 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
        
            System.out.println(soal[6]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb7[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab7 = in.nextLine();
        if (jawab7.equalsIgnoreCase("a")) {
            a7 = 2;
            System.out.println("Benar");
        } else {
            a7 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[7]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb8[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab8 = in.nextLine();
        if (jawab8.equalsIgnoreCase("c")) {
            a8 = 2;
            System.out.println("Benar");
        } else {
            a8 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
        System.out.println(soal[8]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb9[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab9 = in.nextLine();
        if (jawab9.equalsIgnoreCase("b")) {
            a9 = 2;
            System.out.println("Benar");
        } else {
            a9 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[9]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb10[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab10 = in.nextLine();
        if (jawab10.equalsIgnoreCase("b")) {
            a10 = 2;
            System.out.println("Benar");
        } else {
            a10 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
        
            System.out.println(soal[10]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb11[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab11 = in.nextLine();
        if (jawab11.equalsIgnoreCase("c")) {
            b1 = 2;
            System.out.println("Benar");
        } else {
            b1 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[11]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb12[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab12 = in.nextLine();
        if (jawab12.equalsIgnoreCase("d")) {
            b2 = 2;
            System.out.println("Benar");
        } else {
            b2 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[12]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb13[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab13 = in.nextLine();
        if (jawab13.equalsIgnoreCase("d")) {
            b3 = 2;
            System.out.println("Benar");
        } else {
            b3 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[13]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb14[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab14 = in.nextLine();
        if (jawab14.equalsIgnoreCase("a")) {
            b4 = 2;
            System.out.println("Benar");
        } else {
            b4 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[14]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb15[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab15 = in.nextLine();
        if (jawab15.equalsIgnoreCase("a")) {
            b5 = 2;
            System.out.println("Benar");
        } else {
            b5 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[15]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb16[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab16 = in.nextLine();
        if (jawab16.equalsIgnoreCase("b")) {
            b6 = 2;
            System.out.println("Benar");
        } else {
            b6 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[16]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb17[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab17 = in.nextLine();
        if (jawab17.equalsIgnoreCase("a")) {
            b7 = 2;
            System.out.println("Benar");
        } else {
            b7 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[17]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb18[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab18 = in.nextLine();
        if (jawab18.equalsIgnoreCase("c")) {
            b8 = 2;
            System.out.println("Benar");
        } else {
            b8 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[18]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb19[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab19 = in.nextLine();
        if (jawab19.equalsIgnoreCase("c")) {
            b9 = 2;
            System.out.println("Benar");
        } else {
            b9 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[19]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb20[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab20 = in.nextLine();
        if (jawab20.equalsIgnoreCase("a")) {
            b10 = 2;
            System.out.println("Benar");
        } else {
            b10 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[20]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb21[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab21 = in.nextLine();
        if (jawab21.equalsIgnoreCase("b")) {
            c1 = 2;
            System.out.println("Benar");
        } else {
            c1 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[21]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb22[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab22 = in.nextLine();
        if (jawab22.equalsIgnoreCase("c")) {
            c2 = 2;
            System.out.println("Benar");
        } else {
            c2 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[22]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb23[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab23 = in.nextLine();
        if (jawab23.equalsIgnoreCase("a")) {
            c3 = 2;
            System.out.println("Benar");
        } else {
            c3 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[23]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb24[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab24 = in.nextLine();
        if (jawab24.equalsIgnoreCase("b")) {
            c4 = 2;
            System.out.println("Benar");
        } else {
            c4 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            System.out.println(soal[24]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb25[j]);
                
            }
            
            System.out.print("Jawab : ");
        String jawab25 = in.nextLine();
        if (jawab25.equalsIgnoreCase("c")) {
            c5 = 2;
            System.out.println("Benar");
        } else {
            c5 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[25]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb26[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab26 = in.nextLine();
        if (jawab26.equalsIgnoreCase("d")) {
            c6 = 2;
            System.out.println("Benar");
        } else {
            c6 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[26]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb27[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab27 = in.nextLine();
        if (jawab27.equalsIgnoreCase("b")) {
            c7 = 2;
            System.out.println("Benar");
        } else {
            c7 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[27]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb28[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab28 = in.nextLine();
        if (jawab28.equalsIgnoreCase("d")) {
            c8 = 2;
            System.out.println("Benar");
        } else {
            c8 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[28]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb29[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab29 = in.nextLine();
        if (jawab29.equalsIgnoreCase("c")) {
            c9 = 2;
            System.out.println("Benar");
        } else {
            c9 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[29]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb30[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab30 = in.nextLine();
        if (jawab30.equalsIgnoreCase("a")) {
            c10 = 2;
            System.out.println("Benar");
        } else {
            c10 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[30]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb31[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab31 = in.nextLine();
        if (jawab31.equalsIgnoreCase("c")) {
            d1 = 2;
            System.out.println("Benar");
        } else {
            d1 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[31]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb32[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab32 = in.nextLine();
        if (jawab32.equalsIgnoreCase("a")) {
            d2 = 2;
            System.out.println("Benar");
        } else {
            d2 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[32]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb33[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab33 = in.nextLine();
        if (jawab33.equalsIgnoreCase("a")) {
            d3 = 2;
            System.out.println("Benar");
        } else {
            d3 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            
            System.out.println(soal[33]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb34[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab34 = in.nextLine();
        if (jawab34.equalsIgnoreCase("a")) {
            d4 = 2;
            System.out.println("Benar");
        } else {
            d4 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            System.out.println(soal[34]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb35[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab35 = in.nextLine();
        if (jawab35.equalsIgnoreCase("c")) {
            d5 = 2;
            System.out.println("Benar");
        } else {
            d5 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            System.out.println(soal[35]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb36[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab36 = in.nextLine();
        if (jawab36.equalsIgnoreCase("c")) {
            d6 = 2;
            System.out.println("Benar");
        } else {
            d6 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            System.out.println(soal[36]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb37[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab37 = in.nextLine();
        if (jawab37.equalsIgnoreCase("c")) {
            d7 = 2;
            System.out.println("Benar");
        } else {
            d7 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[37]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb38[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab38 = in.nextLine();
        if (jawab38.equalsIgnoreCase("c")) {
            d8 = 2;
            System.out.println("Benar");
        } else {
            d8 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            
            System.out.println(soal[38]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb39[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab39 = in.nextLine();
        if (jawab39.equalsIgnoreCase("b")) {
            d9 = 2;
            System.out.println("Benar");
        } else {
            d9 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[39]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb40[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab40 = in.nextLine();
        if (jawab40.equalsIgnoreCase("b")) {
            d10 = 2;
            System.out.println("Benar");
        } else {
            d10 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[40]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb41[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab41 = in.nextLine();
        if (jawab41.equalsIgnoreCase("b")) {
            e1 = 2;
            System.out.println("Benar");
        } else {
            e1 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[41]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb42[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab42 = in.nextLine();
        if (jawab42.equalsIgnoreCase("a")) {
            e2 = 2;
            System.out.println("Benar");
        } else {
            e2 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[42]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb43[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab43 = in.nextLine();
        if (jawab43.equalsIgnoreCase("a")) {
            e3 = 2;
            System.out.println("Benar");
        } else {
            e3 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[43]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb44[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab44 = in.nextLine();
        if (jawab44.equalsIgnoreCase("a")) {
            e4 = 2;
            System.out.println("Benar");
        } else {
            e4 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[44]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb45[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab45 = in.nextLine();
        if (jawab45.equalsIgnoreCase("a")) {
            e5 = 2;
            System.out.println("Benar");
        } else {
            e5 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            System.out.println(soal[45]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb46[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab46 = in.nextLine();
        if (jawab46.equalsIgnoreCase("b")) {
            e6 = 2;
            System.out.println("Benar");
        } else {
            e6 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[46]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb47[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab47 = in.nextLine();
        if (jawab47.equalsIgnoreCase("c")) {
            e7 = 2;
            System.out.println("Benar");
        } else {
            e7 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            System.out.println(soal[47]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb48[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab48 = in.nextLine();
        if (jawab48.equalsIgnoreCase("a")) {
            e8 = 2;
            System.out.println("Benar");
        } else {
            e8 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[48]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb49[j]);
                
            }
            System.out.print("Jawab : ");
        String jawab49 = in.nextLine();
        if (jawab49.equalsIgnoreCase("a")) {
            e9 = 2;
            System.out.println("Benar");
        } else {
            e9 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
            System.out.println(soal[49]);           
            for (int j = 0; j < 4; j++){
                System.out.println(jwb50[j]);
                
            }System.out.print("Jawab : ");
        String jawab50 = in.nextLine();
        if (jawab50.equalsIgnoreCase("d")) {
            e10 = 2;
            System.out.println("Benar");
        } else {
            e10 = 0;
            System.out.println("Salah");
        }
        System.out.println("");
            
            
            
           int jmlh; 
            jmlh = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + e1 + e2 + e3 + e4 + e5 + e6 + e7 + e8 + e9 + e10;
        String Grade;
        String Status;
        if (jmlh >= 90) {
            Grade = "A";
            Status = "LULUS";
        } else if (jmlh >= 85) {
            Grade = "AB";
            Status = "LULUS";
        } else if (jmlh >= 75) {
            Grade = "B";
            Status = "LULUS";
        } else if (jmlh >= 65) {
            Grade = "BC";
            Status = "LULUS";
        } else if (jmlh >= 60) {
            Grade = "C";
            Status = "LULUS";
        } else if (jmlh >= 50) {
            Grade = "D";
            Status = "TIDAK LULUS";
        } else {
            Grade = "E";
            Status = "TIDAK LULUS";
        }
        System.out.println("");
        System.out.println("Jumlah Benar : " + (jmlh / 2));
        System.out.println("Jumlah Salah : " + (50 - (jmlh / 2)));
        System.out.println("Nilai : " + jmlh);
        System.out.println("Grade : " + Grade);
        System.out.println("Status: " + Status);
    }
    
}
