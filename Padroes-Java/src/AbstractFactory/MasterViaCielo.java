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
public class MasterViaCielo implements MasterCard{

    public boolean executar(double valor) {
        System.out.println("MASTERCARD via CIELO:" + valor);
        return true;
    }
}
