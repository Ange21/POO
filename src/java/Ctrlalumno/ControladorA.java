/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrlalumno;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Angy
 */
@Named(value = "controladorA")
@RequestScoped
public class ControladorA {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String materias;
    

    /**
     * Creates a new instance of ControladorA
     * @return 
     */
   

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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
    
    
     public void datosfinales() {
     final String nombre1 = "Tu Nombre es: " + getNombre() + ".";
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(nombre1));
     final String apellido1 = "Tu Apellido es: " + getApellido() + ".";
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(apellido1));
     final String ciudad1 = "Tu Ciudad es: " + getCiudad() + ".";
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ciudad1));
     final String materias1 = "Tus materias favoritas son: " + getMaterias() + ".";
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(materias1));
  }
    
}
