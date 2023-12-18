/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.negocio;

import br.iesb.ead.academico.dados.Diciplina;
import br.iesb.ead.academico.dados.DiciplinaDAO;
import br.iesb.ead.academico.dados.DAO;
import br.iesb.ead.academico.dados.DadosException;

/**
 *
 * @author lucas
 */
public class DiciplinaBO implements BO<Diciplina>{

    @Override
    public void inserir(Diciplina entidade) throws NegocioException {
        validar(entidade);
        DAO<Diciplina>dao = new DiciplinaDAO();
        try {
            dao.verificaDadosRepetidos(entidade);
            if(entidade.getCodigo() == entidade.getValidaCodigo()){
                throw new NegocioException("Codigo já cadastrado!");
            }
            if(entidade.getDiciplina().equals(entidade.getValidaDiciplina())){
                throw new NegocioException("Diciplina já cadastrada!");
            }
            
            dao.inserir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void alterar(Diciplina entidade) throws NegocioException {
        validar(entidade);
        DAO<Diciplina>dao = new DiciplinaDAO();
        try {
            
            dao.alterar(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void excluir(Diciplina entidade) throws NegocioException {
        DAO<Diciplina>dao = new DiciplinaDAO();
        validar(entidade);
        try {
            dao.excluir(entidade);
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }

    @Override
    public void validar(Diciplina entidade) throws NegocioException {
        
        if(entidade.getCodigo() == 0 ){
        throw new NegocioException("Codigo da Diciplina não informado!");
        }
        if(entidade.getDiciplina() == null ||entidade.getDiciplina().isEmpty()){
        throw new NegocioException("Diciplina não informada!");
        }
        if(entidade.getCargaHoraria()== 0){
        throw new NegocioException("Carga horaria não informada");
        }
       
    }

    @Override
    public void consultar(Diciplina entidade) throws NegocioException {
        DAO<Diciplina>dao = new DiciplinaDAO();
        try {
            dao.consultar(entidade); 
            if(entidade.getValidaDiciplina()== null ||entidade.getValidaDiciplina().isEmpty()){
                throw new NegocioException("Esses dados não existe no Banco!");
            }
            
        } catch (DadosException e) {
            throw new NegocioException(e.getMessage(),e);
        }
    }
    
}
