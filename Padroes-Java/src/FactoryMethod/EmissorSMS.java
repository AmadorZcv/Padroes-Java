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
public class EmissorSMS implements Emissor{
    @Override
    public void envia(String mensagem){
        System.out.println("Via SMS:"+mensagem);
    }
}
