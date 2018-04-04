/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kevin
 */
@Entity
@Table(name = "Diagnostico_por_parte", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnosticoporparte.findAll", query = "SELECT d FROM Diagnosticoporparte d")
    , @NamedQuery(name = "Diagnosticoporparte.findByIdDiagnosticoParte", query = "SELECT d FROM Diagnosticoporparte d WHERE d.diagnosticoporpartePK.idDiagnosticoParte = :idDiagnosticoParte")
    , @NamedQuery(name = "Diagnosticoporparte.findByIdDetalleEquipo", query = "SELECT d FROM Diagnosticoporparte d WHERE d.diagnosticoporpartePK.idDetalleEquipo = :idDetalleEquipo")
    , @NamedQuery(name = "Diagnosticoporparte.findByIdProcedimiento", query = "SELECT d FROM Diagnosticoporparte d WHERE d.diagnosticoporpartePK.idProcedimiento = :idProcedimiento")
    , @NamedQuery(name = "Diagnosticoporparte.findByIdDiagnostico", query = "SELECT d FROM Diagnosticoporparte d WHERE d.diagnosticoporpartePK.idDiagnostico = :idDiagnostico")
    , @NamedQuery(name = "Diagnosticoporparte.findByDiagnosticoParte", query = "SELECT d FROM Diagnosticoporparte d WHERE d.diagnosticoParte = :diagnosticoParte")})
public class Diagnosticoporparte implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticoporpartePK diagnosticoporpartePK;
    @Basic(optional = false)
    @Column(name = "diagnostico_parte")
    private String diagnosticoParte;
    @OneToMany(mappedBy = "diagnosticoporparte")
    private List<Diagnostico> diagnosticoList;
    @OneToMany(mappedBy = "diagnosticoporparte")
    private List<Procedimiento> procedimientoList;
    @JoinColumn(name = "id_detalle_equipo_Detalle_Equipo", referencedColumnName = "id_detalle_equipo")
    @ManyToOne
    private DetalleEquipo iddetalleequipoDetalleEquipo;

    public Diagnosticoporparte() {
    }

    public Diagnosticoporparte(DiagnosticoporpartePK diagnosticoporpartePK) {
        this.diagnosticoporpartePK = diagnosticoporpartePK;
    }

    public Diagnosticoporparte(DiagnosticoporpartePK diagnosticoporpartePK, String diagnosticoParte) {
        this.diagnosticoporpartePK = diagnosticoporpartePK;
        this.diagnosticoParte = diagnosticoParte;
    }

    public Diagnosticoporparte(int idDiagnosticoParte, int idDetalleEquipo, int idProcedimiento, int idDiagnostico) {
        this.diagnosticoporpartePK = new DiagnosticoporpartePK(idDiagnosticoParte, idDetalleEquipo, idProcedimiento, idDiagnostico);
    }

    public DiagnosticoporpartePK getDiagnosticoporpartePK() {
        return diagnosticoporpartePK;
    }

    public void setDiagnosticoporpartePK(DiagnosticoporpartePK diagnosticoporpartePK) {
        this.diagnosticoporpartePK = diagnosticoporpartePK;
    }

    public String getDiagnosticoParte() {
        return diagnosticoParte;
    }

    public void setDiagnosticoParte(String diagnosticoParte) {
        this.diagnosticoParte = diagnosticoParte;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    @XmlTransient
    public List<Procedimiento> getProcedimientoList() {
        return procedimientoList;
    }

    public void setProcedimientoList(List<Procedimiento> procedimientoList) {
        this.procedimientoList = procedimientoList;
    }

    public DetalleEquipo getIddetalleequipoDetalleEquipo() {
        return iddetalleequipoDetalleEquipo;
    }

    public void setIddetalleequipoDetalleEquipo(DetalleEquipo iddetalleequipoDetalleEquipo) {
        this.iddetalleequipoDetalleEquipo = iddetalleequipoDetalleEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticoporpartePK != null ? diagnosticoporpartePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnosticoporparte)) {
            return false;
        }
        Diagnosticoporparte other = (Diagnosticoporparte) object;
        if ((this.diagnosticoporpartePK == null && other.diagnosticoporpartePK != null) || (this.diagnosticoporpartePK != null && !this.diagnosticoporpartePK.equals(other.diagnosticoporpartePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Diagnosticoporparte[ diagnosticoporpartePK=" + diagnosticoporpartePK + " ]";
    }
    
}
