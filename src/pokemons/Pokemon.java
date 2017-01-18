/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

/**
 *
 * @author clement
 */
public class Pokemon {

    private int pv;
    private String nom;

    public Pokemon(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
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
