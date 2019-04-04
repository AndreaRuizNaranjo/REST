/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Equipo;

/**
 *
 * @author brown
 */
public class EquipoDAO {
    
    private static final HashMap<String, Equipo> empMap = new HashMap<String, Equipo>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Equipo eq1 = new Equipo("Eq1", "Millos");
        Equipo eq2 = new Equipo("Eq2", "Nacional");
        Equipo eq3 = new Equipo("Eq3", "Santa Fe");
 
        empMap.put(eq1.getIdEquipo(), eq1);
        empMap.put(eq2.getIdEquipo(), eq2);
        empMap.put(eq3.getIdEquipo(), eq3);
    }
 
    public static Equipo getEquipo(String EqNo) {
        return empMap.get(EqNo);
    }
 
    public static Equipo addEquipo(Equipo eq) {
        empMap.put(eq.getIdEquipo(), eq);
        return eq;
    }
 
    public static Equipo updateEquipo(Equipo eq) {
        empMap.put(eq.getIdEquipo(), eq);
        return eq;
    }
 
    public static void deleteEquipo(String EqNo) {
        empMap.remove(EqNo);
    }
 
    public static List<Equipo> getAllEquipo() {
        Collection<Equipo> c = empMap.values();
        List<Equipo> list = new ArrayList<Equipo>();
        list.addAll(c);
        return list;
    }
     
    List<Equipo> list;
}
