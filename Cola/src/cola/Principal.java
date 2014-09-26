/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author matychp
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola unaCola = new Cola();
        
        unaCola.push(1);
        unaCola.push(2);
        unaCola.push(3);
        
        System.out.println(unaCola.toString());
    }
    
}
