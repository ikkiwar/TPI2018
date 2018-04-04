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
public class ProcedimientoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_procedimiento")
    private int idProcedimiento;
    @Basic(optional = false)
    @Column(name = "id_paso")
    private int idPaso;

    public ProcedimientoPK() {
    }

    public ProcedimientoPK(int idProcedimiento, int idPaso) {
        this.idProcedimiento = idProcedimiento;
        this.idPaso = idPaso;
    }

    public int getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(int idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public int getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(int idPaso) {
        this.idPaso = idPaso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProcedimiento;
        hash += (int) idPaso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoPK)) {
            return false;
        }
        ProcedimientoPK other = (ProcedimientoPK) object;
        if (this.idProcedimiento != other.idProcedimiento) {
            return false;
        }
        if (this.idPaso != other.idPaso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.ProcedimientoPK[ idProcedimiento=" + idProcedimiento + ", idPaso=" + idPaso + " ]";
    }
    
}
