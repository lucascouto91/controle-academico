/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.negocio;

import br.iesb.ead.academico.dados.Aluno;
import br.iesb.ead.academico.dados.AlunoDAO;
import br.iesb.ead.academico.dados.DAO;
import br.iesb.ead.academico.dados.DadosException;



/**
 *
 * @author lucas
 */
public class AlunoBO implements BO<Aluno>{
    @Override
    public void inserir(Aluno entidade) throws NegocioException{
        validar(entidade);
        DAO<Aluno>dao = new AlunoDAO();
        try {
            dao.verificaDadosRepetidos(entidade);
            if(entidade.getMatricula() == entidade.getValidaMatricula()){
                throw new NegocioException("Matricula já cadastrada!");
            }
            if(entidade.getCpf().equals(entidade.getValidaCpf())){
                throw new NegocioException("cpf já cadastrado!");
            }
            dao.inserir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
        
    }
    @Override
    public void alterar(Aluno entidade) throws NegocioException{
        validar(entidade);
        DAO<Aluno>dao = new AlunoDAO();
        try {
            
            dao.alterar(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
        
    }
    @Override
    public void excluir(Aluno entidade) throws NegocioException{
        DAO<Aluno>dao = new AlunoDAO();
        validar(entidade);
        try {
            dao.excluir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
        
    }
    @Override
    public void consultar(Aluno entidade) throws NegocioException{
        DAO<Aluno>dao = new AlunoDAO();
        try {
            dao.consultar(entidade); 
            if(entidade.getValidaCpf()== null ||entidade.getValidaCpf().isEmpty()){
                throw new NegocioException("Esses dados não existe no Banco!");
            }
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
        
        
    }
    @Override
    public void validar(Aluno entidade) throws NegocioException{
        

        if(entidade.getMatricula() == 0 ){
        throw new NegocioException("Matricula não informada!");
        }
        if(entidade.getCpf() == null ||entidade.getCpf().isEmpty()){
        throw new NegocioException("cpf não informado!");
        }
        if(entidade.getNome()== null||entidade.getNome().isEmpty()){
        throw new NegocioException("Nome não informado");
        }
        if(entidade.getCurso()== null||entidade.getCurso().isEmpty()){
        throw new NegocioException("Curso não informado");
        }
        
    }

    
}
