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
public class AbstractFactory {

    public static void main(String[] args) {
//Loja com máquina da REDE
        FabricaAbstrata maquina1 = new Rede();
        maquina1.criarVisa().executar(30);
        maquina1.criarMasterCard().executar(150);
        maquina1.criarElo().executar(50);
//Loja com máquina da CIELO
        FabricaAbstrata maquina2 = new Cielo();
        maquina2.criarVisa().executar(35);
        maquina2.criarMasterCard().executar(155);
        maquina2.criarElo().executar(55);
    }
}
