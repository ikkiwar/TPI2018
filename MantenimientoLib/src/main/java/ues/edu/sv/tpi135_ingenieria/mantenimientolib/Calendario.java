/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "Calendario.findAll", query = "SELECT c FROM Calendario c")
    , @NamedQuery(name = "Calendario.findByIdCalendario", query = "SELECT c FROM Calendario c WHERE c.idCalendario = :idCalendario")
    , @NamedQuery(name = "Calendario.findByFechaProgramada", query = "SELECT c FROM Calendario c WHERE c.fechaProgramada = :fechaProgramada")
    , @NamedQuery(name = "Calendario.findByDescripcionCalendario", query = "SELECT c FROM Calendario c WHERE c.descripcionCalendario = :descripcionCalendario")})
public class Calendario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_calendario")
    private Integer idCalendario;
    @Basic(optional = false)
    @Column(name = "fecha_programada")
    @Temporal(TemporalType.DATE)
    private Date fechaProgramada;
    @Basic(optional = false)
    @Column(name = "descripcion_calendario")
    private String descripcionCalendario;
    @OneToMany(mappedBy = "idcalendarioCalendario")
    private List<Excepcionescalendario> excepcionescalendarioList;

    public Calendario() {
    }

    public Calendario(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Calendario(Integer idCalendario, Date fechaProgramada, String descripcionCalendario) {
        this.idCalendario = idCalendario;
        this.fechaProgramada = fechaProgramada;
        this.descripcionCalendario = descripcionCalendario;
    }

    public Integer getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getDescripcionCalendario() {
        return descripcionCalendario;
    }

    public void setDescripcionCalendario(String descripcionCalendario) {
        this.descripcionCalendario = descripcionCalendario;
    }

    @XmlTransient
    public List<Excepcionescalendario> getExcepcionescalendarioList() {
        return excepcionescalendarioList;
    }

    public void setExcepcionescalendarioList(List<Excepcionescalendario> excepcionescalendarioList) {
        this.excepcionescalendarioList = excepcionescalendarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalendario != null ? idCalendario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendario)) {
            return false;
        }
        Calendario other = (Calendario) object;
        if ((this.idCalendario == null && other.idCalendario != null) || (this.idCalendario != null && !this.idCalendario.equals(other.idCalendario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Calendario[ idCalendario=" + idCalendario + " ]";
    }
    
}
