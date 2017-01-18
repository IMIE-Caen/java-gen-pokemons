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
        int i = 1;
        while(tab[0].getPv() > 0 && tab[1].getPv() > 0 ){         
            
            Pokemon pokJoueur = tab[0];
            Pokemon pokAdversaire = tab[1];
            
            // AIE AIE AIE AIE
            
            System.out.println("-----TOUR "+ i +" (JOUEUR)----");
            pokJoueur.attaque(pokAdversaire, pokJoueur.choisirAttaque());
            
            i++;
            
            if(pokJoueur.getPv() == 0 || pokAdversaire.getPv() == 0){
                return;
            }     

            
            
            
            System.out.println("-----TOUR "+ i +"----");
            pokAdversaire.attaque(pokJoueur, new Attaque("ALEATOIRE",
                                                    new Random().nextInt(71)));
            
            i++;
            
         
            
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
