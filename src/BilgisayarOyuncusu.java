
import java.util.Random;

public class BilgisayarOyuncusu extends Oyuncu {

    public String kartListesi[][] = new String[3][2];

    public BilgisayarOyuncusu() {
    }

    public BilgisayarOyuncusu(int oyuncuID, String oyuncuAdi, int skor) {
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
        Random random = new Random();
        int randomKart = 4; // ilk 3 indexten farklı olması için rastgele sayı verdim.

        while (true) {
            int temp = random.nextInt(10);
            
            for(int i=0;i<3;i++){
            if (String.valueOf(temp).equals(oyuncu.kartListesi[i][0])) {
                randomKart = i;
                break;
            }
            }
             if(randomKart!=4){
              return randomKart;
             }
        }
       
    }

}
