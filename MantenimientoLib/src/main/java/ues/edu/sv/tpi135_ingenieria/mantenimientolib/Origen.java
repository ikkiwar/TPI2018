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
@Table(catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Origen.findAll", query = "SELECT o FROM Origen o")
    , @NamedQuery(name = "Origen.findByIdOrigen", query = "SELECT o FROM Origen o WHERE o.idOrigen = :idOrigen")
    , @NamedQuery(name = "Origen.findByOrigen", query = "SELECT o FROM Origen o WHERE o.origen = :origen")})
public class Origen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_origen")
    private Integer idOrigen;
    @Basic(optional = false)
    private String origen;
    @OneToMany(mappedBy = "idorigenOrigen")
    private List<Peticion> peticionList;

    public Origen() {
    }

    public Origen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public Origen(Integer idOrigen, String origen) {
        this.idOrigen = idOrigen;
        this.origen = origen;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @XmlTransient
    public List<Peticion> getPeticionList() {
        return peticionList;
    }

    public void setPeticionList(List<Peticion> peticionList) {
        this.peticionList = peticionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrigen != null ? idOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Origen)) {
            return false;
        }
        Origen other = (Origen) object;
        if ((this.idOrigen == null && other.idOrigen != null) || (this.idOrigen != null && !this.idOrigen.equals(other.idOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Origen[ idOrigen=" + idOrigen + " ]";
    }
    
}
