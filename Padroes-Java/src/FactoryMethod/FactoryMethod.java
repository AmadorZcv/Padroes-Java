/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Amador
 */
public class FactoryMethod {

    public static void main(String[] args) {
        EmissorCreator factory = new EmissorCreator();
        Emissor e1 = factory.create(EmissorCreator.SMS);
        e1.envia("Você acabou de realizar compra de R$100,00");
        Emissor e2 = factory.create(EmissorCreator.EMAIL);
        e2.envia("Você acabou de realizar compra de R$100,00");
        Emissor e3 = factory.create(EmissorCreator.JMS);
        e3.envia("Você acabou de realizar compra de R$100,00");
    }
}
