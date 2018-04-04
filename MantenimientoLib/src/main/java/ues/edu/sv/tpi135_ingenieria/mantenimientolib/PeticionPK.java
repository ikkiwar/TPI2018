/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kevin
 */
@Embeddable
public class PeticionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_peticion")
    private int idPeticion;
    @Basic(optional = false)
    @Column(name = "id_origen")
    private int idOrigen;
    @Basic(optional = false)
    @Column(name = "id_area")
    private int idArea;
    @Basic(optional = false)
    @Column(name = "id_prioridad")
    private int idPrioridad;

    public PeticionPK() {
    }

    public PeticionPK(int idPeticion, int idOrigen, int idArea, int idPrioridad) {
        this.idPeticion = idPeticion;
        this.idOrigen = idOrigen;
        this.idArea = idArea;
        this.idPrioridad = idPrioridad;
    }

    public int getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(int idPeticion) {
        this.idPeticion = idPeticion;
    }

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(int idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPeticion;
        hash += (int) idOrigen;
        hash += (int) idArea;
        hash += (int) idPrioridad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeticionPK)) {
            return false;
        }
        PeticionPK other = (PeticionPK) object;
        if (this.idPeticion != other.idPeticion) {
            return false;
        }
        if (this.idOrigen != other.idOrigen) {
            return false;
        }
        if (this.idArea != other.idArea) {
            return false;
        }
        if (this.idPrioridad != other.idPrioridad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.PeticionPK[ idPeticion=" + idPeticion + ", idOrigen=" + idOrigen + ", idArea=" + idArea + ", idPrioridad=" + idPrioridad + " ]";
    }
    
}
