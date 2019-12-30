
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Main {

    ArrayList<ImageIcon> pokemonImages = new ArrayList<>();
    ArrayList<Integer> kullanılanKartlar = new ArrayList<>();
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public ArrayList<ImageIcon> pokemonKartOlustur() {
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Pikachu.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Bulbasaur.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Charmander.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Squirtle.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Zubat.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Psyduck.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Snorlax.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Butterfree.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Jigglypuff.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/Meowth.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        pokemonImages.add(new ImageIcon(new ImageIcon("kartlar/pokemon-card-back.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));

        return pokemonImages;

    }

    public ArrayList<Pokemon> PokemonOlustur() {
        pokemons.add(new Pikachu("Pikachu", "Elektrik", 40));
        pokemons.add(new Bulbasaur("Bulbasaur", "Çim", 50));
        pokemons.add(new Charmander("Charmander", "Ateş", 60));
        pokemons.add(new Squirtle("Squirtle", "Su", 30));
        pokemons.add(new Zubat("Zubat", "Hava", 50));
        pokemons.add(new Psyduck("Psyduck", "Su", 20));
        pokemons.add(new Snorlax("Snorlax", "Normal", 30));
        pokemons.add(new Butterfree("Butterfree", "Hava", 10));
        pokemons.add(new Jigglypuff("Jigglypuff", "Ses", 70));
        pokemons.add(new Meowth("Meowth", "Normal", 40));
        return pokemons;
    }

    public void kartAta(Oyuncu oyuncu) {
        Random random = new Random();
        int kullanildiMi = 0;
        int sayi = 0;
        int temp;

        while (true) {
            kullanildiMi = 0; // kullanılankartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
           temp = random.nextInt(10);
            for (int i = 0; i < kullanılanKartlar.size(); i++) {
                if (temp == kullanılanKartlar.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0 && sayi < 3) {
                kullanılanKartlar.add(temp);
                oyuncu.kartListesi[sayi][0] = String.valueOf(temp);
                oyuncu.kartListesi[sayi][1] = pokemons.get(temp).getPokemonAdi();
                sayi++;

            }
            if (sayi == 3) {
                break;
            }

        }

    }

    public void destedenCek(Oyuncu oyuncu,int kullanicininTikladigiKart) {
        
        Random random = new Random();
        int kullanildiMi = 0;
        int temp;
     while (true) {
            kullanildiMi = 0;// kullanılan kartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
           temp = random.nextInt(10);
            for (int i = 0; i < kullanılanKartlar.size(); i++) {
                if (temp == kullanılanKartlar.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0) {
                kullanılanKartlar.add(temp);
                oyuncu.kartListesi[kullanicininTikladigiKart][0] = String.valueOf(temp);
                oyuncu.kartListesi[kullanicininTikladigiKart][1] = pokemons.get(temp).getPokemonAdi();
                break;

            }
            
            

        }
    }

}
