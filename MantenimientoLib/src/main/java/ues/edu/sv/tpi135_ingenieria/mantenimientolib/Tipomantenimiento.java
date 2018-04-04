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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Tipo_mantenimiento", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipomantenimiento.findAll", query = "SELECT t FROM Tipomantenimiento t")
    , @NamedQuery(name = "Tipomantenimiento.findByIdTipoMantenimiento", query = "SELECT t FROM Tipomantenimiento t WHERE t.idTipoMantenimiento = :idTipoMantenimiento")
    , @NamedQuery(name = "Tipomantenimiento.findByTipoMantenimiento", query = "SELECT t FROM Tipomantenimiento t WHERE t.tipoMantenimiento = :tipoMantenimiento")})
public class Tipomantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_mantenimiento")
    private Integer idTipoMantenimiento;
    @Basic(optional = false)
    @Column(name = "tipo_mantenimiento")
    private String tipoMantenimiento;
    @OneToMany(mappedBy = "idtipomantenimientoTipomantenimiento")
    private List<OrdenTrabajo> ordenTrabajoList;

    public Tipomantenimiento() {
    }

    public Tipomantenimiento(Integer idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    public Tipomantenimiento(Integer idTipoMantenimiento, String tipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public Integer getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(Integer idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
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
        hash += (idTipoMantenimiento != null ? idTipoMantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipomantenimiento)) {
            return false;
        }
        Tipomantenimiento other = (Tipomantenimiento) object;
        if ((this.idTipoMantenimiento == null && other.idTipoMantenimiento != null) || (this.idTipoMantenimiento != null && !this.idTipoMantenimiento.equals(other.idTipoMantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Tipomantenimiento[ idTipoMantenimiento=" + idTipoMantenimiento + " ]";
    }
    
}
