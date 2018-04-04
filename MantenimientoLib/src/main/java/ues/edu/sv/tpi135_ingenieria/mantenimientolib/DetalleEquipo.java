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
@Table(name = "Detalle_Equipo", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleEquipo.findAll", query = "SELECT d FROM DetalleEquipo d")
    , @NamedQuery(name = "DetalleEquipo.findByIdDetalleEquipo", query = "SELECT d FROM DetalleEquipo d WHERE d.idDetalleEquipo = :idDetalleEquipo")
    , @NamedQuery(name = "DetalleEquipo.findByIdEquipo", query = "SELECT d FROM DetalleEquipo d WHERE d.idEquipo = :idEquipo")
    , @NamedQuery(name = "DetalleEquipo.findByDetalleEquipo", query = "SELECT d FROM DetalleEquipo d WHERE d.detalleEquipo = :detalleEquipo")})
public class DetalleEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_detalle_equipo")
    private Integer idDetalleEquipo;
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private int idEquipo;
    @Basic(optional = false)
    @Column(name = "detalle_equipo")
    private String detalleEquipo;
    @JoinColumn(name = "id_equipo_Equipo", referencedColumnName = "id_equipo")
    @ManyToOne
    private Equipo idequipoEquipo;
    @OneToMany(mappedBy = "iddetalleequipoDetalleEquipo")
    private List<Diagnosticoporparte> diagnosticoporparteList;

    public DetalleEquipo() {
    }

    public DetalleEquipo(Integer idDetalleEquipo) {
        this.idDetalleEquipo = idDetalleEquipo;
    }

    public DetalleEquipo(Integer idDetalleEquipo, int idEquipo, String detalleEquipo) {
        this.idDetalleEquipo = idDetalleEquipo;
        this.idEquipo = idEquipo;
        this.detalleEquipo = detalleEquipo;
    }

    public Integer getIdDetalleEquipo() {
        return idDetalleEquipo;
    }

    public void setIdDetalleEquipo(Integer idDetalleEquipo) {
        this.idDetalleEquipo = idDetalleEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getDetalleEquipo() {
        return detalleEquipo;
    }

    public void setDetalleEquipo(String detalleEquipo) {
        this.detalleEquipo = detalleEquipo;
    }

    public Equipo getIdequipoEquipo() {
        return idequipoEquipo;
    }

    public void setIdequipoEquipo(Equipo idequipoEquipo) {
        this.idequipoEquipo = idequipoEquipo;
    }

    @XmlTransient
    public List<Diagnosticoporparte> getDiagnosticoporparteList() {
        return diagnosticoporparteList;
    }

    public void setDiagnosticoporparteList(List<Diagnosticoporparte> diagnosticoporparteList) {
        this.diagnosticoporparteList = diagnosticoporparteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleEquipo != null ? idDetalleEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleEquipo)) {
            return false;
        }
        DetalleEquipo other = (DetalleEquipo) object;
        if ((this.idDetalleEquipo == null && other.idDetalleEquipo != null) || (this.idDetalleEquipo != null && !this.idDetalleEquipo.equals(other.idDetalleEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.DetalleEquipo[ idDetalleEquipo=" + idDetalleEquipo + " ]";
    }
    
}
