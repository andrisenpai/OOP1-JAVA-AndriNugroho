
public class AnakAbstrak extends KelasAbstrak{
    @Override
    public void keliling(int panjang, int lebar){
        int keliling;
        keliling = 2 * (panjang + lebar);
    }

    @Override
    public void luasPersegiPanjang (int panjang, int lebar){
        int luas;
        luas = panjang * lebar;
    }
    
}
