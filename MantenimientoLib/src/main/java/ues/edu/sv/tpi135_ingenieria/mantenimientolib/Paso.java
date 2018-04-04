/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimientolib;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevin
 */
@Entity
@Table(catalog = "mantenimientoDB", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paso.findAll", query = "SELECT p FROM Paso p")
    , @NamedQuery(name = "Paso.findByIdPaso", query = "SELECT p FROM Paso p WHERE p.idPaso = :idPaso")
    , @NamedQuery(name = "Paso.findByPaso", query = "SELECT p FROM Paso p WHERE p.paso = :paso")})
public class Paso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_paso")
    private Integer idPaso;
    @Basic(optional = false)
    private String paso;
    @JoinColumns({
        @JoinColumn(name = "id_paso_procedimiento_Paso_por_Procedimiento", referencedColumnName = "id_paso_procedimiento")
        , @JoinColumn(name = "id_paso_Paso_por_Procedimiento", referencedColumnName = "id_paso")})
    @ManyToOne
    private PasoporProcedimiento pasoporProcedimiento;
    @JoinColumns({
        @JoinColumn(name = "id_procedimiento_Procedimiento", referencedColumnName = "id_procedimiento")
        , @JoinColumn(name = "id_paso_Procedimiento", referencedColumnName = "id_paso")})
    @ManyToOne
    private Procedimiento procedimiento;

    public Paso() {
    }

    public Paso(Integer idPaso) {
        this.idPaso = idPaso;
    }

    public Paso(Integer idPaso, String paso) {
        this.idPaso = idPaso;
        this.paso = paso;
    }

    public Integer getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(Integer idPaso) {
        this.idPaso = idPaso;
    }

    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }

    public PasoporProcedimiento getPasoporProcedimiento() {
        return pasoporProcedimiento;
    }

    public void setPasoporProcedimiento(PasoporProcedimiento pasoporProcedimiento) {
        this.pasoporProcedimiento = pasoporProcedimiento;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaso != null ? idPaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paso)) {
            return false;
        }
        Paso other = (Paso) object;
        if ((this.idPaso == null && other.idPaso != null) || (this.idPaso != null && !this.idPaso.equals(other.idPaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.tpi135_ingenieria.mantenimientolib.Paso[ idPaso=" + idPaso + " ]";
    }
    
}
