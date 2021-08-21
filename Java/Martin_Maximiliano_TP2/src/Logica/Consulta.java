package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Consulta implements Serializable {
    @Id
    private int nroCliente;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergia;
    private String atencionEspecial;
    private String nombreDueño;
    private String telefono;
    private String observaciones;

    public Consulta() {
    }

    public Consulta(int nroCliente, String nombre, String raza, String color, String alergia, String atencionEspecial, String nombreDuenio, String telefono, String observaciones) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergia = alergia;
        this.atencionEspecial = atencionEspecial;
        this.nombreDueño = nombreDuenio;
        this.telefono = telefono;
        this.observaciones = observaciones;
        
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDuenio) {
        this.nombreDueño = nombreDuenio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
