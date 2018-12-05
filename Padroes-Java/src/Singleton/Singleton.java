/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Amador
 */
public class Singleton {

    public static void main(String[] args) {
        Configuração cfg1 = Configuração.getInstancia();
        Configuração cfg2 = Configuração.getInstancia();
        System.out.println("Objetos iguais? " + cfg1.equals(cfg2));
    }
}
