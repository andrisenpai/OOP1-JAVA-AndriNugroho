package procedure.dan.function.dengan.parameter;
public class ProcedureDanFunctionDenganParameter {

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
