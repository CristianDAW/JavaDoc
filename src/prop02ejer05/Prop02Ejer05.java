/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop02ejer05;

/**
 * @author Cristian
 * @version 1.2.3
 */
public class Prop02Ejer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       satelite tvsat, radsat;
        tvsat = new satelite();
        tvsat.setposicion(34.5, 43.6, 76.8);
        System.out.println("\n\t* La posición del satélite de televisión es :");
        tvsat.printposicion();

        radsat = new satelite(22.0, 45.6, 234.7);
        System.out.println("\t* La posición del satélite de radio es :");
        radsat.printposicion();
        
        
        System.out.println("\t*El satélite ha variado de posición");
        tvsat.variaPosicion(53.87, 28.75);
        tvsat.variaAltura(204.58);
        tvsat.printposicion();
        System.out.println("\t*¿Está el satélite en órbita? " + tvsat.enOrbita());
        
        
    }
}