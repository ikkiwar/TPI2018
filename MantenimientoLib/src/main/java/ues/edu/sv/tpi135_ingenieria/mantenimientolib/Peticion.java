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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevin
 */
@Entity
@Table(catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peticion.findAll", query = "SELECT p FROM Peticion p")
    , @NamedQuery(name = "Peticion.findByIdPeticion", query = "SELECT p FROM Peticion p WHERE p.peticionPK.idPeticion = :idPeticion")
    , @NamedQuery(name = "Peticion.findByIdOrigen", query = "SELECT p FROM Peticion p WHERE p.peticionPK.idOrigen = :idOrigen")
    , @NamedQuery(name = "Peticion.findByIdArea", query = "SELECT p FROM Peticion p WHERE p.peticionPK.idArea = :idArea")
    , @NamedQuery(name = "Peticion.findByIdPrioridad", query = "SELECT p FROM Peticion p WHERE p.peticionPK.idPrioridad = :idPrioridad")
    , @NamedQuery(name = "Peticion.findByFechaPeticion", query = "SELECT p FROM Peticion p WHERE p.fechaPeticion = :fechaPeticion")
    , @NamedQuery(name = "Peticion.findByDescripcion", query = "SELECT p FROM Peticion p WHERE p.descripcion = :descripcion")})
public class Peticion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeticionPK peticionPK;
    @Basic(optional = false)
    @Column(name = "fecha_peticion")
    @Temporal(TemporalType.DATE)
    private Date fechaPeticion;
    @Basic(optional = false)
    private String descripcion;
    @JoinColumn(name = "id_area_Area", referencedColumnName = "id_area")
    @ManyToOne
    private Area idareaArea;
    @JoinColumn(name = "id_origen_Origen", referencedColumnName = "id_origen")
    @ManyToOne
    private Origen idorigenOrigen;
    @JoinColumn(name = "id_prioridad_Prioridad", referencedColumnName = "id_prioridad")
    @ManyToOne
    private Prioridad idprioridadPrioridad;
    @OneToOne(mappedBy = "peticion")
    private OrdenTrabajo ordenTrabajo;

    public Peticion() {
    }

    public Peticion(PeticionPK peticionPK) {
        this.peticionPK = peticionPK;
    }

    public Peticion(PeticionPK peticionPK, Date fechaPeticion, String descripcion) {
        this.peticionPK = peticionPK;
        this.fechaPeticion = fechaPeticion;
        this.descripcion = descripcion;
    }

    public Peticion(int idPeticion, int idOrigen, int idArea, int idPrioridad) {
        this.peticionPK = new PeticionPK(idPeticion, idOrigen, idArea, idPrioridad);
    }

    public PeticionPK getPeticionPK() {
        return peticionPK;
    }

    public void setPeticionPK(PeticionPK peticionPK) {
        this.peticionPK = peticionPK;
    }

    public Date getFechaPeticion() {
        return fechaPeticion;
    }

    public void setFechaPeticion(Date fechaPeticion) {
        this.fechaPeticion = fechaPeticion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Area getIdareaArea() {
        return idareaArea;
    }

    public void setIdareaArea(Area idareaArea) {
        this.idareaArea = idareaArea;
    }

    public Origen getIdorigenOrigen() {
        return idorigenOrigen;
    }

    public void setIdorigenOrigen(Origen idorigenOrigen) {
        this.idorigenOrigen = idorigenOrigen;
    }

    public Prioridad getIdprioridadPrioridad() {
        return idprioridadPrioridad;
    }

    public void setIdprioridadPrioridad(Prioridad idprioridadPrioridad) {
        this.idprioridadPrioridad = idprioridadPrioridad;
    }

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peticionPK != null ? peticionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peticion)) {
            return false;
        }
        Peticion other = (Peticion) object;
        if ((this.peticionPK == null && other.peticionPK != null) || (this.peticionPK != null && !this.peticionPK.equals(other.peticionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Peticion[ peticionPK=" + peticionPK + " ]";
    }
    
}
