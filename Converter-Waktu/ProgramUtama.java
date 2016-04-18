package jam;
public class ProgramUtama {

   public static void main(String[] args){
    Jam waktu = new Jam();
    System.out.println(" 1 Jam = " + waktu.convertJamtoMenit(1) + " Menit");
    System.out.println(" 1 Jam = " + waktu.convertJamtoDetik(1) + " Detik");
    System.out.println(" 1 Hari = " + waktu.convertDaytoJam(1) + " Jam");
    System.out.println(" 1 Bulan = " + waktu.convertMonthtoJam(1) + " Jam");
    System.out.println(" 1 Tahun = " + waktu.convertMonthtoYear(1) + " Bulan");
    System.out.println(" 1 Tahun = " + waktu.convertYeartoJam(1) + " Jam");
    System.out.println(" 1 Windu = " + waktu.convertWindutoJam(1) + " Jam");
    
   }
}
