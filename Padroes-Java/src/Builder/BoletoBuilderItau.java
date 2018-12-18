/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Amador
 */
public class BoletoBuilderItau implements BoletoBuilder {

    private Boleto boleto = new BoletoItau();
    private List<String> sacado = new ArrayList<>();
    private List<String> cedente = new ArrayList<>();
    private String linhaDigitavel;
    private double valor;
    private Date vencimento;

    @Override
    public BoletoBuilder adicionarSacado(String... informacoesSacado) {
        if (informacoesSacado != null) {
            for (int i = 0; i < informacoesSacado.length; i++) {
                sacado.add(informacoesSacado[i]);
            }
        }
        return this;
    }

    @Override
    public BoletoBuilder adicionarCedente(String... informacoesCedente) {
        if (informacoesCedente != null) {
            for (int i = 0; i < informacoesCedente.length; i++) {
                sacado.add(informacoesCedente[i]);
            }
        }
        return this;
    }

    @Override
    public BoletoBuilder adicionarLinhaDigitavel(String informacoesLinhaDigitavel) {
        linhaDigitavel = informacoesLinhaDigitavel;
        return this;
    }

    @Override
    public BoletoBuilder adicionarValor(double valor) {
        this.valor = valor;
        return this;
    }
    @Override
    public BoletoBuilder adicionarVencimento(Date vencimento) {
        this.vencimento = vencimento;
        return this;
    }

    @Override
    public Boleto construir() {
//A ordem muda de acordo com o banco
        if (this.boleto.getConteudo() == null) {
            this.boleto.setConteudo(new ArrayList<String>());
        } else {
            this.boleto.getConteudo().clear();
        }
        this.boleto.getConteudo().add("Boleto do Banco Itau");
        this.boleto.getConteudo().add("Vencimento : " + this.vencimento);
        this.boleto.getConteudo().add("Sacado:");
        this.boleto.getConteudo().addAll(this.sacado);
        this.boleto.getConteudo().add("Cedente:");
        this.boleto.getConteudo().addAll(this.cedente);
        this.boleto.getConteudo().add("### " + this.linhaDigitavel);
        this.boleto.getConteudo().add("Valor : " + this.valor);
        return this.boleto;
    }
}

