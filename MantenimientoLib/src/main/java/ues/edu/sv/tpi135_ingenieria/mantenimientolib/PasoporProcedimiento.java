/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "Paso_por_Procedimiento", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PasoporProcedimiento.findAll", query = "SELECT p FROM PasoporProcedimiento p")
    , @NamedQuery(name = "PasoporProcedimiento.findByIdPasoProcedimiento", query = "SELECT p FROM PasoporProcedimiento p WHERE p.pasoporProcedimientoPK.idPasoProcedimiento = :idPasoProcedimiento")
    , @NamedQuery(name = "PasoporProcedimiento.findByIdPaso", query = "SELECT p FROM PasoporProcedimiento p WHERE p.pasoporProcedimientoPK.idPaso = :idPaso")})
public class PasoporProcedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PasoporProcedimientoPK pasoporProcedimientoPK;
    @OneToMany(mappedBy = "pasoporProcedimiento")
    private List<Paso> pasoList;

    public PasoporProcedimiento() {
    }

    public PasoporProcedimiento(PasoporProcedimientoPK pasoporProcedimientoPK) {
        this.pasoporProcedimientoPK = pasoporProcedimientoPK;
    }

    public PasoporProcedimiento(int idPasoProcedimiento, int idPaso) {
        this.pasoporProcedimientoPK = new PasoporProcedimientoPK(idPasoProcedimiento, idPaso);
    }

    public PasoporProcedimientoPK getPasoporProcedimientoPK() {
        return pasoporProcedimientoPK;
    }

    public void setPasoporProcedimientoPK(PasoporProcedimientoPK pasoporProcedimientoPK) {
        this.pasoporProcedimientoPK = pasoporProcedimientoPK;
    }

    @XmlTransient
    public List<Paso> getPasoList() {
        return pasoList;
    }

    public void setPasoList(List<Paso> pasoList) {
        this.pasoList = pasoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasoporProcedimientoPK != null ? pasoporProcedimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PasoporProcedimiento)) {
            return false;
        }
        PasoporProcedimiento other = (PasoporProcedimiento) object;
        if ((this.pasoporProcedimientoPK == null && other.pasoporProcedimientoPK != null) || (this.pasoporProcedimientoPK != null && !this.pasoporProcedimientoPK.equals(other.pasoporProcedimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.PasoporProcedimiento[ pasoporProcedimientoPK=" + pasoporProcedimientoPK + " ]";
    }
    
}
