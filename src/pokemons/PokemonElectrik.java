/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

import java.util.Random;

/**
 *
 * @author clement
 */
public class PokemonElectrik extends Pokemon{
    public static final String[] NOMS = {"Pikachu", "Magneti"};
    
    public PokemonElectrik(String nom, int pv){
        super(nom, pv);
    }
    
    public PokemonElectrik() {
        super( NOMS[new Random().nextInt(NOMS.length)] ,
               15 + new Random().nextInt(11) );
    }
    
}
