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
public class Diciplina implements Serializable {
    
    private int codigo;
    private String diciplina;
    private int cargaHoraria;
    
    private int validaCodigo;
    private String validaDiciplina;
    private int validaCargaHoraria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
////////////////////////////////////////////////////////////////////////////
    
    public int getValidaCodigo() {
        return validaCodigo;
    }

    public void setValidaCodigo(int validaCodigo) {
        this.validaCodigo = validaCodigo;
    }

    public String getValidaDiciplina() {
        return validaDiciplina;
    }

    public void setValidaDiciplina(String validaDiciplina) {
        this.validaDiciplina = validaDiciplina;
    }

    public int getValidaCargaHoraria() {
        return validaCargaHoraria;
    }

    public void setValidaCargaHoraria(int validaCargaHoraria) {
        this.validaCargaHoraria = validaCargaHoraria;
    }
    
    
}
