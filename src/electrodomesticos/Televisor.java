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
public class Televisor extends Electrodomesticos{
    
    private float tamPantalla;
    private String resolucion;
    private boolean plasmaSN;
    private String conexion1;
    private String conexion2;
    
    //Constructores

    /**
     * Constructor simple. Especifique nombre, marca y tamaño de pantalla de manera decimal
     * @param nombre  Nombre 
     * @param marca Marca
     * @param tPant Tamaño de pantalla de forma decimal.
     */
        public Televisor(String nombre, String marca, float tPant){
        super(nombre, marca);
        this.tamPantalla = tPant;
    }
    /**
     * Constructor por defecto. Crea el objeto televisor teniendo en
     * cuenta solo el nombre, marca, tamaño de pantalla y resolución. Los demas
     * valores los inicializa con valores por defecto.
     * @param nombre - Nombre del objeto
     * @param marca - Marca
     * @param tPant - Tamaño de pantalla
     * @param resol  - Resolución --> especifica solamente "HD", "FullHD".
     */
    public Televisor(String nombre,String marca,float tPant, String resol){
        super(nombre, marca);
        this.tamPantalla = tPant;
        this.resolucion = resol;
        //Inicialización del resto de valores 
        this.plasmaSN = true;
        this.conexion1 = null;
        this.conexion1 = null;
    }
    /**
     * Constructor completo. Todos los atributos del objeto televisor, que incluyen:
     * Nombre, marca, tamaño de pantalla, resolución, plasma (Si/No), y dos tipos de 
     * conexiones relevantes, Ej: HDMI, VGA, Sonido óptico...
     * @param nombre
     * @param marca
     * @param tPant En forma decimal y en pulgadas introduzca tamaño.
     * @param resol Resolución --> especifica solamente "HD", "FullHD".
     * @param plasma Indica si es pantalla de plasma o no. Por defecto TRUE
     * @param conex1 Conexión relevante 1
     * @param conex2 Conexión relevante 2
     */
    public Televisor(String nombre, String marca,float tPant, String resol, boolean plasma, String conex1, String conex2){
        this(nombre, marca, tPant, resol);
        this.plasmaSN = plasma;
        this.conexion1 = conex1;
        this.conexion2 = conex2;
    }
    
    //Metodos
    public void Mostrar(){
    super.mostrar();
        System.out.println("Marca: "+getMarca());
        System.out.println("Tamaño Pantalla: "+this.tamPantalla);
        System.out.println("Resolución: "+this.resolucion);
        System.out.println("Plasma: "+this.plasmaSN);
    }
    //Interfaz - Modificadores 

    public float getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(float tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPlasmaSN() {
        return plasmaSN;
    }

    public void setPlasmaSN(boolean plasmaSN) {
        this.plasmaSN = plasmaSN;
    }

    public String getConexion1() {
        return conexion1;
    }

    public void setConexion1(String conexion1) {
        this.conexion1 = conexion1;
    }

    public String getConexion2() {
        return conexion2;
    }

    public void setConexion2(String conexion2) {
        this.conexion2 = conexion2;
    }
    
}
