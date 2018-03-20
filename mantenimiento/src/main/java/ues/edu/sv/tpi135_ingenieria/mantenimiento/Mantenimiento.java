/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimiento;

/**
 *
 * @author esperanza
 */
public class Mantenimiento {

    //Aqui van todas las propiedades del mantenimiento que luego se van a convertir en JSON(?)
    //Todo lo saque de los pdf del aula virtual :v
    private String id_mantenimiento;
    private String historico;
    private String numero_inventario;
    private String marca;
    private String numero_serie;
    private String modelo;
    private String responsable;
    private String OS;
    private String licencia;
    private String version;
    private String observaciones;

    //De aqui en adelante, codigo generado por netbeans
    //Constructo, getters y setters
    public Mantenimiento() {
    }

    public Mantenimiento(String id_mantenimiento, String historico, String numero_inventario,
            String marca, String numero_serie, String modelo, String responsable, String OS,
            String licencia, String version, String observaciones) {
        this.id_mantenimiento = id_mantenimiento;
        this.historico = historico;
        this.numero_inventario = numero_inventario;
        this.marca = marca;
        this.numero_serie = numero_serie;
        this.modelo = modelo;
        this.responsable = responsable;
        this.OS = OS;
        this.licencia = licencia;
        this.version = version;
        this.observaciones = observaciones;
    }

    public String getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(String id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getNumero_inventario() {
        return numero_inventario;
    }

    public void setNumero_inventario(String numero_inventario) {
        this.numero_inventario = numero_inventario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String isLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
