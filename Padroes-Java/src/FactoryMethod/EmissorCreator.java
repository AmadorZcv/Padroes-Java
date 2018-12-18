/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 * Essa classe é a real fabrica,que decide qual objeto instanciar
 *
 * @author Amador
 */
public class EmissorCreator {

    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int JMS = 2;

    public Emissor create(int tipoDeEmissor) {
        switch (tipoDeEmissor) {
            case EmissorCreator.SMS:
                return new EmissorSMS();
            case EmissorCreator.EMAIL:
                return new EmissorEmail();
            case EmissorCreator.JMS:
                return new EmissorJMS();
            default:
                throw new IllegalArgumentException(" Tipo de emissor não suportado ");
        }
    }
}
