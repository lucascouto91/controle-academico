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
 * @Override
 * @author lucas
 */
public class AlunoDAO implements DAO<Aluno> {
    @Override
    public void inserir(Aluno entidade) throws DadosException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "INSERT INTO cadastro_aluno(matricula,nome,cpf,curso) values(?,?,?,?);";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setInt(1, entidade.getMatricula());
            consultar.setString(2, entidade.getNome());
            consultar.setString(3, entidade.getCpf());
            consultar.setString(4, entidade.getCurso());
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
    public void alterar(Aluno entidade) throws DadosException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "UPDATE cadastro_aluno SET nome=?,cpf=?,curso=? WHERE matricula =?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setString(1, entidade.getNome());
            consultar.setString(2, entidade.getCpf());
            consultar.setString(3, entidade.getCurso());
            consultar.setInt(4, entidade.getMatricula());
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
    public void excluir(Aluno entidade) throws DadosException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "DELETE FROM cadastro_aluno WHERE matricula = ?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setInt(1, entidade.getMatricula());
            
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
    public void consultar(Aluno entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_aluno;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                int matricula = resultado.getInt("matricula");
                String nome = resultado.getString("nome");
                String cpf = resultado.getString("cpf");
                String curso = resultado.getString("curso");
                
                if(entidade.getMatricula() == matricula){
                    entidade.setValidaMatricula(matricula);
                    entidade.setValidaNome(nome);
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaCurso(curso);
                }
                
                if(entidade.getNome().equalsIgnoreCase(nome)){
                    entidade.setValidaMatricula(matricula);
                    entidade.setValidaNome(nome);
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaCurso(curso);
                }
                
                if(entidade.getCpf().equals(cpf)){
                    entidade.setValidaMatricula(matricula);
                    entidade.setValidaNome(nome);
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaCurso(curso);
                }
                
                if(entidade.getCurso().equalsIgnoreCase(curso)){
                    entidade.setValidaMatricula(matricula);
                    entidade.setValidaNome(nome);
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaCurso(curso);
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
    public void verificaDadosRepetidos(Aluno entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_aluno;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                int matricula = resultado.getInt("matricula");
                String cpf = resultado.getString("cpf");
                
                if(entidade.getMatricula() == matricula){
                entidade.setValidaMatricula(matricula);
                }
                if(entidade.getCpf().equals(cpf)){
                    entidade.setValidaCpf(cpf);
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
