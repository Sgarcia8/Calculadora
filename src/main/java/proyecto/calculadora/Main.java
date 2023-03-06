/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.calculadora;
import proyecto.calculadora.Vista.Vista;
/**
 *
 * @author sjgar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista calc = new Vista();
        calc.setVisible(true);
        calc.setLocationRelativeTo(null);
    }
    
}
