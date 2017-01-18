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
public class Attaque {
    
    private String nom;

    private int force;

    public Attaque(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }
       
    public int getForce() {
        return force;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Attaque " + nom;
    }

}
