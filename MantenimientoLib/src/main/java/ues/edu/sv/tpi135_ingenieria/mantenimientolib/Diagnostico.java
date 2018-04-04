/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevin
 */
@Entity
@Table(catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d")
    , @NamedQuery(name = "Diagnostico.findByIdDiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.idDiagnostico = :idDiagnostico")
    , @NamedQuery(name = "Diagnostico.findByDiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.diagnostico = :diagnostico")})
public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_diagnostico")
    private Integer idDiagnostico;
    @Basic(optional = false)
    private String diagnostico;
    @JoinColumns({
        @JoinColumn(name = "id_diagnostico_parte_Diagnostico_por_parte", referencedColumnName = "id_diagnostico_parte")
        , @JoinColumn(name = "id_detalle_equipo_Diagnostico_por_parte", referencedColumnName = "id_detalle_equipo")
        , @JoinColumn(name = "id_procedimiento_Diagnostico_por_parte", referencedColumnName = "id_procedimiento")
        , @JoinColumn(name = "id_diagnostico_Diagnostico_por_parte", referencedColumnName = "id_diagnostico")})
    @ManyToOne
    private Diagnosticoporparte diagnosticoporparte;

    public Diagnostico() {
    }

    public Diagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Diagnostico(Integer idDiagnostico, String diagnostico) {
        this.idDiagnostico = idDiagnostico;
        this.diagnostico = diagnostico;
    }

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Diagnosticoporparte getDiagnosticoporparte() {
        return diagnosticoporparte;
    }

    public void setDiagnosticoporparte(Diagnosticoporparte diagnosticoporparte) {
        this.diagnosticoporparte = diagnosticoporparte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.idDiagnostico == null && other.idDiagnostico != null) || (this.idDiagnostico != null && !this.idDiagnostico.equals(other.idDiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Diagnostico[ idDiagnostico=" + idDiagnostico + " ]";
    }
    
}
