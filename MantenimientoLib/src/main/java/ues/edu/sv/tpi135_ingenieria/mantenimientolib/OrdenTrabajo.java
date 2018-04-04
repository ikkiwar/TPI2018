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
import javax.persistence.JoinColumns;
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
@Table(name = "Orden_Trabajo", catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenTrabajo.findAll", query = "SELECT o FROM OrdenTrabajo o")
    , @NamedQuery(name = "OrdenTrabajo.findByIdOrdenTrabajo", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idOrdenTrabajo = :idOrdenTrabajo")
    , @NamedQuery(name = "OrdenTrabajo.findByDui", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.dui = :dui")
    , @NamedQuery(name = "OrdenTrabajo.findByIdTipoMantenimiento", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idTipoMantenimiento = :idTipoMantenimiento")
    , @NamedQuery(name = "OrdenTrabajo.findByIdDetalleMantenimiento", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idDetalleMantenimiento = :idDetalleMantenimiento")
    , @NamedQuery(name = "OrdenTrabajo.findByIdDiagnostico", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idDiagnostico = :idDiagnostico")
    , @NamedQuery(name = "OrdenTrabajo.findByIdPeticion", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idPeticion = :idPeticion")
    , @NamedQuery(name = "OrdenTrabajo.findByIdEquipo", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idEquipo = :idEquipo")
    , @NamedQuery(name = "OrdenTrabajo.findByIdEstado", query = "SELECT o FROM OrdenTrabajo o WHERE o.ordenTrabajoPK.idEstado = :idEstado")
    , @NamedQuery(name = "OrdenTrabajo.findByFechaOrdenTrabajo", query = "SELECT o FROM OrdenTrabajo o WHERE o.fechaOrdenTrabajo = :fechaOrdenTrabajo")})
public class OrdenTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdenTrabajoPK ordenTrabajoPK;
    @Basic(optional = false)
    @Column(name = "fecha_orden_trabajo")
    @Temporal(TemporalType.DATE)
    private Date fechaOrdenTrabajo;
    @JoinColumns({
        @JoinColumn(name = "id_detalle_mantenimiento_Detalle_Mantenimiento", referencedColumnName = "id_detalle_mantenimiento")
        , @JoinColumn(name = "id_detalle_equipo_Detalle_Mantenimiento", referencedColumnName = "id_detalle_equipo")})
    @ManyToOne
    private DetalleMantenimiento detalleMantenimiento;
    @JoinColumn(name = "id_equipo_Equipo", referencedColumnName = "id_equipo")
    @ManyToOne
    private Equipo idequipoEquipo;
    @JoinColumn(name = "id_estado_Estado", referencedColumnName = "id_estado")
    @ManyToOne
    private Estado idestadoEstado;
    @JoinColumn(name = "dui_Personal_Mantenimiento", referencedColumnName = "dui")
    @ManyToOne
    private PersonalMantenimiento duiPersonalMantenimiento;
    @JoinColumns({
        @JoinColumn(name = "id_peticion_Peticion", referencedColumnName = "id_peticion")
        , @JoinColumn(name = "id_origen_Peticion", referencedColumnName = "id_origen")
        , @JoinColumn(name = "id_area_Peticion", referencedColumnName = "id_area")
        , @JoinColumn(name = "id_prioridad_Peticion", referencedColumnName = "id_prioridad")})
    @OneToOne
    private Peticion peticion;
    @JoinColumn(name = "id_tipo_mantenimiento_Tipo_mantenimiento", referencedColumnName = "id_tipo_mantenimiento")
    @ManyToOne
    private Tipomantenimiento idtipomantenimientoTipomantenimiento;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(OrdenTrabajoPK ordenTrabajoPK) {
        this.ordenTrabajoPK = ordenTrabajoPK;
    }

    public OrdenTrabajo(OrdenTrabajoPK ordenTrabajoPK, Date fechaOrdenTrabajo) {
        this.ordenTrabajoPK = ordenTrabajoPK;
        this.fechaOrdenTrabajo = fechaOrdenTrabajo;
    }

    public OrdenTrabajo(int idOrdenTrabajo, int dui, int idTipoMantenimiento, int idDetalleMantenimiento, int idDiagnostico, int idPeticion, int idEquipo, int idEstado) {
        this.ordenTrabajoPK = new OrdenTrabajoPK(idOrdenTrabajo, dui, idTipoMantenimiento, idDetalleMantenimiento, idDiagnostico, idPeticion, idEquipo, idEstado);
    }

    public OrdenTrabajoPK getOrdenTrabajoPK() {
        return ordenTrabajoPK;
    }

    public void setOrdenTrabajoPK(OrdenTrabajoPK ordenTrabajoPK) {
        this.ordenTrabajoPK = ordenTrabajoPK;
    }

    public Date getFechaOrdenTrabajo() {
        return fechaOrdenTrabajo;
    }

    public void setFechaOrdenTrabajo(Date fechaOrdenTrabajo) {
        this.fechaOrdenTrabajo = fechaOrdenTrabajo;
    }

    public DetalleMantenimiento getDetalleMantenimiento() {
        return detalleMantenimiento;
    }

    public void setDetalleMantenimiento(DetalleMantenimiento detalleMantenimiento) {
        this.detalleMantenimiento = detalleMantenimiento;
    }

    public Equipo getIdequipoEquipo() {
        return idequipoEquipo;
    }

    public void setIdequipoEquipo(Equipo idequipoEquipo) {
        this.idequipoEquipo = idequipoEquipo;
    }

    public Estado getIdestadoEstado() {
        return idestadoEstado;
    }

    public void setIdestadoEstado(Estado idestadoEstado) {
        this.idestadoEstado = idestadoEstado;
    }

    public PersonalMantenimiento getDuiPersonalMantenimiento() {
        return duiPersonalMantenimiento;
    }

    public void setDuiPersonalMantenimiento(PersonalMantenimiento duiPersonalMantenimiento) {
        this.duiPersonalMantenimiento = duiPersonalMantenimiento;
    }

    public Peticion getPeticion() {
        return peticion;
    }

    public void setPeticion(Peticion peticion) {
        this.peticion = peticion;
    }

    public Tipomantenimiento getIdtipomantenimientoTipomantenimiento() {
        return idtipomantenimientoTipomantenimiento;
    }

    public void setIdtipomantenimientoTipomantenimiento(Tipomantenimiento idtipomantenimientoTipomantenimiento) {
        this.idtipomantenimientoTipomantenimiento = idtipomantenimientoTipomantenimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenTrabajoPK != null ? ordenTrabajoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajo)) {
            return false;
        }
        OrdenTrabajo other = (OrdenTrabajo) object;
        if ((this.ordenTrabajoPK == null && other.ordenTrabajoPK != null) || (this.ordenTrabajoPK != null && !this.ordenTrabajoPK.equals(other.ordenTrabajoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.OrdenTrabajo[ ordenTrabajoPK=" + ordenTrabajoPK + " ]";
    }
    
}
