/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesavl;

import java.util.Arrays;

/**
 *
 * @author ejdelacruz
 */
public class ArbolesAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        Nodo raiz = null;
        int v[] = new int[8];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()*100);
        }
        
        System.out.println("Vector" + Arrays.toString(v));
        
        for (int i = 0; i < v.length; i++) {
            raiz = arbol.insertar(raiz, v[i]);
        }
        
        arbol.InOrden(raiz);
    }
    
}
