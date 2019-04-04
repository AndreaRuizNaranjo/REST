/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "Equipo")
@XmlAccessorType(XmlAccessType.FIELD)

public class Equipo 
{
    private String IdEquipo;
    private String NombreEquipo;

    public Equipo() {
       
    }

    public Equipo(String IdEquipo, String NombreEquipo) {
        this.IdEquipo = IdEquipo;
        this.NombreEquipo = NombreEquipo;
    }

 

    public String getIdEquipo() {
        return IdEquipo;
    }

    public void setIdEquipo(String IdEquipo) {
        this.IdEquipo = IdEquipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }
    
}
