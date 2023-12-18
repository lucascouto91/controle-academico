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
public class ProfessorDAO implements DAO<Professor>{

    @Override
    public void inserir(Professor entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "INSERT INTO cadastro_professor(cpf,nome,salario,titulacao,pesquisa) values(?,?,?,?,?);";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setString(1, entidade.getCpf());
            consultar.setString(2, entidade.getNome());
            consultar.setDouble(3, entidade.getSalario());
            consultar.setString(4, entidade.getTitulacao());
            consultar.setString(5, entidade.getPesquisa());
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
    public void alterar(Professor entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "UPDATE cadastro_professor set nome=?,salario=?,titulacao=?,pesquisa=? WHERE cpf =?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setString(1, entidade.getNome());
            consultar.setDouble(2, entidade.getSalario());
            consultar.setString(3, entidade.getTitulacao());
            consultar.setString(4, entidade.getPesquisa());
            consultar.setString(5, entidade.getCpf());
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
    public void excluir(Professor entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "DELETE FROM cadastro_professor WHERE cpf = ?;";
            PreparedStatement consultar = conexao.prepareStatement(sql);
            consultar.setString(1, entidade.getCpf());
            
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
    public void verificaDadosRepetidos(Professor entidade) throws DadosException {
         try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_professor;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                String cpf = resultado.getString("cpf");
                
                
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

    @Override
    public void consultar(Professor entidade) throws DadosException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost/db_iesb","postgres","postgres");
            String sql = "SELECT * FROM cadastro_professor;";
            //Statement consultar = conexao.createStatement();
            PreparedStatement consultar = conexao.prepareStatement(sql);
            ResultSet resultado = consultar.executeQuery();
            while(resultado.next()){
                
                String cpf = resultado.getString("cpf");
                String nome = resultado.getString("nome");
                Double salario = resultado.getDouble("salario");
                String titulacao = resultado.getString("titulacao");
                String pesquisa = resultado.getString("pesquisa");
                
                if(entidade.getCpf().equals(cpf)){
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaNome(nome);
                    entidade.setValidaSalario(salario);
                    entidade.setValidaTitulacao(titulacao);
                    entidade.setValidaPesquisa(pesquisa);
                }
                
                if(entidade.getNome().equalsIgnoreCase(nome)){
                    entidade.setValidaCpf(cpf);
                    entidade.setValidaNome(nome);
                    entidade.setValidaSalario(salario);
                    entidade.setValidaTitulacao(titulacao);
                    entidade.setValidaPesquisa(pesquisa);
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
