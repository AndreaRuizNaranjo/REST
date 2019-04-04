/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.dao.EquipoDAO;
import org.o7planning.restfulcrud.model.Equipo;

@Path("/Equipo")
public class ServicioEquipo {
    
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    
    public List<Equipo> getEquipo_JSON() {
        List<Equipo> equipos = EquipoDAO.getAllEquipo();
        return equipos;
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    public Equipo addquipo(Equipo eq) {
        return EquipoDAO.addEquipo(eq);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON})
    public Equipo updateEquipo(Equipo eq) {
        return EquipoDAO.updateEquipo(eq);
    }
 
    @DELETE
    @Path("/{EqNo}")
    @Produces({ MediaType.APPLICATION_JSON})
    public void deleteEquipo(@PathParam("EqNo") String EqNo) {
        EquipoDAO.deleteEquipo(EqNo);
    }
 
 
    
}
