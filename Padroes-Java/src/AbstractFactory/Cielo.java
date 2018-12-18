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
public class Cielo extends FabricaAbstrata {

    @Override
    public Visa criarVisa() {
        return new VisaViaCielo();
    }

    @Override
    public MasterCard criarMasterCard() {
        return new MasterViaCielo();
    }

    @Override
    public Elo criarElo() {
        return new EloViaCielo();
    }

}
