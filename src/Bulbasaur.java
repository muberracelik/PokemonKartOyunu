
public class Bulbasaur extends Pokemon {
    private int hasarPuani;
    private boolean kartKullanildiMi;
    
    public Bulbasaur() {
    }

   public Bulbasaur(String pokemonAdi, String pokemonTip,int hasarPuani) {
        super(pokemonAdi, pokemonTip);
        this.hasarPuani=hasarPuani;
    }

    
    public int getHasarPuani() {
        return hasarPuani;
    }

    
    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    
    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    
    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

     @Override
    public int hasarPuaniGoster() {
       return getHasarPuani();
    }
    
}
