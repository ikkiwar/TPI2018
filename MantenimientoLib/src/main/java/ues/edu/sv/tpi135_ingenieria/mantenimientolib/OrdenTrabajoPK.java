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
public class OrdenTrabajoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_orden_trabajo")
    private int idOrdenTrabajo;
    @Basic(optional = false)
    private int dui;
    @Basic(optional = false)
    @Column(name = "id_tipo_mantenimiento")
    private int idTipoMantenimiento;
    @Basic(optional = false)
    @Column(name = "id_detalle_mantenimiento")
    private int idDetalleMantenimiento;
    @Basic(optional = false)
    @Column(name = "id_diagnostico")
    private int idDiagnostico;
    @Basic(optional = false)
    @Column(name = "id_peticion")
    private int idPeticion;
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private int idEquipo;
    @Basic(optional = false)
    @Column(name = "id_estado")
    private int idEstado;

    public OrdenTrabajoPK() {
    }

    public OrdenTrabajoPK(int idOrdenTrabajo, int dui, int idTipoMantenimiento, int idDetalleMantenimiento, int idDiagnostico, int idPeticion, int idEquipo, int idEstado) {
        this.idOrdenTrabajo = idOrdenTrabajo;
        this.dui = dui;
        this.idTipoMantenimiento = idTipoMantenimiento;
        this.idDetalleMantenimiento = idDetalleMantenimiento;
        this.idDiagnostico = idDiagnostico;
        this.idPeticion = idPeticion;
        this.idEquipo = idEquipo;
        this.idEstado = idEstado;
    }

    public int getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(int idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public int getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(int idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    public int getIdDetalleMantenimiento() {
        return idDetalleMantenimiento;
    }

    public void setIdDetalleMantenimiento(int idDetalleMantenimiento) {
        this.idDetalleMantenimiento = idDetalleMantenimiento;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(int idPeticion) {
        this.idPeticion = idPeticion;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrdenTrabajo;
        hash += (int) dui;
        hash += (int) idTipoMantenimiento;
        hash += (int) idDetalleMantenimiento;
        hash += (int) idDiagnostico;
        hash += (int) idPeticion;
        hash += (int) idEquipo;
        hash += (int) idEstado;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajoPK)) {
            return false;
        }
        OrdenTrabajoPK other = (OrdenTrabajoPK) object;
        if (this.idOrdenTrabajo != other.idOrdenTrabajo) {
            return false;
        }
        if (this.dui != other.dui) {
            return false;
        }
        if (this.idTipoMantenimiento != other.idTipoMantenimiento) {
            return false;
        }
        if (this.idDetalleMantenimiento != other.idDetalleMantenimiento) {
            return false;
        }
        if (this.idDiagnostico != other.idDiagnostico) {
            return false;
        }
        if (this.idPeticion != other.idPeticion) {
            return false;
        }
        if (this.idEquipo != other.idEquipo) {
            return false;
        }
        if (this.idEstado != other.idEstado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.OrdenTrabajoPK[ idOrdenTrabajo=" + idOrdenTrabajo + ", dui=" + dui + ", idTipoMantenimiento=" + idTipoMantenimiento + ", idDetalleMantenimiento=" + idDetalleMantenimiento + ", idDiagnostico=" + idDiagnostico + ", idPeticion=" + idPeticion + ", idEquipo=" + idEquipo + ", idEstado=" + idEstado + " ]";
    }
    
}
