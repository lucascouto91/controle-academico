/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico.negocio;

/**
 *
 * @author lucas
 */
public class NegocioException extends Exception {
    public NegocioException (String message){
    super(message);
    }
    public NegocioException (String message, Throwable cause){
    super(message, cause);
    }
    
}
