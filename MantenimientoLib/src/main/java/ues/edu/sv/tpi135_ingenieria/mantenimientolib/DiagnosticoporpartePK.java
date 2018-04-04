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
public class DiagnosticoporpartePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_diagnostico_parte")
    private int idDiagnosticoParte;
    @Basic(optional = false)
    @Column(name = "id_detalle_equipo")
    private int idDetalleEquipo;
    @Basic(optional = false)
    @Column(name = "id_procedimiento")
    private int idProcedimiento;
    @Basic(optional = false)
    @Column(name = "id_diagnostico")
    private int idDiagnostico;

    public DiagnosticoporpartePK() {
    }

    public DiagnosticoporpartePK(int idDiagnosticoParte, int idDetalleEquipo, int idProcedimiento, int idDiagnostico) {
        this.idDiagnosticoParte = idDiagnosticoParte;
        this.idDetalleEquipo = idDetalleEquipo;
        this.idProcedimiento = idProcedimiento;
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdDiagnosticoParte() {
        return idDiagnosticoParte;
    }

    public void setIdDiagnosticoParte(int idDiagnosticoParte) {
        this.idDiagnosticoParte = idDiagnosticoParte;
    }

    public int getIdDetalleEquipo() {
        return idDetalleEquipo;
    }

    public void setIdDetalleEquipo(int idDetalleEquipo) {
        this.idDetalleEquipo = idDetalleEquipo;
    }

    public int getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(int idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDiagnosticoParte;
        hash += (int) idDetalleEquipo;
        hash += (int) idProcedimiento;
        hash += (int) idDiagnostico;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticoporpartePK)) {
            return false;
        }
        DiagnosticoporpartePK other = (DiagnosticoporpartePK) object;
        if (this.idDiagnosticoParte != other.idDiagnosticoParte) {
            return false;
        }
        if (this.idDetalleEquipo != other.idDetalleEquipo) {
            return false;
        }
        if (this.idProcedimiento != other.idProcedimiento) {
            return false;
        }
        if (this.idDiagnostico != other.idDiagnostico) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.DiagnosticoporpartePK[ idDiagnosticoParte=" + idDiagnosticoParte + ", idDetalleEquipo=" + idDetalleEquipo + ", idProcedimiento=" + idProcedimiento + ", idDiagnostico=" + idDiagnostico + " ]";
    }
    
}
