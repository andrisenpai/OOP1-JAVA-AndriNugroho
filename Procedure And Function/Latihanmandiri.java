package latihanmandiri;

public class Latihanmandiri {
    public static void main(String[] args) {
        Latihanmandiri value = new Latihanmandiri();
        value.loop(5);
        value.bagi(1, 2);
        }
    private void loop(int i){
        
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
     private void bagi(float a, float b){
     float hasil;
     hasil = a/b;
         System.out.println(hasil);
     
        
    }
}
