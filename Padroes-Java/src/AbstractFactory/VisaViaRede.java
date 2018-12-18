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
public class VisaViaRede implements Visa {

    public boolean executar(double valor) {
        System.out.println("VISA via REDE:" + valor);
        return true;
    }
}
