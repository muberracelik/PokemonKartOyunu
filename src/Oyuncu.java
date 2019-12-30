
public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    public String [][]kartListesi=new String[3][2];
    
    
    public Oyuncu(){
       skor=0;
    }
    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    
    public int getOyuncuID() {
        return oyuncuID;
    }

    
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    
    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    
    public int getSkor() {
        return skor;
    }

    
    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    public void SkorGoster(){
    
    
    }
    
     
    abstract int kartSec(Oyuncu oyuncu);
    
}
