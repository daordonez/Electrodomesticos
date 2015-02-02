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

    //Atributos electrodomesticos de interés
    private String nombre;
    private String marca;
    private int antiguedad;
    private int consumo = 0;
    private String lugarCasa = null;
    private String uso = null;
    private String estado = null;

    //constructores
    //Constructor por defecto simple
    public Electrodomesticos(String nombre, String marca, int antiguedad) {
        this.nombre = nombre;
        this.marca = marca;
        this.antiguedad = antiguedad;
        //Constructor por defecto, inicializa resto
        this.consumo = 0;
        this.lugarCasa = null;
        this.uso = null;
        this.estado = null;
    }

    //Segundo constructor con lugar de casa, uso y estado

    public Electrodomesticos(String nombre, String marca, int antiguedad, String lugarCasa, String uso, String estado) {
        this(nombre, marca, antiguedad);
        this.lugarCasa = lugarCasa;
        this.uso = uso;
        this.estado = estado;
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
