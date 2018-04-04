/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevin
 */
@Entity
@Table(name = "Excepciones_calendario", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Excepcionescalendario.findAll", query = "SELECT e FROM Excepcionescalendario e")
    , @NamedQuery(name = "Excepcionescalendario.findByIdExcepcionesCalendario", query = "SELECT e FROM Excepcionescalendario e WHERE e.excepcionescalendarioPK.idExcepcionesCalendario = :idExcepcionesCalendario")
    , @NamedQuery(name = "Excepcionescalendario.findByIdCalendario", query = "SELECT e FROM Excepcionescalendario e WHERE e.excepcionescalendarioPK.idCalendario = :idCalendario")
    , @NamedQuery(name = "Excepcionescalendario.findByExcepcionCalendario", query = "SELECT e FROM Excepcionescalendario e WHERE e.excepcionCalendario = :excepcionCalendario")
    , @NamedQuery(name = "Excepcionescalendario.findByDescripcionExcepcion", query = "SELECT e FROM Excepcionescalendario e WHERE e.descripcionExcepcion = :descripcionExcepcion")})
public class Excepcionescalendario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcepcionescalendarioPK excepcionescalendarioPK;
    @Basic(optional = false)
    @Column(name = "excepcion_calendario")
    @Temporal(TemporalType.DATE)
    private Date excepcionCalendario;
    @Basic(optional = false)
    @Column(name = "descripcion_excepcion")
    private String descripcionExcepcion;
    @JoinColumn(name = "id_calendario_Calendario", referencedColumnName = "id_calendario")
    @ManyToOne
    private Calendario idcalendarioCalendario;

    public Excepcionescalendario() {
    }

    public Excepcionescalendario(ExcepcionescalendarioPK excepcionescalendarioPK) {
        this.excepcionescalendarioPK = excepcionescalendarioPK;
    }

    public Excepcionescalendario(ExcepcionescalendarioPK excepcionescalendarioPK, Date excepcionCalendario, String descripcionExcepcion) {
        this.excepcionescalendarioPK = excepcionescalendarioPK;
        this.excepcionCalendario = excepcionCalendario;
        this.descripcionExcepcion = descripcionExcepcion;
    }

    public Excepcionescalendario(int idExcepcionesCalendario, int idCalendario) {
        this.excepcionescalendarioPK = new ExcepcionescalendarioPK(idExcepcionesCalendario, idCalendario);
    }

    public ExcepcionescalendarioPK getExcepcionescalendarioPK() {
        return excepcionescalendarioPK;
    }

    public void setExcepcionescalendarioPK(ExcepcionescalendarioPK excepcionescalendarioPK) {
        this.excepcionescalendarioPK = excepcionescalendarioPK;
    }

    public Date getExcepcionCalendario() {
        return excepcionCalendario;
    }

    public void setExcepcionCalendario(Date excepcionCalendario) {
        this.excepcionCalendario = excepcionCalendario;
    }

    public String getDescripcionExcepcion() {
        return descripcionExcepcion;
    }

    public void setDescripcionExcepcion(String descripcionExcepcion) {
        this.descripcionExcepcion = descripcionExcepcion;
    }

    public Calendario getIdcalendarioCalendario() {
        return idcalendarioCalendario;
    }

    public void setIdcalendarioCalendario(Calendario idcalendarioCalendario) {
        this.idcalendarioCalendario = idcalendarioCalendario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excepcionescalendarioPK != null ? excepcionescalendarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Excepcionescalendario)) {
            return false;
        }
        Excepcionescalendario other = (Excepcionescalendario) object;
        if ((this.excepcionescalendarioPK == null && other.excepcionescalendarioPK != null) || (this.excepcionescalendarioPK != null && !this.excepcionescalendarioPK.equals(other.excepcionescalendarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Excepcionescalendario[ excepcionescalendarioPK=" + excepcionescalendarioPK + " ]";
    }
    
}
