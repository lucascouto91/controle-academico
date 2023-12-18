/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.dados;

/**
 *
 * @author lucas
 * @param <T>
 */
public interface DAO<T> {
    
    void inserir(T entidade) throws DadosException;
    void alterar(T entidade) throws DadosException;
    void excluir(T entidade) throws DadosException;
    void verificaDadosRepetidos(T entidade) throws DadosException;
    void consultar(T entidade) throws DadosException;
   
    
    //T consultar(int id) throws DadosException;
    
    
    
}
