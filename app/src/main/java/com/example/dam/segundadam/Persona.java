package com.example.dam.segundadam;

import java.io.Serializable;
import java.util.Date;

/* Prototipo de clases en Java
 Clase de tipo POJO: plain old java object
 getter y setter
 Constructor
 toString
 Equals y HashCod
*/
public class Persona implements Serializable, Comparable<Persona>{
    private String nombre, apellidos, nif;
    private Date fechaNacimiento;

    @Override
    public int compareTo(Persona another) {
        return 0;
    }

    public enum Genero{
        femenino,
        masculino
    }

    private Genero sexo;

    public Persona() {
        this("","","",null,null);
    }

    public Persona(String nombre, String apellidos, String nif, Date fechaNacimiento, Genero sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Persona (Persona p){
        this(p.nombre, p.apellidos, p.nif, p.fechaNacimiento, p.sexo);
    }

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (nif != null ? !nif.equals(persona.nif) : persona.nif != null) return false;
        return !(fechaNacimiento != null ? !fechaNacimiento.equals(persona.fechaNacimiento) : persona.fechaNacimiento != null);

    }

    @Override
    public int hashCode() {
        int result = nif != null ? nif.hashCode() : 0;
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
