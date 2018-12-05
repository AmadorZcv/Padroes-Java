/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Amador
 */
public class Configuração {

    private static Configuração instancia;
    //Uma alternativa seria criar a instancia na configuração da classe
    //Ex:  private static Configuração instancia = new Configuração();
    private Map<String, String> propriedades = new HashMap<String, String>();

    private Configuração() {
    }

    public static Configuração getInstancia() {
        //Checar se já temos uma instancia, se não temos que criar uma nova
        if (Configuração.instancia == null) {
            Configuração.instancia = new Configuração();
        }
        return instancia;
    }

    public String getPropriedade(String nomeDaPropriedade) {
        return this.propriedades.get(nomeDaPropriedade);
    }
}
