package com.java.certification.anotaciones;

import com.java.certification.anotaciones.ianotacion.Validable;
import com.java.certification.anotaciones.ianotacion.Validacion;

@Validable
public class PesonaConAnotaciones {

    @Validacion(mayuscula = true)
    Integer codigo;
    String documentoIdentidad;
    String nombre;
    String apellido;

    public PesonaConAnotaciones() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
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
}
