
public class Butterfree extends Pokemon {
    private int hasarPuani;
    private boolean kartKullanildiMi;
    
    public Butterfree() {
    }

    public Butterfree(String pokemonAdi, String pokemonTip,int hasarPuani) {
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
