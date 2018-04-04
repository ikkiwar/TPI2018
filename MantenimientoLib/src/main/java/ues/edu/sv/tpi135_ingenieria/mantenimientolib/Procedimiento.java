/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimiento.findAll", query = "SELECT p FROM Procedimiento p")
    , @NamedQuery(name = "Procedimiento.findByIdProcedimiento", query = "SELECT p FROM Procedimiento p WHERE p.procedimientoPK.idProcedimiento = :idProcedimiento")
    , @NamedQuery(name = "Procedimiento.findByIdPaso", query = "SELECT p FROM Procedimiento p WHERE p.procedimientoPK.idPaso = :idPaso")
    , @NamedQuery(name = "Procedimiento.findByProcedimiento", query = "SELECT p FROM Procedimiento p WHERE p.procedimiento = :procedimiento")})
public class Procedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientoPK procedimientoPK;
    @Basic(optional = false)
    private String procedimiento;
    @OneToMany(mappedBy = "procedimiento")
    private List<Paso> pasoList;
    @JoinColumns({
        @JoinColumn(name = "id_diagnostico_parte_Diagnostico_por_parte", referencedColumnName = "id_diagnostico_parte")
        , @JoinColumn(name = "id_detalle_equipo_Diagnostico_por_parte", referencedColumnName = "id_detalle_equipo")
        , @JoinColumn(name = "id_procedimiento_Diagnostico_por_parte", referencedColumnName = "id_procedimiento")
        , @JoinColumn(name = "id_diagnostico_Diagnostico_por_parte", referencedColumnName = "id_diagnostico")})
    @ManyToOne
    private Diagnosticoporparte diagnosticoporparte;

    public Procedimiento() {
    }

    public Procedimiento(ProcedimientoPK procedimientoPK) {
        this.procedimientoPK = procedimientoPK;
    }

    public Procedimiento(ProcedimientoPK procedimientoPK, String procedimiento) {
        this.procedimientoPK = procedimientoPK;
        this.procedimiento = procedimiento;
    }

    public Procedimiento(int idProcedimiento, int idPaso) {
        this.procedimientoPK = new ProcedimientoPK(idProcedimiento, idPaso);
    }

    public ProcedimientoPK getProcedimientoPK() {
        return procedimientoPK;
    }

    public void setProcedimientoPK(ProcedimientoPK procedimientoPK) {
        this.procedimientoPK = procedimientoPK;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    @XmlTransient
    public List<Paso> getPasoList() {
        return pasoList;
    }

    public void setPasoList(List<Paso> pasoList) {
        this.pasoList = pasoList;
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
        hash += (procedimientoPK != null ? procedimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimiento)) {
            return false;
        }
        Procedimiento other = (Procedimiento) object;
        if ((this.procedimientoPK == null && other.procedimientoPK != null) || (this.procedimientoPK != null && !this.procedimientoPK.equals(other.procedimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Procedimiento[ procedimientoPK=" + procedimientoPK + " ]";
    }
    
}
