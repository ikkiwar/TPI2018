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
public class PasoporProcedimientoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_paso_procedimiento")
    private int idPasoProcedimiento;
    @Basic(optional = false)
    @Column(name = "id_paso")
    private int idPaso;

    public PasoporProcedimientoPK() {
    }

    public PasoporProcedimientoPK(int idPasoProcedimiento, int idPaso) {
        this.idPasoProcedimiento = idPasoProcedimiento;
        this.idPaso = idPaso;
    }

    public int getIdPasoProcedimiento() {
        return idPasoProcedimiento;
    }

    public void setIdPasoProcedimiento(int idPasoProcedimiento) {
        this.idPasoProcedimiento = idPasoProcedimiento;
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
        hash += (int) idPasoProcedimiento;
        hash += (int) idPaso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PasoporProcedimientoPK)) {
            return false;
        }
        PasoporProcedimientoPK other = (PasoporProcedimientoPK) object;
        if (this.idPasoProcedimiento != other.idPasoProcedimiento) {
            return false;
        }
        if (this.idPaso != other.idPaso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.PasoporProcedimientoPK[ idPasoProcedimiento=" + idPasoProcedimiento + ", idPaso=" + idPaso + " ]";
    }
    
}
