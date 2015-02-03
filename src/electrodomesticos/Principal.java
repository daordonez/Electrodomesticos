/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

/**
 *
 * @author diegordonez
 */
public class Principal {
    public static void main(String[] args) {
        //Incio del programa
        
        Televisor tvSalon = new Televisor("Salon", "LG", 23);
        
        tvSalon.setPlasmaSN(true);
        
        //Nuevo electrodomestico
        
        Electrodomesticos licuadora1 = new  
        Electrodomesticos("Licuadora", "Philips", 3, "Cocina", "Alimentos", "Bueno", 100);
        
        licuadora1.mostrar();
        tvSalon.Mostrar();
    }
}
