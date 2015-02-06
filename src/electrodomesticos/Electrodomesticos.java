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
public class Electrodomesticos {

    //Define los tipos de los que puede ser la clase energetica, cualquiera que no sea dará error
    public enum ClaseEnergetica{A,B,C,D,E,F};
    //Atributos electrodomesticos de interés
    private ClaseEnergetica claseEnergetica;
    private String nombre;
    private String marca;
    private int antiguedad;
    private int consumo ;
    private String lugarCasa ;
    private String uso ;
    private String estado ;

    //constructores
     //Constructor simple
    public Electrodomesticos(String nombre, String marca){
        this.nombre = nombre;
        this.marca = marca;
        //Constructor por defecto, inicializa resto
        this.consumo = 0;
        this.lugarCasa = null;
        this.uso = null;
        this.estado = null;
    }
    //Constructor 2 
    public Electrodomesticos(String nombre, String marca, int antiguedad) {
        this(nombre, marca);
        this.antiguedad = antiguedad;
        
    }

    //constructor 3 con lugar de casa, uso y estado
    public Electrodomesticos(String nombre, String marca, int antiguedad, String lugarCasa, String uso, String estado, int consumo) {
        this(nombre, marca, antiguedad);
        this.lugarCasa = lugarCasa;
        this.uso = uso;
        this.estado = estado;
        this.consumo = consumo;
    }
    
   

    //Intefaz - Modificadores 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getLugarCasa() {
        return lugarCasa;
    }

    public void setLugarCasa(String lugarCasa) {
        this.lugarCasa = lugarCasa;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodo mostrar
    public void mostrar() {
        for (int i = 0; i < 15; i++) {
            System.out.print("*");
            if (i == 14) {
                System.out.println();
            }
        }
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Marca:" + this.marca);
        System.out.println("Antigüedad: " + this.antiguedad);
        System.out.println("Lugar Casa: " + this.lugarCasa);
        System.out.println("Uso: " + this.uso);
        System.out.println("Estdo: " + this.estado);
    }

}
