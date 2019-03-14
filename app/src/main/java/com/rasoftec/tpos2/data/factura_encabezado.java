package com.rasoftec.tpos2.data;

public class factura_encabezado {
    public String getNumeroDpi() {
        return numeroDpi;
    }

    public void setNumeroDpi(String numeroDpi) {
        this.numeroDpi = numeroDpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDpiFrontal() {
        return dpiFrontal;
    }

    public void setDpiFrontal(String dpiFrontal) {
        this.dpiFrontal = dpiFrontal;
    }

    public String getDpiTrasero() {
        return dpiTrasero;
    }

    public void setDpiTrasero(String dpiTrasero) {
        this.dpiTrasero = dpiTrasero;
    }

    String numeroDpi;
    String nombre;
    String nit;
    String direccion="";
    String depto="";
    String municipio="";
    String zona="";
    String email;
    String dpiFrontal;
    String dpiTrasero;

    public factura_encabezado(String numeroDpi, String nombre, String nit, String direccion, String depto, String municipio, String zona, String email, String dpiFrontal, String dpiTrasero) {
        this.numeroDpi = numeroDpi;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.depto = depto;
        this.municipio = municipio;
        this.zona = zona;
        this.email = email;
        this.dpiFrontal = dpiFrontal;
        this.dpiTrasero = dpiTrasero;
    }
}
