/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.dados;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class Professor implements Serializable{
    private String cpf;
    private String nome;
    private Double salario;
    private String titulacao;
    private String pesquisa;
    
    private String validaCpf;
    private String validaNome;
    private Double validaSalario;
    private String validaTitulacao;
    private String validaPesquisa;

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
/////////////////////////////////////////////////////////

    public String getValidaCpf() {
        return validaCpf;
    }

    public void setValidaCpf(String validaCpf) {
        this.validaCpf = validaCpf;
    }

    public String getValidaNome() {
        return validaNome;
    }

    public void setValidaNome(String validaNome) {
        this.validaNome = validaNome;
    }

    public Double getValidaSalario() {
        return validaSalario;
    }

    public void setValidaSalario(Double validaSalario) {
        this.validaSalario = validaSalario;
    }

    public String getValidaTitulacao() {
        return validaTitulacao;
    }

    public void setValidaTitulacao(String validaTitulacao) {
        this.validaTitulacao = validaTitulacao;
    }

    public String getValidaPesquisa() {
        return validaPesquisa;
    }

    public void setValidaPesquisa(String validaPesquisa) {
        this.validaPesquisa = validaPesquisa;
    }
    
}
    
    
