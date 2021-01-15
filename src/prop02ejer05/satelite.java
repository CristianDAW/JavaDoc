/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop02ejer05;

/**
 * @see Prop02Ejer05
 * @author Cristian
 * @version 1.2.3
 */


public class satelite {

    private double paralelo;
    private double meridiano;
    private double distancia_tierra;
    
/**
 * Constructor satelite
 * @param p
 * @param m
 * @param d 
 */
    public satelite(double p, double m, double d) {
        paralelo = p;
        meridiano = m;
        distancia_tierra = d;
    }

    public satelite() {
        meridiano = paralelo = distancia_tierra = 0;
    }
/**
 * establecemos los parametros de posición
 * @param p
 * @param m
 * @param d 
 */
    public void setposicion(double p, double m, double d) {
        paralelo = p;
        meridiano = m;
        distancia_tierra = d;
    }
/**
 * Imprimimos por pantalla posición
 */
    public void printposicion() {
        System.out.println("\tEl satélite se encuentra en el paralelo " + paralelo + " , meridiano " + meridiano + " a una distancia de la tierra de " + distancia_tierra + " Kil\u00a2metros");
    }
    
    //métodos creados
    /**
     * variación de posición
     * @param variap
     * @param variam 
     */
    
    public void variaPosicion(double variap,double variam) {
    paralelo=variap;
    meridiano=variam;
    }
    /**
     * variación de altura
     * @param desplazamiento 
     */
    public void variaAltura(double desplazamiento) {
    distancia_tierra=desplazamiento; 
    }
    /**
     * variable orbita
     * @return orbita 
     */
    public boolean enOrbita() {
    boolean orbita;
    return orbita= distancia_tierra > 0;
    }
}