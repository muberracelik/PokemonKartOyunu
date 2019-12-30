
public class Pokemon {

    private int pokemonID;
    private String pokemonAdi;
    private String pokemonTip;

    public Pokemon() {
      
    }

    public Pokemon(String pokemonAdi, String pokemonTip) {
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }
    
    public int hasarPuaniGoster(){
        return 0;
    
    }
}
