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
public class Frigorifico extends Electrodomesticos{
    
    private int frigorias;
    private int capacLitros;
    private boolean congeladorSN;
    private String dimensiones;
    private String materialConst;
    
    //Constructor simple
    public Frigorifico(String nombre,String mrc,int frigor, int capac){
        super(nombre, mrc);
        this.frigorias = frigor;
        this.capacLitros = capac;
        //Valores por defecto
        this.congeladorSN = false;
        this.dimensiones = null;
        this.materialConst = null;
    }
    //Constructor detallado
    public Frigorifico(String nom,String mrc,int frigo, int capac, boolean  congel, String dim,String matConst){
        this(nom, mrc, frigo, capac);
        this.congeladorSN = congel;
        this.dimensiones = dim;
        this.materialConst = matConst;
    }
    
}
