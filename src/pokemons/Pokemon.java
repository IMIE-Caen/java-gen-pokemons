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
public abstract class Pokemon {

    private int pv;
    private String nom;

    public Pokemon(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }
    
    
    // une à-peu-près-factory
    public static Pokemon pokemonAleatoire() throws Exception{
        String[] tab = { "PokemonElectrik", "PokemonSol" }; 
        
        Class klass = Class.forName("pokemons." + tab[new Random().nextInt(tab.length)]);
        Pokemon pok = (Pokemon)klass.newInstance();
        
        return pok;
    }

    
    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    @Override
    public String toString() {
        return nom + " (" + pv + "pv)";
    }

    public void degat(int variation) {
        this.pv -= variation;
        if(this.pv < 0){
            this.pv= 0;
        }
    }
  
    
}
