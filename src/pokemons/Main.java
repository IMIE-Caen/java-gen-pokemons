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
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pokemon carapuce = new Pokemon("Carapuce", 20);
        Pokemon miaouss = new Pokemon("Miaouss", 20);
        
        
        
        
        Combat combat1 = new Combat( carapuce, miaouss );
        
        echo(combat1);
        combat1.doCombat();
        echo(combat1);
      
    }
    
    
    public static void echo(Object obj){
        System.out.println(obj);    
    }
    
}
