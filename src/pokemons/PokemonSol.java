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
public class PokemonSol extends Pokemon{
    public static final String[] NOMS = {"Sabelette", "Taupiqueur", "Phampy"};
    
    public PokemonSol(String nom, int pv){
        super(nom, pv);
    }
    
    public PokemonSol() {
        super( NOMS[new Random().nextInt(NOMS.length)] ,
               15 + new Random().nextInt(11) );
    }
    
}
