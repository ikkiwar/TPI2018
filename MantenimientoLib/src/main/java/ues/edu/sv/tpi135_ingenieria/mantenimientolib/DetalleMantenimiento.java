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
@Table(name = "Detalle_Mantenimiento", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleMantenimiento.findAll", query = "SELECT d FROM DetalleMantenimiento d")
    , @NamedQuery(name = "DetalleMantenimiento.findByIdDetalleMantenimiento", query = "SELECT d FROM DetalleMantenimiento d WHERE d.detalleMantenimientoPK.idDetalleMantenimiento = :idDetalleMantenimiento")
    , @NamedQuery(name = "DetalleMantenimiento.findByIdDetalleEquipo", query = "SELECT d FROM DetalleMantenimiento d WHERE d.detalleMantenimientoPK.idDetalleEquipo = :idDetalleEquipo")
    , @NamedQuery(name = "DetalleMantenimiento.findByDetalleMantenimiento", query = "SELECT d FROM DetalleMantenimiento d WHERE d.detalleMantenimiento = :detalleMantenimiento")})
public class DetalleMantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleMantenimientoPK detalleMantenimientoPK;
    @Basic(optional = false)
    @Column(name = "detalle_mantenimiento")
    private String detalleMantenimiento;
    @OneToMany(mappedBy = "detalleMantenimiento")
    private List<OrdenTrabajo> ordenTrabajoList;

    public DetalleMantenimiento() {
    }

    public DetalleMantenimiento(DetalleMantenimientoPK detalleMantenimientoPK) {
        this.detalleMantenimientoPK = detalleMantenimientoPK;
    }

    public DetalleMantenimiento(DetalleMantenimientoPK detalleMantenimientoPK, String detalleMantenimiento) {
        this.detalleMantenimientoPK = detalleMantenimientoPK;
        this.detalleMantenimiento = detalleMantenimiento;
    }

    public DetalleMantenimiento(int idDetalleMantenimiento, int idDetalleEquipo) {
        this.detalleMantenimientoPK = new DetalleMantenimientoPK(idDetalleMantenimiento, idDetalleEquipo);
    }

    public DetalleMantenimientoPK getDetalleMantenimientoPK() {
        return detalleMantenimientoPK;
    }

    public void setDetalleMantenimientoPK(DetalleMantenimientoPK detalleMantenimientoPK) {
        this.detalleMantenimientoPK = detalleMantenimientoPK;
    }

    public String getDetalleMantenimiento() {
        return detalleMantenimiento;
    }

    public void setDetalleMantenimiento(String detalleMantenimiento) {
        this.detalleMantenimiento = detalleMantenimiento;
    }

    @XmlTransient
    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleMantenimientoPK != null ? detalleMantenimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMantenimiento)) {
            return false;
        }
        DetalleMantenimiento other = (DetalleMantenimiento) object;
        if ((this.detalleMantenimientoPK == null && other.detalleMantenimientoPK != null) || (this.detalleMantenimientoPK != null && !this.detalleMantenimientoPK.equals(other.detalleMantenimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.DetalleMantenimiento[ detalleMantenimientoPK=" + detalleMantenimientoPK + " ]";
    }
    
}
