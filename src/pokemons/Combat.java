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
            System.out.println("---------");
            for(Pokemon pok : tab){
               int valeurDegat = new Random().nextInt(4);
               System.out.println(pok + " perd " + valeurDegat + "pv");
               pok.degat(valeurDegat);
               // Pas terrible mais bon
               if(pok.getPv() == 0){
                   return;
               }
            }
            
        }
    }
    
    public Pokemon getVainqueur(){
        if(tab[0].getPv() == 0){
           return tab[1]; 
        }
        else if(tab[1].getPv() == 0){
            return tab[0];
        }
        else {
            return null;
        }
    }
    
    
    
    @Override
    public String toString() {
        
        return tab[0] + " CONTRE " + tab[1];
        
    }
    
}
