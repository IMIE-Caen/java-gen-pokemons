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
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Pokemon monPokemon = new PokemonElectrik(PokemonElectrik.NOMS[1], 160);
        
        Attaque a1 = new Attaque("Eclair", 15);
        Attaque a2 = new Attaque("Charge", 10);
        Attaque a3 = new Attaque("Trempette", 0);
        Attaque a4 = new Attaque("Destruction", 150);
        Attaque a5 = new Attaque("Tunnel", 40);
        
        monPokemon.apprendre(a1);
        monPokemon.apprendre(a2);
        monPokemon.apprendre(a3);
        monPokemon.apprendre(a4);
        monPokemon.apprendre(a5);
        
        for(Attaque prout : monPokemon.getAttaques()){
            System.out.println(prout);            
        }
        
        
        Pokemon adversaire = Pokemon.pokemonAleatoire();
       
        monPokemon.attaque(adversaire, a4);
        
        System.out.println(monPokemon);
        System.out.println(adversaire);
        
        
        /*Combat combat1 = new Combat( monPokemon, adversaire );
        
        System.out.println(combat1);
        combat1.doCombat();
        System.out.println("Vainqueur : " + combat1.getVainqueur());
       */
        
    }
    
    
    
}
