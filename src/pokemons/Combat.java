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
public class Combat {
    private Pokemon[] tab = new Pokemon[2];

    public Combat(Pokemon pok1, Pokemon pok2) {
        this.tab[0] = pok1;
        this.tab[1] = pok2;
    }

    public void doCombat(){
        while(tab[0].getPv() > 0 && tab[1].getPv() > 0 ){
            for(Pokemon pok : tab){
               int valeurDegat = new Random().nextInt(4);
               Main.echo(pok + " perd " + valeurDegat + "pv");
               pok.degat(valeurDegat);
            }
        }
    }
    
    
    
    @Override
    public String toString() {
        
        return tab[0] + " CONTRE " + tab[1];
        
    }
    
}
