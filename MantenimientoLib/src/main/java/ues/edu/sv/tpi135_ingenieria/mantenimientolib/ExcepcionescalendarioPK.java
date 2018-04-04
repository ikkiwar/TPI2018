/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kevin
 */
@Embeddable
public class ExcepcionescalendarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_excepciones_calendario")
    private int idExcepcionesCalendario;
    @Basic(optional = false)
    @Column(name = "id_calendario")
    private int idCalendario;

    public ExcepcionescalendarioPK() {
    }

    public ExcepcionescalendarioPK(int idExcepcionesCalendario, int idCalendario) {
        this.idExcepcionesCalendario = idExcepcionesCalendario;
        this.idCalendario = idCalendario;
    }

    public int getIdExcepcionesCalendario() {
        return idExcepcionesCalendario;
    }

    public void setIdExcepcionesCalendario(int idExcepcionesCalendario) {
        this.idExcepcionesCalendario = idExcepcionesCalendario;
    }

    public int getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(int idCalendario) {
        this.idCalendario = idCalendario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idExcepcionesCalendario;
        hash += (int) idCalendario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionescalendarioPK)) {
            return false;
        }
        ExcepcionescalendarioPK other = (ExcepcionescalendarioPK) object;
        if (this.idExcepcionesCalendario != other.idExcepcionesCalendario) {
            return false;
        }
        if (this.idCalendario != other.idCalendario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.ExcepcionescalendarioPK[ idExcepcionesCalendario=" + idExcepcionesCalendario + ", idCalendario=" + idCalendario + " ]";
    }
    
}
