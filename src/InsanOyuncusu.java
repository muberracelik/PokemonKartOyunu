
public class InsanOyuncusu extends Oyuncu{
   public String [][]kartListesi=new String[3][2];

    public InsanOyuncusu() {
    }

    public InsanOyuncusu(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    

    
    public String[][] getKartListesi() {
        return kartListesi;
    }

    
    public void setKartListesi(String[][] kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    int kartSec(Oyuncu oyuncu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
