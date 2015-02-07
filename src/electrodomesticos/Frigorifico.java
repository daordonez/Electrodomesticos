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
    /**
     * Constructor detallado de clase frigorifico, en el que se utilazan todos los atributos de la clase y los herdeados
     * de la clase Superior (Electrodomesticos)
     * @param nom Nombre 
     * @param mrc Marca del frigorifico
     * @param frigo Frigorias 
     * @param capac Capacidad en valor entero
     * @param congel Dispone o no de congelado (True or False)
     * @param dim Dimensiones expresadas en AnchoXAltura
     * @param matConst Material exterior de construcción
     */
    public Frigorifico(String nom,String mrc,int frigo, int capac, boolean  congel, String dim,String matConst){
        this(nom, mrc, frigo, capac);
        this.congeladorSN = congel;
        this.dimensiones = dim;
        this.materialConst = matConst;
    }

    public int getFrigorias() {
        return frigorias;
    }

    public void setFrigorias(int frigorias) {
        this.frigorias = frigorias;
    }

    public int getCapacLitros() {
        return capacLitros;
    }

    public void setCapacLitros(int capacLitros) {
        this.capacLitros = capacLitros;
    }

    public boolean isCongeladorSN() {
        return congeladorSN;
    }

    public void setCongeladorSN(boolean congeladorSN) {
        this.congeladorSN = congeladorSN;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMaterialConst() {
        return materialConst;
    }

    public void setMaterialConst(String materialConst) {
        this.materialConst = materialConst;
    }
    
    
}
