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
public class DetalleMantenimientoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_detalle_mantenimiento")
    private int idDetalleMantenimiento;
    @Basic(optional = false)
    @Column(name = "id_detalle_equipo")
    private int idDetalleEquipo;

    public DetalleMantenimientoPK() {
    }

    public DetalleMantenimientoPK(int idDetalleMantenimiento, int idDetalleEquipo) {
        this.idDetalleMantenimiento = idDetalleMantenimiento;
        this.idDetalleEquipo = idDetalleEquipo;
    }

    public int getIdDetalleMantenimiento() {
        return idDetalleMantenimiento;
    }

    public void setIdDetalleMantenimiento(int idDetalleMantenimiento) {
        this.idDetalleMantenimiento = idDetalleMantenimiento;
    }

    public int getIdDetalleEquipo() {
        return idDetalleEquipo;
    }

    public void setIdDetalleEquipo(int idDetalleEquipo) {
        this.idDetalleEquipo = idDetalleEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDetalleMantenimiento;
        hash += (int) idDetalleEquipo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMantenimientoPK)) {
            return false;
        }
        DetalleMantenimientoPK other = (DetalleMantenimientoPK) object;
        if (this.idDetalleMantenimiento != other.idDetalleMantenimiento) {
            return false;
        }
        if (this.idDetalleEquipo != other.idDetalleEquipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.DetalleMantenimientoPK[ idDetalleMantenimiento=" + idDetalleMantenimiento + ", idDetalleEquipo=" + idDetalleEquipo + " ]";
    }
    
}
