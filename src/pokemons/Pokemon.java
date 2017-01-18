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
public class Pokemon {

    private int pv;
    private String nom;
    public static final String[] NOMS = {"Pikachu", "Carapuce", "Bulbizarre", "Miaouss"};

    public Pokemon(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }

    public Pokemon() {
        /*
        this.nom = NOMS[new Random().nextInt(NOMS.length)];
        this.pv = 15 + new Random().nextInt(11);
        */
        this( NOMS[new Random().nextInt(NOMS.length)] ,
               15 + new Random().nextInt(11) );
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
