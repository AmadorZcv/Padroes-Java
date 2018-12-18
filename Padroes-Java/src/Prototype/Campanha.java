/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.List;

/**
 *
 * @author Amador
 */
public class Campanha {

    private String nome;
    private List<Anuncio> anuncios;

    public Campanha() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Campanha object = (Campanha) super.clone();
        if (anuncios != null) {//Clonando os anúncios
            for (int i = 0; i < anuncios.size(); i++) {
                object.getAnuncios().set(i, (Anuncio) anuncios.get(i).clone());
            }
        }
        return object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anúncios da Campanha \"").append(nome).append("\":\n\n");
        for (Anuncio a : anuncios) {
            sb.append(a.toString()).append('\n');
        }
        return sb.toString();
    }
}


