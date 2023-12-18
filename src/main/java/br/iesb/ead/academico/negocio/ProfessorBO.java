/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.negocio;

import br.iesb.ead.academico.dados.DAO;
import br.iesb.ead.academico.dados.DadosException;
import br.iesb.ead.academico.dados.Professor;
import br.iesb.ead.academico.dados.ProfessorDAO;

/**
 *
 * @author lucas
 */
public class ProfessorBO implements BO<Professor>{

    @Override
    public void inserir(Professor entidade) throws NegocioException {
        validar(entidade);
        DAO<Professor>dao = new ProfessorDAO();
        try {
            dao.verificaDadosRepetidos(entidade);
            if(entidade.getCpf().equals(entidade.getValidaCpf())){
                throw new NegocioException("CPF já cadastrado!");
            }
            
            
            dao.inserir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void alterar(Professor entidade) throws NegocioException {
        validar(entidade);
        DAO<Professor>dao = new ProfessorDAO();
        try {
            validar(entidade);
            dao.alterar(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void excluir(Professor entidade) throws NegocioException {
        DAO<Professor>dao = new ProfessorDAO();
        validar(entidade);
        try {
            dao.excluir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void validar(Professor entidade) throws NegocioException {
        
        
        if(entidade.getCpf() == null ||entidade.getCpf().isEmpty()){
        throw new NegocioException("cpf não informado!");
        }
        if(entidade.getNome()== null||entidade.getNome().isEmpty()){
        throw new NegocioException("Nome não informado");
        }
        if(entidade.getSalario() == 0 ){
        throw new NegocioException("Salario não informado!");
        }
        if(entidade.getTitulacao()== null||entidade.getTitulacao().isEmpty()){
        throw new NegocioException("Titulacao não informado");
        }
        if(entidade.getPesquisa()== null||entidade.getPesquisa().isEmpty()){
        throw new NegocioException("Pesquisa não informado");
        }
    }

    @Override
    public void consultar(Professor entidade) throws NegocioException {
        DAO<Professor>dao = new ProfessorDAO();
        try {
            dao.consultar(entidade);
            
            if(entidade.getValidaCpf()== null||entidade.getValidaNome().isEmpty()){
                throw new NegocioException("Esses dados não existe no Banco");
            }
            
            /*
            if(entidade.getCpf()== null||entidade.getCpf().isEmpty()){
            throw new NegocioException("CPF não Informado!"); 
            } 
            */
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }
    
}
