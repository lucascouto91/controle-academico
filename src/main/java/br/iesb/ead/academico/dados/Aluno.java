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
public class Aluno implements Serializable{
    
    private int matricula;
    private String nome;
    private String cpf;
    private String curso;
    private int validaMatricula;
    private String validaNome;
    private String validaCpf;
    private String validaCurso;

    
    public int getMatricula(){
        return matricula; }
    public void setMatricula(int matricula){
        this.matricula = matricula;}
    
    public String getNome(){
        return nome;}
    public void setNome(String nome){
        this.nome = nome;}
    
    public String getCpf(){
        return cpf;}
    public void setCpf(String cpf){
        this.cpf = cpf;}
    
    public String getCurso(){
        return  curso;}
    public void setCurso(String curso){
        this.curso = curso;}
    
    public int getValidaMatricula(){
        return validaMatricula; }
    public void setValidaMatricula(int validaMatricula){
        this.validaMatricula = validaMatricula;}
    
    public String getValidaCpf(){
        return validaCpf;}
    public void setValidaCpf(String validaCpf){
        this.validaCpf = validaCpf;}
    
    public String getValidaNome() {
        return validaNome;}
    public void setValidaNome(String validaNome) {
        this.validaNome = validaNome;}

    public String getValidaCurso() {
        return validaCurso;}
    public void setValidaCurso(String validaCurso) {
        this.validaCurso = validaCurso;}
    
}
