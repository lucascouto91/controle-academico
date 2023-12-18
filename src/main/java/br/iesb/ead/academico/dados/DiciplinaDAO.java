/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class DiciplinaDAO implements DAO<Diciplina>{

    @Override
    public void inserir(Diciplina entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "INSERT INTO cadastro_diciplina(codigo,diciplina,horas) values(?,?,?);";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setInt(1, entidade.getCodigo());
            consultar.setString(2, entidade.getDiciplina());
            consultar.setInt(3, entidade.getCargaHoraria());
            
            consultar.executeUpdate();
            consultar.close();
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar driver JDBC.",e);
        } catch (SQLException e){
            throw new DadosException("Erro ao inserir no banco de dados.",e);
        }
    }

    @Override
    public void alterar(Diciplina entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "UPDATE cadastro_diciplina SET diciplina=?,horas=? WHERE codigo =?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setString(1, entidade.getDiciplina());
            consultar.setInt(2, entidade.getCargaHoraria());
            consultar.setInt(3, entidade.getCodigo());
            consultar.executeUpdate();
            consultar.close();
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar driver JDBC.",e);
        } catch (SQLException e){
            throw new DadosException("Erro ao Alterar no banco de dados.",e);
        }
    }

    @Override
    public void excluir(Diciplina entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "DELETE FROM cadastro_diciplina WHERE codigo = ?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setInt(1, entidade.getCodigo());
            
            consultar.executeUpdate();
            consultar.close();
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar driver JDBC.",e);
        } catch (SQLException e){
            throw new DadosException("Erro ao inserir no banco de dados.",e);
        }
    }

    @Override
    public void verificaDadosRepetidos(Diciplina entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_diciplina;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                int codigo = resultado.getInt("codigo");
                String diciplina = resultado.getString("diciplina");
                
                if(entidade.getCodigo() == codigo){
                entidade.setValidaCodigo(codigo);
                }
                if(entidade.getDiciplina().equals(diciplina)){
                    entidade.setValidaDiciplina(diciplina);
                }
                
            }
            consultar.close();
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar driver JDBC.",e);
        } catch (SQLException e){
            throw new DadosException("Erro ao inserir no banco de dados.",e);
        }
    }

    @Override
    public void consultar(Diciplina entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_diciplina;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                int codigo = resultado.getInt("codigo");
                String diciplina = resultado.getString("diciplina");
                int cargaHoraria = resultado.getInt("horas");
                
                
                if(entidade.getCodigo() == codigo){
                    entidade.setValidaCodigo(codigo);
                    entidade.setValidaDiciplina(diciplina);
                    entidade.setValidaCargaHoraria(cargaHoraria);
                    
                }
                
                if(entidade.getDiciplina().equalsIgnoreCase(diciplina)){
                    entidade.setValidaCodigo(codigo);
                    entidade.setValidaDiciplina(diciplina);
                    entidade.setValidaCargaHoraria(cargaHoraria);
                }
                
                if(entidade.getCargaHoraria()== cargaHoraria){
                    entidade.setValidaCodigo(codigo);
                    entidade.setValidaDiciplina(diciplina);
                    entidade.setValidaCargaHoraria(cargaHoraria);
                }
                
            }
            consultar.close();
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar driver JDBC.",e);
        } catch (SQLException e){
            throw new DadosException("Erro ao inserir no banco de dados.",e);
        }
    }
    
}
