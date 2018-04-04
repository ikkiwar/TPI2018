/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "Personal_Mantenimiento", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonalMantenimiento.findAll", query = "SELECT p FROM PersonalMantenimiento p")
    , @NamedQuery(name = "PersonalMantenimiento.findByDui", query = "SELECT p FROM PersonalMantenimiento p WHERE p.dui = :dui")
    , @NamedQuery(name = "PersonalMantenimiento.findByNombre", query = "SELECT p FROM PersonalMantenimiento p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonalMantenimiento.findByApellido", query = "SELECT p FROM PersonalMantenimiento p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "PersonalMantenimiento.findByTelefono", query = "SELECT p FROM PersonalMantenimiento p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "PersonalMantenimiento.findByEmail", query = "SELECT p FROM PersonalMantenimiento p WHERE p.email = :email")})
public class PersonalMantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer dui;
    @Basic(optional = false)
    private String nombre;
    @Basic(optional = false)
    private String apellido;
    @Basic(optional = false)
    private String telefono;
    @Basic(optional = false)
    private String email;
    @OneToMany(mappedBy = "duiPersonalMantenimiento")
    private List<OrdenTrabajo> ordenTrabajoList;

    public PersonalMantenimiento() {
    }

    public PersonalMantenimiento(Integer dui) {
        this.dui = dui;
    }

    public PersonalMantenimiento(Integer dui, String nombre, String apellido, String telefono, String email) {
        this.dui = dui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getDui() {
        return dui;
    }

    public void setDui(Integer dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (dui != null ? dui.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalMantenimiento)) {
            return false;
        }
        PersonalMantenimiento other = (PersonalMantenimiento) object;
        if ((this.dui == null && other.dui != null) || (this.dui != null && !this.dui.equals(other.dui))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.PersonalMantenimiento[ dui=" + dui + " ]";
    }
    
}
