/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Amador
 */
public class EloViaCielo implements Elo {

    public boolean executar(double valor) {
        System.out.println("ELO via CIELO:" + valor);
        return true;
    }
}
